public class Exercicio2 {
    public static void main(String[] args) {
        String palavra = "";
        int restricao = 0;

        do {
            for (int i = 0; i < 5; i++) {
                palavra += "*";
                System.out.println(palavra);
            }
            palavra = "";
            restricao++;
        }while(restricao != 5); //Usando restrição para não entrar num loop infinito.
                                // O valor de restricao é a quantidade de triângulos a serem impressos.
    }
}
