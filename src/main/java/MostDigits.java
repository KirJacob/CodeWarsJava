import java.util.Arrays;

public class MostDigits {
    public static int findLongest(int[] numbers) {
        String arrayLine = Arrays.toString(numbers)
                .replaceAll("\\[", "").replaceAll("\\-", "").replaceAll("(\\])", "");
        String[] arrayLineStr = arrayLine.split(", ");
        int max = 0;
        int index = 0;
        for (int i = 0; i < arrayLineStr.length; i ++ )
            if (arrayLineStr[i].length()>max){
                max = arrayLineStr[i].length();
                index = i;
            }
        return numbers[index];
    }
}
