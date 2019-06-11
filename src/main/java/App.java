import java.util.Scanner;
import java.io.Console;


public class App{
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        Console myConsole = System.console();

        boolean programRunning = true;
        while (programRunning) {
            System.out.println("Welcome to Caesar-Cipher:-) What would you like to do? Enter one of the following options: encrypt, decrypt or exit");
            String inputChoice = myScanner.nextLine();
            
            if (inputChoice.equals("encrypt")) {
                System.out.println("Enter the word you would like to encrypt: ");
                String inputtedName = myScanner.nextLine();
                System.out.println("Enter the key you would like to use for your encryption!");        
                int inputtedKey = myScanner.nextInt();       
                CaesarCipher createdCaesarCipher = new CaesarCipher(inputtedName, inputtedKey);          
                String encrypted = createdCaesarCipher.encrypt();
                System.out.println("Your encryption for the word " + inputtedName + " using the key " + inputtedKey + " is " + encrypted);
                System.out.println("Thank you!!");
            }else if (inputChoice.equals("decrypt")) {
                System.out.println("Enter the word you would like to decrypt: ");
                String inputtedName = myScanner.nextLine();
                System.out.println("Enter the key to use for your decryption!");        
                int inputtedKey = myScanner.nextInt();       
                CaesarCipher createdCaesarCipher = new CaesarCipher(inputtedName, inputtedKey);          
                String decrypted = createdCaesarCipher.decrypt();
                System.out.println("Your decryption for the word " + inputtedName + " using the key " + inputtedKey + " is " + decrypted);
                System.out.println("Thank you!!"); 
            }else if (inputChoice.equals("exit")) {
                programRunning = false;
            }else {
                System.out.println("Sorry your input is not recognised!!");
            }
                 
        }

    }
}