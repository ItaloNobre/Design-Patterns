package abstractFactory;

public class FabricaFiat implements FabricaDeCarros {

	@Override
	public CarroSedan criarCarroSedan() {
		
		return new Siena();
	}

	@Override
	public CarroPopular criarCarroPopular() {
		
		return new Palio();
	}

}
