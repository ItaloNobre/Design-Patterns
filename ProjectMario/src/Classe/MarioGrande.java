package Classe;

public class MarioGrande implements MarioState {

	int pontos = 0;
	
	@Override
	public MarioState pegarCogumelo() {
		pontos += 1000;
		System.out.println("Mario Ganhou 1000 pontos");
		return new MarioGrande();
	}

	@Override
	public MarioState pegarFlor() {
		System.out.println("Mario Pegando fogo");
		return new MarioFogo();
	}

	@Override
	public MarioState pegarPena() {
		System.out.println("Mario Com Capa");
		return new MarioCapa();
	}

	@Override
	public MarioState LevarDano() {
		System.out.println("Mario ficou pequeno");
		return new MarioPequeno();
	}

}
