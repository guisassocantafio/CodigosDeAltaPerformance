package Aula02;

import java.util.Scanner;

public class Ex02 {
    static final int N = 30;
    public static void main(String[] args) {

        int rm[] = new int[N];
        double nota1[] = new double[N];
        double nota2[] = new double[N];
        int n = entradaDados(rm, nota1, nota2);

        double media[] =   new double[n];
        calculaMedia(n,nota1,nota2,media);
        for (int i = 0; i < n; i++) {
            System.out.println("RM: "+rm[i]+"\t media: "+media[i]);
        }
        int aprovados[] = new int[n];
        int nAp = geraListaAprovados(n, media, rm, aprovados);

        System.out.println("\n *** Lista de Aprovados ***");
        for (int i = 0; i < nAp; i++) {
            System.out.println(aprovados[i]);
        }
    }
    public static int geraListaAprovados(int n, double[] media, int[] rm, int[] aprovados){
        int nAp =0;
        for (int i = 0; i < n ; i++) {
            if (media[i] >=6){
                aprovados[nAp] = rm[i];
                nAp++;
            }
        }
        return nAp;
    }

    private static void calculaMedia(int n,double[] nota1, double[] nota2, double[] media ) {
        for (int i = 0; i < n; i++) {
            media[i] = (nota1[i] + nota2[i]) / 2;
        }
    }


    public static int entradaDados(int[] rm,double[] nota1, double[] nota2){
        Scanner le = new Scanner(System.in);
        int n=0;
        System.out.print("Informe RM (negativo para encerrar): ");
        int rmLido = le.nextInt();
        while (n<N && rmLido>0){
            rm[n] = rmLido;
            System.out.print("Nota1: ");
            nota1[n] = le.nextDouble();
            System.out.print("Nota2: ");
            nota2[n] = le.nextDouble();
            n++;
            System.out.print("Informe RM (negativo para encerrar): ");
            rmLido = le.nextInt();
        }
        return n;
    }
}
