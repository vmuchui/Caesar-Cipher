public class CaesarCipher {


    public static String encryptName(String name, int key) {
        if (key > 26) {
            key = key%26;
        }
        else if(key<0) {
            key = (key%26) + 26;
        } 
        String result = "";
        int length = name.length();
        for (int i = 0; i <=length-1; i++) {
            char character = name.charAt(i);
            char ch = (char) (character + key);
            result += ch;
        }



        return result;
    }
}