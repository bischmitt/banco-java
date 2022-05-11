
public class ContaPoupanca extends Conta {
	
//	private final String atendimento = "Sem prioridades";
	
	public ContaPoupanca (String titular, int numero, double saldo) {
//		O super avisa que os atributos são provenientes da superclasse (Conta)
		super(titular, numero, saldo);
	}
	
//	public String getAtendimento() {
//		return atendimento;
//	}
	
	
	public void rendimento (double taxaJuros) {
		String[] trimestre = {"Janeiro", "Fevereiro", "Março"};
		for(int i = 0; i < trimestre.length; i++){
			this.saldo+=(this.saldo * taxaJuros);
			System.out.println("Em " + trimestre[i] + " o saldo da sua poupança com taxa de juros foi de R$" + this.getSaldo());
		}
	}
	
//	public void sacar(double valor) {
//		System.out.println("--------------------------" + this.getTitular() + "------------------------");
//		if(valor <= this.saldo) {
//			this.saldo -= valor;
//			System.out.println("Saque realizado com sucesso. Seu novo saldo: " + this.getSaldo());
//		}else {
//			System.out.println("Saldo insuficiente para realizar o saque.");
//		}
//	}
//	
//	public void depositar(double valor) {
//		System.out.println("--------------" + this.getTitular() + "----------------------");
//		this.saldo += valor;
//		System.out.println("Depósito realizado com sucesso. Seu novo saldo: " + this.getSaldo());
//	}
}
