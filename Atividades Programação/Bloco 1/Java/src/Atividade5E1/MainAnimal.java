package Atividade5E1;

public class MainAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cachorro cachorro1 = new Cachorro ("Rex", 8);
		Cavalo cavalo1 = new Cavalo ("Pocoto", 3);
		Preguica preguica1 = new Preguica ("Dorminhoca", 4);
		
		cachorro1.imprimirInfoCachorro();
		cavalo1.imprimirInfoCavalo();
		preguica1.imprimirInfoPreguica();
		
		System.out.println("\n\n\tSons dos animais\n");
		System.out.printf("Cachorro: ");
		cachorro1.emitirSom();
		System.out.printf("Cavalo: ");
		cavalo1.emitirSom();
		System.out.printf("Preguiça: ");
		preguica1.emitirSom();
		
		System.out.println("\n\n\tAção dos animais\n");
		System.out.printf("Cachorro: ");
		cachorro1.acao();
		System.out.printf("Cavalo: ");
		cavalo1.acao();
		System.out.printf("Preguiça: ");
		preguica1.acao();
		
	}

}
