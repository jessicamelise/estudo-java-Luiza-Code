// import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            input.useLocale(Locale.forLanguageTag("en-US"));
            // DecimalFormat decimal = new DecimalFormat("#0.0");
            float nota1;
            float nota2;
            float nota3;
            float porcentagemFaltas = (25f/100)*68;
            int faltas;
            float soma;
            float media;
    
            System.out.println("Primeira nota: ");
            nota1 = input.nextFloat();
            System.out.println("Segunda nota: ");
            nota2 = input.nextFloat();
            System.out.println("Terceira nota: ");
            nota3 = input.nextFloat();
            System.out.println("Número de faltas: ");
            faltas = input.nextInt();

            soma = nota1 + nota2 + nota3;
            media = soma / 3;

            if (faltas > porcentagemFaltas) {
                System.out.println("Aluno Reprovado por faltas! Número de faltas: " + faltas);
            } else if (media < 7.0) {
                System.out.printf("Aluno Reprovado por nota! Nota: %.1f",  media);
                // System.out.println("Aluno Reprovado por nota! Nota: " + decimal.format(media));
            } else {
                System.out.printf("Aluno Aprovado! Nota: %.1f",  media);
                // System.err.println("Aluno Aprovado! Nota: " + decimal.format(media));
            }

            input.close();
        } catch (InputMismatchException err) {
            String mensagemErro = "Valor invalido! Para notas ex: 5 ou 5.2 e para faltas números inteiros ex: 30";
            System.out.println(mensagemErro);
        } catch (Exception err) {
            String erro = "Ocorreu o erro: ";
            System.out.println(erro + err);
        }

    }

}