public class CaesarCipher {

    private String mName;
    private int mKey;
    public CaesarCipher(String name, int key) {
        mName = name;
        mKey = key;
        
    }

    public int getKey(){
        return mKey;
    }

    public String getName() {
        return mName;
    }
    public static String encrypt(CaesarCipher caesar) {
        if (caesar.mKey > 26) {
            caesar.mKey = caesar.mKey%26;
        }
        else if(caesar.mKey<0) {
            caesar.mKey = (caesar.mKey%26) + 26;
        } 
        String result = "";
        int length = caesar.mName.length();
        for (int i = 0; i <=length-1; i++) {
            char character = caesar.mName.charAt(i);
            char ch = (char) (character + caesar.mKey);
            result += ch;
        }



        return result;
    }
    public static String decrypt(CaesarCipher caesar) {
        if (caesar.mKey > 26) {
            caesar.mKey = caesar.mKey%26;
        }
        else if(caesar.mKey<0) {
            caesar.mKey = (caesar.mKey%26) + 26;
        } 
        String result = "";
        int length = caesar.mName.length();
        for (int i = 0; i <=length-1; i++) {
            char character = caesar.mName.charAt(i);
            char ch = (char) (character - caesar.mKey);
            result += ch;
        }



        return result;
    }
}