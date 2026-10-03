public class Programa{	
	public static void main(String[] args) {
	
	// Usamos "String" para declarar variables que contienen letras, osease palabras
	String producto = "Laptop para la carrera";
	// Usamos "int" para declarar variables de tipo números enteros
	int precio = 15000;
	int descuento = 3000;
	// Usamos "double" para declarar variables de tipo número irracional
	double meses = 18.0;

	// El comando "System.out.println()" nos permite mostrar en pantalla el resultado después de correr nuestro programa
	System.out.println("=== Ficha de compra ===");
	// En la siguientes líneas ponemos comillas para indicar que queremos que imprima un mensaje de texto junto a nuestras variables u operaciones, estamos dandole más claridad a nuestro mensaje impreso
	System.out.println("- Producto : " + producto);	
	System.out.println("- Precio con descuento : " + (precio - descuento));
	System.out.println("- Plazo de pago en anios : " + (meses / 12.0));
	System.out.println("- Pago mensual : " + ((precio - descuento) / meses));
	System.out.println("=== Fin de la ficha ===");

	}
}