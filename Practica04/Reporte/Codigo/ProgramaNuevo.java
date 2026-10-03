public class ProgramaNuevo{	
	public static void main(String[] args) {
	
	String producto = "Laptop para la carrera";
	int precio = 15000;
	int descuento = 3000;
	double meses = 18.0;
	int precioConDescuento = (precio - descuento);
	double plazoPagoAnios = (meses / 12.0);
	double pagoMensual = ((precio - descuento) / meses);
	
	System.out.printf("=== Ficha de compra === %n -Producto : %1$s %n - Precio con descuento: %2$d %n -Plazo en anios: %3$f %n -Pago mensual: %4$.2f %n === Fin de la ficha ===", producto, precioConDescuento, plazoPagoAnios, pagoMensual);

	}
}