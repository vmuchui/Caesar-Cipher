import org.junit.*;

import static org.junit.Assert.*;


public class CaesarCipherTest {

    @Test
    public void encryptName_takesArguments_true() {
       
        CaesarCipher newOne = new CaesarCipher();
        assertEquals(true, newOne.encryptName(word, 12));
    }


    @Test
    public void encryptName_takesStringsAsArguments_wear () {        
        assertEquals("wear",CaesarCipher.encryptName(wear));
    }
    @Test
    public void encryptName_takesKeyAsAnInteger_2(){
        String testWord = "a";
        int testNumber = 1;
        assertEquals("b",CaesarCipher.encryptName(testWord,testNumber));
    }
    @Test
    public void encryptName_returnsString_b() {
        assertEquals("b", CaesarCipher.encryptName("a", 1));
    }
}