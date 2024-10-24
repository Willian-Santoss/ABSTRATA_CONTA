package ClasseAbstrata;

//subclasse conta poupança, herda de ContaBancaria
class ContaPoupanca extends ContaBanc {
private double taxaSaque = 0.5;  // taxa cobrada por saque
private double taxaDeposito = 0.2;  // taxa cobrada por depósito

public ContaPoupanca(double saldoInicial) { // construtor que inicializa o saldo
   super(saldoInicial);
}

// metodo para saque
@Override
public void saque(double valor) {
   // verifica se o valor do saque ultrapassa o saldo
   if (valor > saldo) {
       System.out.println("Saque não permitido: saldo insuficiente.");
   } else {
       saldo -= (valor + taxaSaque); // apresenta o valor do saque e a taxa do saldo
       System.out.println("Saque de R$" + valor + " realizado. Taxa de R$" + taxaSaque + " aplicada.");
   }
}

// metodo para depósito
@Override
public void deposito(double valor) {
   saldo += (valor - taxaDeposito); // adiciona o valor depositado menos a taxa ao saldo
   System.out.println("Depósito de R$" + valor + " realizado. Taxa de R$" + taxaDeposito + " aplicada.");
}

// metodo para consulta de saldo
@Override
public void consulta() {
   System.out.println("Saldo atual: R$" + saldo + ". Taxa de consulta: R$0.0.");
}
}
