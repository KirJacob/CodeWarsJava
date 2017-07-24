public class Covfefe {
    public static String covfefe(String tweet) {
        final String codeWord ="coverage";
        final String replaceWord ="covfefe";
        String result="";
        if (tweet.contains(codeWord))
            result = tweet.replace(codeWord, replaceWord);
        else result = tweet.concat(" " + replaceWord);
        return result;
    }
}
