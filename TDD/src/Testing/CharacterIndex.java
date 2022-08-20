package Testing;
import java.util.Arrays;


public class CharacterIndex {

	private char[] characters = new char[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    public int index(char character) {
        assert characters != null;
        return Arrays.binarySearch(characters, Character.toUpperCase(character));                
    }
}
