//Pablo Cedeira Ballesteros

package ud4.maloscheiros;

public class FacturaCedeira {
    private String cliente;
    private double cantidad;
    private String direccion;
    private String metodoPago;

    // Métodos para calcular descuentos
    public double calcularDescuento() {
        // Lógica para calcular descuentos
        return cantidad * 0.1;
    }

    // Métodos para imprimir la factura
    public void imprimirFactura() {
        System.out.println("Factura para: " + cliente);
        System.out.println("Monto total: " + cantidad);
        System.out.println("Descuento: " + calcularDescuento());
    }

    // Métodos para enviar la factura por correo
    public void enviarFacturaPorCorreo() {
        // Lógica para enviar la factura por correo
        System.out.println("Enviando factura a: " + cliente + " al correo...");
    }

    // Métodos para procesar el pago
    public void procesarPago() {
        // Lógica para procesar el pago
        System.out.println("Procesando pago de: " + cantidad);
    }

    // Métodos para verificar el estado del cliente
    public void verificarEstadoCliente() {
        // Lógica para verificar si el cliente está habilitado para realizar compras
        System.out.println("Verificando estado de cliente...");
    }

    // Métodos para gestionar la dirección de envío
    public void gestionarDireccionEnvio() {
        // Lógica para gestionar la dirección de envío
        System.out.println("Enviando a: " + direccion);
    }

    // Métodos para todo lo que hace la clase
    public void realizarTodo() {
        // Esta clase hace de todo: imprimir, enviar por correo, procesar pagos, etc.
        imprimirFactura();
        enviarFacturaPorCorreo();
        procesarPago();
        verificarEstadoCliente();
        gestionarDireccionEnvio();
    }
}