public class Exercicio3 {
    public static void main(String[] args) {
        int numeroAntecessor1 = 0;
        int numeroAntecessor2 = 1;
        int auxiliar;

        System.out.println(numeroAntecessor1 + "\n" + numeroAntecessor2);

        for(int i = 0 ; i < 28 ; i++){
            auxiliar = numeroAntecessor2;
            numeroAntecessor2 += numeroAntecessor1;
            numeroAntecessor1 = auxiliar;
            System.out.println(numeroAntecessor2);
        }
    }
}
