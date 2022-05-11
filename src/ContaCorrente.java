
public class ContaCorrente extends Conta {
	
	private final String atendimento = "Sem prioridades";
	
	public ContaCorrente(String titular, int numero, double saldo) {
//		O super avisa que os atributos são provenientes da superclasse (Conta)
		super(titular, numero, saldo);
	}
	
	public String getAtendimento() {
		return atendimento;
	}
	public void dados() {
		super.dados();
		System.out.println("Atendimento: " + this.getAtendimento());
	}
	
	public void sacar(double valor) {
		System.out.println("--------------------------" + this.getTitular() + "------------------------");
		if(valor <= this.saldo) {
			this.saldo -= valor;
			System.out.println("Saque realizado com sucesso. Seu novo saldo: " + this.getSaldo());
		}else {
			System.out.println("Saldo insuficiente para realizar o saque.");
		}
	}
	
	public void depositar(double valor) {
		System.out.println("--------------" + this.getTitular() + "----------------------");
		this.saldo += valor;
		System.out.println("Depósito realizado com sucesso. Seu novo saldo: " + this.getSaldo());
	}
}
