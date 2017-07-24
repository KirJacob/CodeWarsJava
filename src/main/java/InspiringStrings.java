import java.util.Arrays;

public class InspiringStrings {
    public static String longestWord(String wordString) {
        int max = 0;
        String maxElement="";
        String[]lineArr = wordString.split(" ");
        System.out.println(Arrays.toString(lineArr));
        for (String element: lineArr)
            if (element.length() >= max) {
                maxElement = element;
                max = element.length();
            }
        return maxElement;
    }
}
