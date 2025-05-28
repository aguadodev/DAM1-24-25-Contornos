//Autor: Celia Sanmartín Chapela
// Bad Smell: Cadeas de Mensaxes (Message Chains)

/* Este mal cheiro prodúcese cando unha clase accede a métodos dunha cadea de obxectos.
Isto xera alto acoplamento, dificultando o mantemento e facendo o código máis fráxil.
Un cambio interno nunha clase intermedia (por exemplo, Perfil) pode obrigar
a modificar tamén a clase externa (Aplicacion), aínda que non debería coñecer a súa estrutura interna. */
package ud4.a11maloscheiros;

public class CadeaDeMensaxes {
    public static void main(String[] args) {
        Perfil perfil = new Perfil("Laura Fernández");
        Usuario usuario = new Usuario(perfil);
        Sesion sesion = new Sesion(usuario);
        Aplicacion aplicacion = new Aplicacion(sesion);

        aplicacion.mostrarNomeUsuario();
    }

}

class Aplicacion {
    private Sesion sesion;

    public Aplicacion(Sesion sesion) {
        this.sesion = sesion;
    }

    public void mostrarNomeUsuario() {
        // Cadea de mensaxes: accede a obxectos intermedios
        String nome = sesion.getUsuario().getPerfil().getNomeCompleto();
        System.out.println("Usuario actual: " + nome);
    }
}

class Sesion {
    private Usuario usuario;

    public Sesion(Usuario usuario) {
        this.usuario = usuario;
    }

    public Usuario getUsuario() {
        return usuario;
    }
}

class Usuario {
    private Perfil perfil;

    public Usuario(Perfil perfil) {
        this.perfil = perfil;
    }

    public Perfil getPerfil() {
        return perfil;
    }
}

class Perfil {
    private String nomeCompleto;

    public Perfil(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }
}
/*Solución:Este problema solucionaríase evitando o acceso encadeado entre obxectos.
En vez de que Aplicacion chame a sesion.getUsuario().getPerfil().getNomeCompleto(), deberíase 
engadir un método en Sesion que devolva directamente o nome do usuario. Deste xeito, Aplicacion
só se comunica coa clase Sesion, reducindo o acoplamento.

 */ 