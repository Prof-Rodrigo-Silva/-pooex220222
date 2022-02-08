package classe.modelo;

public class Conta {
	
	private int numeroConta;
	private Correntista correntista;
	private double saldo;
	
	public Conta() {
		
	}
	
	public Conta(int numero, Correntista correntista, float saldo) {
        this.numeroConta = numero;
        this.correntista = correntista;
        this.saldo = saldo;
    }
	
	
	public Conta(int numero, float saldo) {
        this.numeroConta = numero;
        this.saldo = saldo;
    }
	
	public int getNumeroConta() {
		return numeroConta;
	}



	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}



	public Correntista getCorrentista() {
		return correntista;
	}



	public void setCorrentista(Correntista correntista) {
		this.correntista = correntista;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String depositar(float valor) {
		this.saldo += valor;
		return "Depósito no valor de "+valor+" realizado, saldo atual: R$ "+this.saldo;
	}
	
	public String sacar(float valor) {
		if(this.saldo - valor >= 0) {
			this.saldo = this.saldo - valor;
			return "Saque realizado, saldo atual: R$ "+this.saldo;
		}
		return "Saque não possível, saldo atual: R$ "+this.saldo;
	}
}
