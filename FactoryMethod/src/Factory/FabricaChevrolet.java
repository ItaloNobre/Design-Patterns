package Factory;

public class FabricaChevrolet implements FabricaDeCarro {

	@Override
	public Carro criarCarro() {
		// TODO Auto-generated method stub
		return new Celta();
	}

}
