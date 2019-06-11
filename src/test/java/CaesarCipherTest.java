import org.junit.*;

import static org.junit.Assert.*;


public class CaesarCipherTest {

    @Test
    public void CaesarCipher_instantiatesCorrectly_true() {
        CaesarCipher newOne = new CaesarCipher("name", 1);
        assertTrue(newOne instanceof CaesarCipher);
    }


    @Test
    public void CaesarCipher_takesStringsAsArguments_name () { 
        CaesarCipher newOne = new CaesarCipher("name", 12);      
        assertEquals("name",newOne.getName());
    }
    @Test
    public void CaesarCipher_takesKeyAsAnInteger_int(){
        CaesarCipher foo = new CaesarCipher("name", 12);
        assertEquals(12, foo.getKey());
    }
    @Test
    public void encrypt_returnsString_String() {
        CaesarCipher foo = new CaesarCipher("name", 1);
        assertEquals("obnf", foo.encrypt());
    }
    @Test
    public void decrypt_returnsString_String() {
        CaesarCipher foo = new CaesarCipher("obnf", 1);
        assertEquals("name", foo.decrypt());
    }
    @Test
    public void encrypt_doesNotReturnNonLetterCharacters_b() {
        CaesarCipher foo = new CaesarCipher("z", 1);
        assertEquals("a", foo.encrypt());
    }
    @Test
    public void decrypt_doesNotReturnNonLetterCharacters_y() {
        CaesarCipher foo = new CaesarCipher("a", 1);
        assertEquals("z", foo.decrypt());
    }
    @Test
    public void encrypt_doesNotTakeKeyValueLessThan0_name() {
        CaesarCipher foo = new CaesarCipher("a", -1);
        assertEquals("a", foo.encrypt()); 
    }
    @Test
    public void decrypt_doesNotTakeKeyValuesLessThan0_name() {
        CaesarCipher foo = new CaesarCipher("name", -2);
        assertEquals("name", foo.decrypt()); 
    }
    @Test
    public void encrypt_returnsLettersForCapitalletters_String() {
        CaesarCipher foo = new CaesarCipher("ZIC", 2);
        assertEquals("BKE", foo.encrypt());
    }
    @Test
    public void decrypt_returnsLettersForCapitalletters_String() {
        CaesarCipher foo = new CaesarCipher("A", 1);
        assertEquals("z", foo.decrypt());
    }
}