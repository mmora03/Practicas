public class Cotizador {
	public static void main (String[]args){
		
		String cliente1="Robbie_Valentino";
		int precioCliente1=12899;
		int plazoCliente1=21;
		double interesAnual=0.15;
		char clasificacionCliente1='E';
		double mensualidadesCliente1=(precioCliente1/plazoCliente1);
		double tiempoEnAniosCliente1=(plazoCliente1/12.0);
		double interesCliente1=(precioCliente1*interesAnual*tiempoEnAniosCliente1);
		double precioTotalCliente1=(precioCliente1+interesCliente1);

		System.out.println("cliente1: "+ cliente1);
		System.out.println("clasificacionCliente1: "+ clasificacionCliente1);
		System.out.println("precioTotalCliente1: $"+ precioTotalCliente1);

	}


}