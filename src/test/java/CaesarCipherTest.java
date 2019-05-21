import org.junit.*;

import static org.junit.Assert.*;


public class CaesarCipherTest {

    @Test
    public void CaesarCipher_instantiatesCorrectly_true() {
        CaesarCipher newOne = new CaesarCipher("name", 1);
        assertEquals(true, newOne instanceof CaesarCipher);
    }


    @Test
    public void CaesarCipher_takesStringsAsArguments_String () { 
        CaesarCipher newOne = new CaesarCipher("name", 12);      
        assertEquals("name",newOne.getName());
    }
    @Test
    public void CaesarCipher_takesKeyAsAnInteger_int(){
        CaesarCipher foo = new CaesarCipher("name", 12);
        assertEquals(12, foo.getKey());
    }
    @Test
    public void encrypt_takesCaesarCipherAsArgument_String() {
        CaesarCipher foo = new CaesarCipher("name", 1);
        assertEquals("obnf", CaesarCipher.encrypt(foo));
    }
    @Test
    public void decrypt_takesCaesarCipherAsArgument_String() {
        CaesarCipher foo = new CaesarCipher("obnf", 1);
        assertEquals("name", CaesarCipher.decrypt(foo));
    }
    @Test
    public void decrypt_doesNotTakeKeyWithValueOfMoreThan26_name() {
        CaesarCipher foo = new CaesarCipher("name", 234);
        assertEquals("name", CaesarCipher.decrypt(foo));
    }
    @Test
    public void encrypt_doesNotTakeKeyWithValueOfMoreThan26_name() {
        CaesarCipher foo = new CaesarCipher("name", 234);
        assertEquals("name", CaesarCipher.encrypt(foo));
    }
}