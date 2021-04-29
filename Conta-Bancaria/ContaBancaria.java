import java.math.BigDecimal;

public class ContaBancaria {
    
    private BigDecimal saldo = new BigDecimal("00.00");
    private long numeroConta;
    private Cliente cliente;

    public ContaBancaria(Cliente cliente, long numeroConta) {
        this.numeroConta = numeroConta;
        this.cliente = cliente;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public long getNumeroconta() {
        return numeroConta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void depositar(BigDecimal valor) {
        saldo = saldo.add(valor);
    }

    public void transferir(BigDecimal valor, ContaBancaria contaBancaria) throws Exception {
        if (valor.compareTo(saldo) >= 0) {
            throw new Exception("Saldo insuficiente");
        } else {
            saldo = saldo.subtract(valor);
            contaBancaria.depositar(valor);
        }
    }

    public void sacar(BigDecimal valor) throws Exception {
        if (valor.compareTo(saldo) >= 0) {
            throw new Exception("Saldo insuficiente");
        } else {
            saldo = saldo.subtract(valor);
        }
    }

}
