package abstractFactory;

public class Cliente {
	public static void main(String[] args) {
		
	
	FabricaFiat fiat = new FabricaFiat();
	fiat.criarCarroPopular().exibirInfoPopular();
	fiat.criarCarroSedan().exibirInfoSedan();
	
	FabricaFord ford = new FabricaFord();
	ford.criarCarroPopular().exibirInfoPopular();
	
	
	}
}
