import java.util.Scanner;


public class App{
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter the word you would like to encrypt and decrypt: ");
        String inputtedName = myScanner.nextLine();    
        System.out.println("Enter the key you would like to use for your encryption!");        
        int inputtedKey = myScanner.nextInt();       
        CaesarCipher createdCaesarCipher = new CaesarCipher(inputtedName, inputtedKey);          
        String encrypted = CaesarCipher.encrypt(createdCaesarCipher);
        CaesarCipher decrypt = new CaesarCipher(encrypted, inputtedKey);
        String decrypted = CaesarCipher.decrypt(decrypt);
        System.out.println("Encryption: " + encrypted);
        System.out.println("Decryption: " + decrypted);
    }
}