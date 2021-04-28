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

    public void sacar(BigDecimal valor) throws Exception {
        if (valor.compareTo(saldo) >= 0) {
            throw new Exception("Saldo insuficiente");
        } else {
            saldo = saldo.subtract(valor);
        }
    }

}
