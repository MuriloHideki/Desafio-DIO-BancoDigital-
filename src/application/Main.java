package application;

public class Main {

	public static void main(String[] args) {
		Conta cc = new ContaCorrente();
		Conta poupanca = new ContaPoupanca();
		
		cc.depositar(100);
		cc.transferir(15, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
