package classe.modelo;

public class ContaEspecial extends Conta{
	
	private double limite;
	
	
	public ContaEspecial() {
		
	}
	
	 public ContaEspecial(float limite, int numero, Correntista correntista, float saldo) {
	        super(numero, correntista, saldo);
	        this.limite = limite;
	    }
	 
	
	public ContaEspecial(double limite) {
		this.limite = limite;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	
	@Override
	public String sacar(float valor) {
		if((this.getSaldo()+this.limite)-valor >= 0) {
			if(this.getSaldo() < valor) {
				Double diferenca = this.getSaldo() - valor;
				this.setSaldo(0.0);
				this.limite += diferenca;
			}else {
				this.setSaldo(this.getSaldo()-valor);
			}
			return "Saque no valor de "+valor+" realizado, saldo atual: R$ "+this.getSaldo()+" e limite R$ "+this.limite;
		}else {
			return "Saque não possível, saldo atual: R$ "+this.getSaldo()+" e limite R$ "+this.limite;
		}	
	}
	
	public String Extrato() {
		return "Extrato | Saldo R$ "+this.getSaldo()+" | Limite R$ "+this.limite+" | Limite Disponível R$ "+(this.getSaldo()+this.limite);
	}
	
	public String atualizaSaldo(float juros) {
		this.setSaldo(this.getSaldo() + juros);
		return "Saldo R$ "+this.getSaldo();
	}

}
