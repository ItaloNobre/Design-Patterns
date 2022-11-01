package Classe;

public class MarioCapa implements MarioState {
	int pontos = 0;
	
	@Override
	public MarioState pegarCogumelo() {
		pontos += 1000;
		return new MarioCapa();
	}

	@Override
	public MarioState pegarFlor() {
		System.out.println("Mario Pegando Fogo");
		return new MarioFogo();
	}

	@Override
	public MarioState pegarPena() {
		System.out.println("Mario Ganhou 1000 pontos");
		return new MarioCapa();
	}

	@Override
	public MarioState LevarDano() {
		System.out.println("Mario Grande perdeu a capa");
		return new MarioGrande();
	}

}
