package ClasseAbstrata;

//classe abstrata que representa uma conta bancária
abstract class ContaBanc {
public double saldo; // atributo comum

public ContaBanc(double saldo) {  // construtor que inicializa o saldo
 this.saldo = saldo;
}

//métodos comum
public abstract void saque(double valor);
public abstract void deposito(double valor);
public abstract void consulta();
}
