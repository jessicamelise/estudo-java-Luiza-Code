import java.math.BigDecimal;

public class ContaBancaria {
    String correntista;
    BigDecimal saldo;
    long cpf;
    long numeroConta;

    public ContaBancaria(String correntista, BigDecimal saldo, long cpf, long numeroConta) {
        this.correntista = correntista;
        this.saldo = saldo;
        this.cpf = cpf;
        this.numeroConta = numeroConta;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void depositar(BigDecimal valor) {
        saldo = saldo.add(valor);
    }

    public void sacar(BigDecimal valor) {
        saldo = saldo.subtract(valor);
    }

}
