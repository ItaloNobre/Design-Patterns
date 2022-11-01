package Classe;

public class MarioPequeno implements MarioState {

	@Override
	public MarioState pegarCogumelo() {
		System.out.println("Mario Ficou Grande");
		return new MarioGrande();
	}

	@Override
	public MarioState pegarFlor() {
		System.out.println("Mario ficou grande e pegando Fogo");
		return new MarioFogo();
	}

	@Override
	public MarioState pegarPena() {
		System.out.println("Mario ficou grande com capa");	
		return new MarioCapa();
	}

	@Override
	public MarioState LevarDano() {
		System.out.println("Mario Morreu!");
		return new MarioMorto();
	}

	
	
}
