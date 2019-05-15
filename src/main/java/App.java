import java.util.Scanner;
import java.io.Console;


public class App{
    public static void main(String[] args) {
        Console myConsole = System.console();
        Scanner scanner = new Scanner(System.in);
        boolean runProgram = true;
        while (runProgram=true) {
            System.out.println("Would you like to: 1.Encrypt or 2.Decrypt 3.Exit?");
            String inputtedChoice = myConsole.readLine();
            if (inputtedChoice.equals("Encrypt")) {
                System.out.println("Enter the word you would like to encrypt: ");
                String inputtedName = myConsole.readLine();
                System.out.println("Enter the key you would like to use for your encryption!");
                int inputtedKey = scanner.nextInt();
                String encryptedWord = CaesarCipher.encryptName(inputtedName,inputtedKey);
                System.out.println("Your encryption for " + inputtedName + " is: " + encryptedWord);
            }else if (inputtedChoice.equals("Decrypt")) {
                System.out.println("Enter the word you would like to decrypt: ");
                String inputtedName = myConsole.readLine();
                System.out.println("Enter the key for your decryption!");
                int inputtedKey = scanner.nextInt();
                String encryptedWord = CaesarCipher.decryptName(inputtedName,inputtedKey);
                System.out.println("Your decryption for " + inputtedName + " is: " + encryptedWord);
            }else {
                runProgram = false;
            }
        }
       
    }
}