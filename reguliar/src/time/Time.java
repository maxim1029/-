package time;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Time
{
    public static void Time(String input)

    {

        Pattern pattern = Pattern.compile("(2[0-3]|[0-1]\\d):[0-5]\\d");
        Matcher matcher = pattern.matcher(input);
        while (matcher.find())
        {
            System.out.println(matcher.group());
        }

    }

}