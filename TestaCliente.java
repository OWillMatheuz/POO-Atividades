package ClientePoo;

public class TestaCliente {
	
	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente("Willian","Matheus","06.12.1990",000000,59);
		System.out.println("\n=========Cliente-1============");
		System.out.println("\n==============================");
		System.out.println(cliente1.getNomeCliente());
		System.out.println(cliente1.getSobrenomeCliente());
		System.out.println(cliente1.getDataNasc());
		System.out.println("\n==============================");
		}

}
