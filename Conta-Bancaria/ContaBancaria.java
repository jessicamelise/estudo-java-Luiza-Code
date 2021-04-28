import java.math.BigDecimal;

public class ContaBancaria {
    String correntista;
    BigDecimal saldo;

    public ContaBancaria(String correntista, BigDecimal saldo) {
        this.correntista = correntista;
        this.saldo = saldo;
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
