package FarmaciaPoo;

public class FarmaciaTeste {
	public static void main(String[] args) {
		Farmacia farmacia1 = new Farmacia("DrogariaPaulista","Rua Antonio,1","São Paulo","FarmaPopular",001);
		System.out.println("\n=========Farmácia=============");
		System.out.println("\n==============================");
		System.out.println(farmacia1.getnomeFarm());
		System.out.println(farmacia1.getEndereco());
		System.out.println(farmacia1.getTipo());
		System.out.println("\n==============================");
		
	}

}
