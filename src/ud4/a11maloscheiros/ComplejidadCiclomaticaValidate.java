package ud4.a11maloscheiros;

public class ComplejidadCiclomaticaValidate {

    public static void main(String[] args) {

        int edad = 50;
        String pais = "España";
        String genero = "M";
        boolean estudiante = true;
        boolean trabajador = false;
        double ingresos = 1500;
        int hijos = 2;
        String estadoCivil = "Soltera";

        verificarDatos(edad, pais, genero, estudiante, trabajador, ingresos, hijos, estadoCivil);

    }

    /**
     * Este método hace validaciones de una gran cantidad de datos. E imprime la información
     * de la persona por pantalla.
     * @param edad
     * @param pais
     * @param genero
     * @param estudiante
     * @param trabajador
     * @param ingresos
     * @param hijos
     * @param estadoCivil
     */
    public static void verificarDatos(int edad, String pais, String genero, boolean estudiante, boolean trabajador,
            double ingresos, int hijos, String estadoCivil) {

        if (edad > 18) {
            if (edad < 65) {
                if (pais.equals("España")) {
                    if (genero.equals("M")) {
                        if (estudiante) {
                            System.out.println("Hombre, estudiante en España.");
                        }
                        if (trabajador) {
                            System.out.println("Hombre, trabajador en España.");
                        }
                        if (ingresos > 2000) {
                            System.out.println("Hombre con buenos ingresos.");
                        }
                    }
                    if (genero.equals("F")) {
                        if (estadoCivil.equals("Soltera")) {
                            if (hijos == 0) {
                                System.out.println("Mujer soltera sin hijos en España.");
                            } else if (hijos == 1) {
                                System.out.println("Mujer soltera con un hijo en España.");
                            } else {
                                System.out.println("Mujer soltera con varios hijos en España.");
                            }
                        }
                        if (estadoCivil.equals("Casada")) {
                            if (trabajador) {
                                if (ingresos < 1000) {
                                    System.out.println("Mujer casada trabajadora con bajos ingresos.");
                                }
                                if (ingresos > 1000 && ingresos < 3000) {
                                    System.out.println("Mujer casada trabajadora con ingresos medios.");
                                }
                                if (ingresos >= 3000) {
                                    System.out.println("Mujer casada trabajadora con buenos ingresos.");
                                }
                            } else {
                                System.out.println("Mujer casada que no trabaja.");
                            }
                        }
                    }
                } else if (pais.equals("Portugal")) {
                    if (edad < 30) {
                        System.out.println("Joven en Portugal.");
                    } else if (edad < 50) {
                        System.out.println("Adulto en Portugal.");
                    } else {
                        System.out.println("Mayor en Portugal.");
                    }
                } else {
                    System.out.println("Persona extranjera.");
                }
            }
        }

        if (edad < 18) {
            if (pais.equals("España")) {
                System.out.println("Menor de edad en España.");
            } else {
                System.out.println("Menor de edad extranjero.");
            }
        }

        if (hijos >= 3 && ingresos < 2000) {
            System.out.println("Familia numerosa con bajos recursos.");
        }

        if (trabajador && estudiante) {
            System.out.println("Persona que estudia y trabaja.");
        }

        if (!trabajador && !estudiante) {
            System.out.println("Persona inactiva.");
        }
    }
}
