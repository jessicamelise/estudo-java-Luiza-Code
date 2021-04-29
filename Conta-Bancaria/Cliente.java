public class Cliente {

    private String correntista;
    private long cpf;

    public Cliente(String correntista, long cpf) {
        this.correntista = correntista;
        this.cpf = cpf;
    }

    public String getCliente(){
        return correntista;
    }

    public long getCpf(){
        return cpf;
    }
    
}
