
public class ContaEspecial extends Conta{

	private final String atendimento = "Com prioridades";
	public double chequeEspecial = 300.00;
	
	public ContaEspecial(String titular, int numero, double saldo, double chequeEspecial) {
		super(titular, numero, saldo);
		this.chequeEspecial = chequeEspecial;
	}
	
	public double getChequeEspecial() {
		return chequeEspecial;
	}

	public void setChequeEspecial(double chequeEspecial) {
		this.chequeEspecial = chequeEspecial;
	}

	public String getAtendimento() {
		return atendimento;
	}
	
	public void dados() {
		super.dados();
		System.out.println("Atendimento: " + this.getAtendimento());
		System.out.println("Limite Cheque Especial: " + this.getChequeEspecial());
	}
	
	public void sacar(double valor) {
		if(this.getSaldo() >= valor) {
			System.out.println("---------" + this.getTitular() + "---------------");
			this.saldo -= valor;
			System.out.println("Saque realizado com sucesso. Seu novo saldo é R$" + this.getSaldo());			
		}else if(this.getSaldo() + this.getChequeEspecial() >= valor) {
			System.out.println("Seu saldo disponível não é suficiente, você entrará no limite");
			this.chequeEspecial -=(valor -this.getSaldo());
			this.saldo -= valor;
			System.out.println("Saque realizado com sucesso. Seu novo saldo é R$" + this.getSaldo() + ". Seu limite é R$" + this.getChequeEspecial());	
		}else {
			System.out.println("Saque não realizado. Limite indisponível!");
		}
	}
	
	public void depositar(double valor) {
		if(this.getSaldo() >= 0) {
			System.out.println("---------" + this.getTitular() + "---------------");
			this.saldo += valor;
			System.out.println("Depósito realizado com sucesso. Seu novo saldo é R$" + this.getSaldo() + ". %n Seu limite é R$" + this.getChequeEspecial());
		}else if (this.getSaldo() < 0){
			this.saldo += valor;
			this.chequeEspecial += (valor - this.saldo);
			System.out.println("Depósito realizado com sucesso. Seu novo saldo é R$" + this.getSaldo() + ". Seu limite é R$" + this.getChequeEspecial());
		}
	}
	
}





















