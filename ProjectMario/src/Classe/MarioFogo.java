package Classe;

public class MarioFogo implements MarioState {
	int pontos = 0;
	@Override
	public MarioState pegarCogumelo() {
		System.out.println("Mario Fogo ganhou 1000 pontos");
		pontos += 1000;
		return new MarioFogo();
	}

	@Override
	public MarioState pegarFlor() {
		System.out.println("Mario fogo Virou Mario Capa");
		return new MarioCapa();
	}

	@Override
	public MarioState pegarPena() {
		System.out.println("Mario Fogo ganhou 1000 pontos");
		pontos += 1000;
		return new MarioFogo();
	}

	@Override
	public MarioState LevarDano() {
		System.out.println("Mario fogo virou mario grande");
		return new MarioGrande();
	}

}
