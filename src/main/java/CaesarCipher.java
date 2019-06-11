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
    public String encrypt() {
        if (this.mKey > 26) {
            this.mKey = this.mKey%26;
        }
        else if(this.mKey<0) {
            this.mKey = 0;
        } 
        String result = "";
        int length = this.mName.length();
        for (int i = 0; i <=length-1; i++) {
            char character = this.mName.charAt(i);
            char ch = (char) (character + this.mKey);
            if (ch > 'z') {
                ch = (char) ('`' + this.mKey);
            }
            result += ch;
        }
        return result;
    }
    public String decrypt() {
        if (this.mKey > 26) {
            this.mKey = this.mKey%26;
        }
        else if(this.mKey<0) {
            this.mKey = 0;
        } 
        String result = "";
        int length = this.mName.length();
        for (int i = 0; i <=length-1; i++) {
            char character = this.mName.charAt(i);
            char ch = (char) (character - this.mKey);
            if (ch< 'a') {
                ch = (char) ('{' - this.mKey);
            }
            result += ch;
        }
        return result;
    }
}