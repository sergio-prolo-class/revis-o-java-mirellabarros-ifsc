import java.time.LocalDate;
import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe o seu nome: ");
        String nome = entrada.nextLine();
        System.out.print("Informe o seu ano de nascimento: ");
        int anoNascimento = entrada.nextInt();
        int anoAtual = LocalDate.now().getYear();

        int idade = anoAtual - anoNascimento;

        System.out.println(nome +", possui " + idade + " anos.");
    }
}