import java.util.Scanner;
import java.math.BigDecimal;
import java.util.InputMismatchException;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            input.useLocale(Locale.forLanguageTag("en-US"));
    
            String nomeCorrentista;
            String nomeClienteTransferencia;
            long cpf;
            long cpfClienteTranferencia;
            long numeroConta;
            long numeroContaclienteTransferencia;
            String operacao = "";
            BigDecimal deposito;
            BigDecimal saque;
            BigDecimal transferencia;
            String tiposOperacoes = "Qual operação deseja realizar: \nC = consultar saldo \nD = depósito \nS = saque \nT = Transferir \nX = sair";
    
            System.out.println("Para acessar sua conta, informe seu nome: ");
            nomeCorrentista = input.next();

            System.out.println("Informe seu cpf: ");
            cpf = input.nextLong();

            System.out.println("Informe o número da sua conta: ");
            numeroConta = input.nextLong();

            Cliente cliente = new Cliente(nomeCorrentista, cpf);
            ContaBancaria contaBancaria = new ContaBancaria(cliente, numeroConta);
            
            System.out.printf("Bem-vindo(a) %s a sua conta de numero %d \n", contaBancaria.getCliente().getCliente(), contaBancaria.getNumeroconta());
            
            System.out.println(tiposOperacoes);
            operacao = input.next();
    
            while (!operacao.toUpperCase().equals("X")) {
                if (operacao.toUpperCase().equals("C")) {
                    System.out.printf("Seu saldo atual é de R$ %s\n", contaBancaria.getSaldo());
                    System.out.println(tiposOperacoes);
                    operacao = input.next();
                } else if (operacao.toUpperCase().equals("D")) {
                    System.out.println("Insira o valor para depositar: ");
                    deposito = input.nextBigDecimal();
                    contaBancaria.depositar(deposito);
                    System.out.printf("O valor depositado foi de R$ %s\n", deposito);
                    System.out.println(tiposOperacoes);
                    operacao = input.next();
                } else if (operacao.toUpperCase().equals("S")) {
                    System.out.println("Insira o valor para saque: ");
                    saque = input.nextBigDecimal();
                    contaBancaria.sacar(saque);
                    System.out.printf("O valor sacado foi de R$ %s\n", saque);
                    System.out.println(tiposOperacoes);
                    operacao = input.next();
                } else if (operacao.toUpperCase().equals("T")) {
                    System.out.println("Insira o valor a ser transferido: ");
                    transferencia = input.nextBigDecimal();
                    System.out.println("Nome do beneficiário: ");
                    nomeClienteTransferencia = input.next();
                    System.out.println("cpf do beneficiario: ");
                    cpfClienteTranferencia = input.nextLong();
                    System.out.println("numero da conta: ");
                    numeroContaclienteTransferencia = input.nextLong();
                    
                    Cliente clienteDestino = new Cliente(nomeClienteTransferencia, cpfClienteTranferencia);
                    ContaBancaria contaDestino = new ContaBancaria(clienteDestino, numeroContaclienteTransferencia);

                    contaBancaria.transferir(transferencia, contaDestino);
                    System.out.printf("O valor transferisdo foi de R$ %s \npara o cliente %s \n", transferencia, contaDestino.getCliente().getCliente());
                    System.out.println(tiposOperacoes);
                    operacao = input.next();
                } else {
                    System.out.println("Comando não encontrado!\n");
                    System.out.println(tiposOperacoes);
                    operacao = input.next();
                }
            }
           input.close();
        } catch (InputMismatchException erro) {
            String mensagemErro = "Formato de valor inválido.";
            System.out.println(mensagemErro);
        } catch (Exception erro) {
            String err = "Ocorreu o erro: ";
            System.out.println(err + erro);
        }
    }
}