package p;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Family {
    public static void Family()
    {
        String input = "Ухлов, Иванов, Петров, Сидоров";
        Pattern pattern = Pattern.compile("Иванов");
        Matcher matcher = pattern.matcher(input);

        if (matcher.find())
            System.out.println("Иванов найден");
        else
            System.out.println("Иванов не найден");
    }
}