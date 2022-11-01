package Factory;

public class Cliente {

	public static void main(String[] args) {
		
		FabricaFiat fiat = new FabricaFiat();
		Carro carro = fiat.criarCarro();
		
		fiat.criarCarro().ExibirInfo();;
		FabricaChevrolet chev = new FabricaChevrolet();
		
		chev.criarCarro().ExibirInfo();

	}

}
