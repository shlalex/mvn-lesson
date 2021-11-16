package by.academy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        List<String> dark = new ArrayList<>();
        dark.add("1VVVVV");
        dark.add("2VVVVV");
        dark.add("3VVVVV");
        dark.add("4VVVVV");
        dark.add("5VVVVV");
        for (String s : Arrays.asList(dark.get(2).toString(), dark.toString())) {
        System.out.println(s);
    }


        //System.out.println( "bvvfdv");
    }
}
