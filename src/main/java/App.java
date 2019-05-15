import java.util.Scanner;
import java.io.Console;


public class App{
    public static void main(String[] args) {
        Console myConsole = System.console();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a name you would like to be encrypted!");
        String inputtedName = myConsole.readLine();
        System.out.println("Enter a number you would like to use as the key for the encryption formula:");
        int inputtedKey = scanner.nextInt();
        String encryptedWord = CaesarCipher.encryptName(inputtedName,inputtedKey);
        System.out.println("Your encryption for " + inputtedName + " is: " + encryptedWord);
    }
}