import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        float nota;
        float[];
        boolean controle = true;

        Scanner entrada = new Scanner(System.in);

        while (controle) {
            System.out.print("Informe as notas do alunos ou pressione 'Enter' para terminar: ");
            nota = entrada.nextFloat();
        }
    }
}