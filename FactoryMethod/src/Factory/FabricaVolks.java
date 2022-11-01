package Factory;

public class FabricaVolks implements FabricaDeCarro {

	@Override
	public Carro criarCarro() {
		// TODO Auto-generated method stub
		return new Gol();
	}
	
}
