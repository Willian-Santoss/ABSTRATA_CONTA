package ClasseAbstrata;

//subclasse conta corrente, herda de ContaBancaria
class ContaCorrente extends ContaBanc {
private double limite; // Limite de crédito da conta
private  double taxaSaque = 1.0;  // taxa cobrada por saque 
private  double taxaDeposito = 0.5;  // taxa cobrada por depósito 

public ContaCorrente(double saldoInicial, double limite) { // construtor que inicializa o saldo e o limite
 super(saldoInicial);
 this.limite = limite;
}

//metodo para saque
@Override
public void saque(double valor) {
 // metodo que verifica se o valor do saque ultrapassa o saldo e limite
 if (valor > saldo + limite) {
     System.out.println("Saque não permitido: saldo e limite insuficientes.");
 } else {
     saldo -= (valor + taxaSaque); // apresenta o valor do saque e a taxa do saldo
     System.out.println("Saque de R$" + valor + " realizado. Taxa de R$" + taxaSaque + " aplicada.");
 }
}

//metodo para depósito
@Override
public void deposito(double valor) {
 saldo += (valor - taxaDeposito); // adiciona o valor depositado menos a taxa ao saldo
 System.out.println("Depósito de R$" + valor + " realizado. Taxa de R$" + taxaDeposito + " aplicada.");
}

//metodo para consulta de saldo
@Override
public void consulta() {
 System.out.println("Saldo atual: R$" + saldo + ". Taxa de consulta: R$0.0.");
}
}
