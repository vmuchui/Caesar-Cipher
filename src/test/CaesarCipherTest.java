import org.junit.*;

import static org.junit.Assert.*;


public class CaesarCipherTest {


    @Test
    public void encryptName_takesStringsAsArguments_String () {
        CaesarCipher expected = new CaesarCipher();
        assertEquals(weare,expected.encryptName(weare));
    }
    @Test
    public void encryptName_
}