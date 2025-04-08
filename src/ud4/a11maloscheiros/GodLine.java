package ud4.a11maloscheiros;
public class GodLine {
  //A liña de código é moi longa e fai difícil a súa lectura e mantemento.
  public double calcularPrecioFinal(double precioBase, double descuento, double
  impuestos, double promocion, double tasaEnvio, double seguro, double
  cupomDescuento, double comisionVendedor) {
  return (precioBase - descuento + impuestos + promocion + tasaEnvio + seguro -
  cupomDescuento) * (1 - comisionVendedor);}
}
