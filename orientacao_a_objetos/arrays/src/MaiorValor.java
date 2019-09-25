import java.util.Arrays;
import java.util.Scanner;

public class MaiorValor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tamanho;

        System.out.println("Insira o tamanho do vetor:");
        tamanho = sc.nextInt();

        double[] numeros = new double[tamanho];

        for(int i = 0 ; i < tamanho ; i++) {
            System.out.println("Insira um valor:");
            numeros[i] = sc.nextDouble();
        }

        Arrays.sort(numeros);

        System.out.println("\nO maior número inserido é " + numeros[tamanho-1]);

        sc.close();
    }
}
