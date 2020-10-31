package practice;

public class Utility {

    public static String addStrings(String arg1, String arg2){



       String string1 = arg1.trim();
       String string2 = arg2.trim();
       String concactedString = string1.concat(string2);

        //use trim to get rid of leading and trailing spaces
        return concactedString;
    }
}
