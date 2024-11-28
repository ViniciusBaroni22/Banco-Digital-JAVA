public class Main {

  public static void main(String[] args) {
    Iconta cc = new ContaCorrente();
    Iconta poupanca = new ContaPoupanca();

    cc.depositar(25000);
    cc.transferir(5000, poupanca);
    cc.sacar(20000);

    cc.imprimirExtrato();
    poupanca.imprimirExtrato();
  }

}
