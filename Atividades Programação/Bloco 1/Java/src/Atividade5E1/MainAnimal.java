package Atividade5E1;

public class MainAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cachorro cachorro1 = new Cachorro ("Rex", 8, "Au au", "atrás de bixos");
		Cavalo cavalo1 = new Cavalo ("Pocoto", 3, "hinn in in", "no campo");
		Preguica preguica1 = new Preguica ("Dorminhoca", 4, "balidos de tristeza", "grande");
		
		cachorro1.imprimirInfoCachorro();
		cavalo1.imprimirInfoCavalo();
		preguica1.imprimirInfoPreguica();
		
	}

}
