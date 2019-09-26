import java.io.*;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) throws IOException {
        InputStream teclado = System.in;
        Scanner scanner = new Scanner(teclado);

        FileOutputStream escrita = new FileOutputStream("arquivo.txt");
        PrintStream printStream = new PrintStream(escrita);

        while(scanner.hasNextLine()){
            String linha = scanner.nextLine();
            printStream.println(linha);
        }
    }
}
