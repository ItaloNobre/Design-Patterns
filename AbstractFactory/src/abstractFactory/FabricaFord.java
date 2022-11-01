package abstractFactory;

public class FabricaFord implements FabricaDeCarros {

	@Override
	public CarroSedan criarCarroSedan() {
		// TODO Auto-generated method stub
		return new FiestaSedan();
	}

	@Override
	public CarroPopular criarCarroPopular() {
		// TODO Auto-generated method stub
		return new fiesta();
	}
	


}
