package classe.executavel;

import classe.modelo.ContaEspecial;
import classe.modelo.Correntista;

public class ClasseExecutavel {

	public static void main(String[] args) {
		
		Correntista correntista = new Correntista();
		correntista.setNome("Carlos Da Silva");
		correntista.setEmail("fulano@gmail.com");
		correntista.setIdade(33);
		correntista.setCpf(00200200222L);
		correntista.setIdt(7070707070L);
		correntista.setCelular(999443322L);
		correntista.setRegistro(998877);
		
		ContaEspecial contaEspecial = new ContaEspecial(500,2233,correntista,1000);	
		
		System.out.println("Correntista............: "+contaEspecial.getCorrentista().getNome());
		System.out.println("Registro...............: "+contaEspecial.getCorrentista().getRegistro());
		System.out.println("Telefone...............: "+contaEspecial.getCorrentista().getCelular());
		System.out.println("Idade..................: "+contaEspecial.getCorrentista().getIdade());
		System.out.println("CPF....................: "+contaEspecial.getCorrentista().getCpf());
		System.out.println("IDT....................: "+contaEspecial.getCorrentista().getIdt());
		System.out.println("Nro Conta..............: "+contaEspecial.getNumeroConta());
		System.out.println("Saldo................R$: "+contaEspecial.getSaldo());
		System.out.println("Limite...............R$: "+contaEspecial.getLimite());
		
		System.out.println("-----------------------------------");
		float valorSaque = 950;
		System.out.println(contaEspecial.sacar(valorSaque));
		//System.out.println(conta.sacar(1));
		System.out.println("-----------------------------------");
		System.out.println(contaEspecial.depositar(500));
		//System.out.println(conta.sacar(1600));
		System.out.println("-----------------------------------");
		System.out.println(contaEspecial.Extrato());
		System.out.println(contaEspecial.atualizaSaldo(100));
		
		
		
		

	}

}
