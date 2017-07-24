
public class PartialWordSearch {

    static String[] findWord(String x, String[] y){
        int arrSize = 0;
        String[]result;
        for (int i = 0; i < y.length; i++)
            if (y[i].toLowerCase().contains(x.toLowerCase())) arrSize ++;

        if (arrSize != 0){
            result = new String[arrSize];
        }else {
            result = new String[]{"Empty"};
        }

        int count = 0;
        for (int i = 0; i < y.length; i++)
            if (y[i].toLowerCase().contains(x.toLowerCase())){
                result[count] = y[i];
                count ++;
            }

        return result;
    }
}
