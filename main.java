public class main(){
	public static void main (string args[]){
		Conversiones conv = new Conversiones();
        double pesosPrimeros = conv.dollarTopesos(100);
		double pesosSegundos = conv.dollarTopesos(100, 15.50);
		double pesosTerceros = conv.dollarTopesos(100, 15.50, true);
		System.out.println("Valor de mi primera conversion");
		System.out.println(pesosPrimeros);
		System.out.println("Valor de mi segunda conversion");
		System.out.println(pesosSegundos);
		System.out.println("Valor de mi tercera conversion");
		System.out.println(pesosTerceros);
	}
}
