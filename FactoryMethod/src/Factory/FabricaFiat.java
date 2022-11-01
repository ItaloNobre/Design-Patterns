package Factory;

public class FabricaFiat implements FabricaDeCarro {

	@Override
	public Carro criarCarro() {
		// TODO Auto-generated method stub
		return new Palio();
	}
	
	
}
