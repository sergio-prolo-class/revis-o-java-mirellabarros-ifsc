import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        float p1, p2, a;
        double resultado;
        String aprovacao;

        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe a nota do projeto 1: ");
        p1 = entrada.nextFloat();
        System.out.print("Informe a nota do projeto 2: ");
        p2 = entrada.nextFloat();
        System.out.print("Informe a nota de participação: ");
        a = entrada.nextFloat();

        resultado = Math.round(((p1*2 + p2*3) / 5)*0.9 + a * 0.1);
        aprovacao = resultado >= 6 ? "Aprovado" : "Reprovado";

        System.out.println(aprovacao + ", média: " + resultado);
    }
}