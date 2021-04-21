import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            int numero1;
            int numero2;
            int soma;
            int subtracao;
            int multiplicacao;
            int divisao;
            int resto;
    
            System.out.println("Entre com o primeiro número de 1 a 100: ");
            numero1 = input.nextInt();
    
            if (numero1 >= 1 && numero1 <= 100) {
                System.out.println("Entre com o segundo número de 1 a 100: ");
                numero2 = input.nextInt();
                if (numero2 >= 1 && numero2 <= 100) {
                    soma = numero1 + numero2;
                    subtracao = numero1 - numero2;
                    multiplicacao = numero1 * numero2;
                    divisao = numero1 / numero2;
                    resto = numero1 % numero2;
                    System.out.println("A soma dos números é: " + soma);
                    System.out.println("A subtração dos números é: " + subtracao);
                    System.out.println("A multiplicação dos números é: " + multiplicacao);
                    System.out.println("A divisão dos números é (valor inteiro): " + divisao);
                    System.out.println("O resto da divisão entre os números é: " + resto);
                } else {
                    System.out.println("Número inválido");
                }
            } else {
                System.out.println("Número inválido");
            }
            input.close();
            System.out.println("Obrigada pela visita!");
        } catch (InputMismatchException err) {
            String mensagemErro = "Valor invalido! Por favor insira um número inteiro de 1 a 100";
            System.out.println(mensagemErro);
        } catch (Exception err) {
            String erro = "Ocorreu o erro: ";
            System.out.println(erro + err);
        }

    }

}