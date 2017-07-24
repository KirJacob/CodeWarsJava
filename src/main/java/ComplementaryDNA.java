import java.util.Arrays;

public class ComplementaryDNA {
    public static String makeComplement(String dna) {
        String[]array = dna.split("");

        for (int i = 0; i < array.length; i++){
            switch (array[i]){
                case "A":
                    array[i] = "T";
                    break;
                case "T":
                    array[i] = "A";
                    break;
                case "G":
                    array[i] = "C";
                    break;
                case "C":
                    array[i] = "G";
                    break;
                default:
                    break;
            }
        }
        String line = Arrays.toString(array).replaceAll(", |\\[|\\]","");
        return line;
    }
}
