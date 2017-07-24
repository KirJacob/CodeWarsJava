import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

public class PartialWordSearchTest7 {

    @Test
    public void test(){
        assertArrayEquals(new String[]{"Ki"}, PartialWordSearch.findWord("Ki", new String[]{"1", "uk", "Ki"}));
        assertArrayEquals(new String[]{"Empty"}, PartialWordSearch.findWord("Ik", new String[]{"1", "uk", "Ki"}));
    }

    @Test
    public void test2() {
        String[] test1 = {"lemonade", "limeade", "Yoo-Hoo", "root beer", "grapeade ", "water", "Mr. Pibb"};
        String[] test1results = {"lemonade", "limeade", "grapeade "};
        String[] test2results = {"Tin + Oxygen", "lox"};
        String[] test3results = {"Empty"};
        assertArrayEquals(test1results, PartialWordSearch.findWord("ade", test1));
        String[] test2 = new String[320];
        for (int i = 0; i < 320; i++){ test2[i] = "o x"; }
        test2[303] = "lox";
        test2[70] = "Tin + Oxygen";
        assertArrayEquals(test2results, PartialWordSearch.findWord("ox", test2));
        assertArrayEquals(test3results, PartialWordSearch.findWord("   ", test1));
    }
}
