
public class Conta {
	
	public String titular;
	public int numero;
	public double saldo;
	
	public Conta( String titular, int numero, double saldo) {
		this.titular = titular;
		this.numero = numero;
		this.saldo = saldo;
	}
	
	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void dados() {
		System.out.println("--------------------------------------------------");
		System.out.println("Titular da Conta: " + this.getTitular());
		System.out.println("Número da Conta: " + this.numero);
		System.out.println("Saldo da Conta: " + this.getSaldo());
	}
}
