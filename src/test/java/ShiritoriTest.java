import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;

public class ShiritoriTest {

    @Test
    public void shouldReturnPartialGame{
        ArrayList<String> expected = new ArrayList<String>();
        expected.add("dog");
        expected.add("goose");
        String[] gameToTest = {"dog","goose","tiger","cat", "elephant","rhino","orc"};
        shiritori = new Shiritori(gameToTest)
        ArrayList<String> actual = shiritori.thisGame();

        assertEquals("should stop at goose", expected, actual);
    }

    @Test
    public void shouldReturnCompleteGame{
        ArrayList<String> expected = new ArrayList<String>();
        expected.add("dog");
        expected.add("goose");
        expected.add("elephant");
        expected.add("tiger");
        expected.add("rhino");
        expected.add("orc");
        expected.add("cat");
        String[] gameToTest = {"dog","goose","tiger","cat", "elephant","rhino","orc"};
        shiritori = new Shiritori(gameToTest);
        ArrayList<String> actual = shiritori.thisGame();

        assertEquals("should stop at cat", expected, actual);
    }
}