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
            BigDecimal saldoAbertura;
            long cpf;
            long numeroConta;
            String operacao = "";
            BigDecimal deposito;
            BigDecimal saque;
            String tiposOperacoes = "Qual operação deseja realizar: \nC = consultar saldo \nD = depósito \nS = saque \nX = sair";
    
            System.out.println("Para acessar sua conta, informe seu nome: ");
            nomeCorrentista = input.next();

            System.out.println("Informe seu cpf: ");
            cpf = input.nextLong();

            System.out.println("Informe o número da sua conta: ");
            numeroConta = input.nextLong();
            
            System.out.println("Informe o seu saldo inicial: ");
            saldoAbertura = input.nextBigDecimal();
            
            System.out.printf("Bem-vindo(a) %s a sua conta de numero %d \n", nomeCorrentista, numeroConta);
            ContaBancaria contaBancaria = new ContaBancaria(nomeCorrentista, saldoAbertura, cpf, numeroConta);
            
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
                } else if (operacao.toUpperCase().equals("X")) {
                    System.out.println("Obrigado pela preferência!");
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