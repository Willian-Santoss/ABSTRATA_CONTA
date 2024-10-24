package ClasseAbstrata;

//Classe principal para execução do programa
public class Main {
 public static void main(String[] args) {
     // Criação de uma conta corrente com saldo inicial e limite
     ContaBanc contaCorrente = new ContaCorrente(3400, 900);
     contaCorrente.deposito(600); // Realiza um depósito
     contaCorrente.saque(1350); // Tenta realizar um saque
     contaCorrente.consulta(); // Consulta o saldo

     // Criação de uma conta poupança com saldo inicial
     ContaBanc contaPoupanca = new ContaPoupanca(3000);
     contaPoupanca.deposito(450); // Realiza um depósito
     contaPoupanca.saque(600); // Realiza um saque
     contaPoupanca.consulta(); // Consulta o saldo
 }
}

