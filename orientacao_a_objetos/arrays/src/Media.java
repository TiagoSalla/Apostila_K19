import java.util.Scanner;

import static java.sql.DriverManager.println;

public class Media {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tamanho;
        double soma = 0;
        int contador = 0;

        System.out.println("Insira o tamanho do vetor:");
        tamanho = sc.nextInt();

        double[] numeros = new double[tamanho];

        for(double numero : numeros){
            System.out.println("Insira um valor:");
            numero = sc.nextDouble();
            soma += numero;
            contador++;
        }

        System.out.println("A média dos valores inseridos é: " + soma / contador);

        sc.close();
    }
}
