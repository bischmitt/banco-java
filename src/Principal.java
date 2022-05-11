
public class Principal {

	public static void main(String[] args) {
//		Conta c1 = new Conta("Bianca Klein Schmitt", 101, 4500);
//		Conta c2 = new Conta("Ana Karolina Melo", 20, 4500);
//		Conta c3 = new Conta("Glenda Borges", 120, 450.60);
//
//		c1.dados();
//		c2.dados();
//		c3.dados();
		
		ContaCorrente c4 = new ContaCorrente("Bianca Klein Schmitt", 101, 4500);
		ContaCorrente c5 = new ContaCorrente("Ana Karolina Melo", 20, 4500);
		ContaCorrente c6 = new ContaCorrente("Glenda Borges", 120, 450.60);
		
		c4.dados();
		c5.dados();
		c6.dados();
		
		c4.sacar(100);
		c5.depositar(500);
		
		ContaEspecial c7 = new ContaEspecial("Tatiana Chiacchio", 101, 300, 400);
		c7.dados();	
		c7.sacar(400);
		c7.depositar(200);
		
		ContaPoupanca c8 = new ContaPoupanca("Eduardo Eller Behr", 137, 100);
		c8.dados();
		c8.rendimento(0.025);
	}

}
