import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int alunos = 30;

        int rm [] = new int[alunos];
        double nota1 [] = new double[alunos];
        double nota2 [] =  new double[alunos];

        int n = 0;
        System.out.print("Informe RM (Negativo para encerrar): ");
        int rmLido = sc.nextInt();

        while(n<30 && rmLido>0) {
            rm[n] = rmLido;
            System.out.print("Nota 1 -> ");
            nota1[n] = sc.nextDouble();
            System.out.print("Nota 2 -> ");
            nota2[n] = sc.nextDouble();
            n++;
            System.out.print("Informe RM (Negativo para encerrar): ");
            rmLido = sc.nextInt();
        }

        double media [] = new double[n];

        for (int i = 0; i < n; i++) {
            media[i] = (nota1[i]+nota2[i])/2;
            System.out.println("RM: " + rm[i]+"\t Média: " + media[i]);
        }

        int aprovados[] = new int[n];
        int nAp = 0;
        for (int i = 0; i < n; i++) {
            if (media[i]>=6){
                aprovados[nAp] = rm[i];
                nAp++;
            }
        }

        System.out.println("Aprovados: ");

        for (int i = 0; i < nAp; i++) {
            System.out.println("RM: " + aprovados[i]);
        }
    }
}
