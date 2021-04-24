import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            int idade;

            System.out.println("Qual a sua idade?: ");
            idade = input.nextInt();
            
            if(idade >= 18) {
                System.out.println("Bem-vindo(a) ao nosso site!");
            } else {
                System.out.println("Você não ter permissão para acessar esse site!");
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