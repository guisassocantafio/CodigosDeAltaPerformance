package assunto1Exercicios1e2.src;

public class PilhaFuncao {
    public static void main(String[] args) {
        System.out.println("Entrei main");
        primeira();
        System.out.println("Encerrei main");
    }
    public static void primeira(){
        System.out.println("\t Entrei primeira");
        segunda();
        System.out.println("\t Encerrei primeira");
    }
    public static void segunda(){
        System.out.println("\t\t Entrei segunda");
        System.out.println("\t\t Encerrei segunda");
    }

}
