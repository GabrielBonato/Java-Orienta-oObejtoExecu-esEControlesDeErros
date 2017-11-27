
public class SaldoInsuficienteException extends RuntimeException{
	
	private double saldoAtual;

	public SaldoInsuficienteException(double saldoAtual) {
		super("Saldo insufiente: " + saldoAtual);
		//chamada do construtor
		this.saldoAtual = saldoAtual;				
	}
	
	public double getSaldoAtual() {
		return saldoAtual;
	}

}
