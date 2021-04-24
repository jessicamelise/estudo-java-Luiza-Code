import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            int numeroMes;

            System.out.println("Insira um número e verifique o mês: ");
            numeroMes = input.nextInt();

            if (numeroMes == 1) {
                System.out.println("Janeiro!");
            } else if (numeroMes == 2)  {
                System.out.println("Fevereiro!");
            } else if (numeroMes == 3)  {
                System.out.println("Março!");
            } else if (numeroMes == 4)  {
                System.out.println("Abril!");
            } else if (numeroMes == 5)  {
                System.out.println("Maio!");
            } else if (numeroMes == 6)  {
                System.out.println("Junho!");
            } else if (numeroMes == 7)  {
                System.out.println("Julho!");
            } else if (numeroMes == 8)  {
                System.out.println("Agosto!");
            } else if (numeroMes == 9)  {
                System.out.println("Setembro!");
            } else if (numeroMes == 10)  {
                System.out.println("Outubro!");
            } else if (numeroMes == 11)  {
                System.out.println("Novembro!");
            } else if (numeroMes == 12)  {
                System.out.println("Dezembro!");
            } else {
                System.out.println("Não é um mês!");
            }
            input.close();
        } catch (InputMismatchException err) {
            String mensagemErro = "Valor invalido! insira um número inteiro.";
            System.out.println(mensagemErro);
        } catch (Exception err) {
            String erro = "Ocorreu o erro: ";
            System.out.println(erro + err);
        }

    }

}