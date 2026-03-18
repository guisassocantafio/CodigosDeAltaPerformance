package assunto1Exercicios1e2.src;

import java.util.Scanner;

public class Aluno {
    String nome;
    int rm;
    double nota1, nota2, media;

    public void leitura(){
        Scanner le = new Scanner(System.in);
        System.out.print("Nome: ");
        this.nome = le.next();
        System.out.print("RM: ");
        this.rm = le.nextInt();
        System.out.print("Nota1: ");
        this.nota1 = le.nextDouble();
        System.out.print("Nota2: ");
        this.nota2 = le.nextDouble();
        le.close();
    }
    public void calculaMedia(){
        this.media = (this.nota1 + this.nota2) / 2;
    }
    public void mostraAluno(){
        System.out.println("Aluno: "+this.nome + "\t RM:  "+this.rm);
        System.out.println("Média: "+ this.media);
    }






}
