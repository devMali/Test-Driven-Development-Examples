package Testing;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CharacterIndexTest {

	private CharacterIndex characterIndex;
    @Before
    public void createIndex() {
        characterIndex = new CharacterIndex();
    }
    @Test
    public void testIndexOfLetterA() {
        assertEquals(0, characterIndex.index('a'));
    }
    @Test
    public void testNotALetter() {
        assertEquals(-1, characterIndex.index('1'));
    }
}
