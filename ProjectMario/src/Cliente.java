import java.util.Random;

import Classe.Mario;

public class Cliente {

	public static void main(String[] args) {

		Mario mario = new Mario();
		Random gerador = new Random();
		int sortear = 0;

		try {
			while (mario != null) {
				sortear = gerador.nextInt(5);

				switch (sortear) {
				case 1:
					mario.pegarCogumelo();
					break;
				case 2:
					mario.pegarPena();
					break;
				case 3:
					mario.pegarFlor();
					break;
				case 4:
					mario.levarDano();
					break;

				}
			}

		} catch (Exception e) {

		}

	}

}
