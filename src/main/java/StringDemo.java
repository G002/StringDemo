import java.time.ZoneId;
import java.util.Arrays;
import java.util.IdentityHashMap;

/**
 * Created by geethakalluri on 8/13/16.
 */
public class StringDemo {

    public static void main(String [] args){
        String greeting = "Hello";
        String location = "Java" + greeting;
        System.out.println(location);

        int age =25;
        System.out.println("next year age is " + age +1);
        System.out.println("next year age is " + (age +1));

        String output = age + " years";
        System.out.println("age is " + output);

        String names = String.join(" ", "Peter", "Paul", "Mary");
        System.out.println(names);

        // String Builder

        StringBuilder builder = new StringBuilder();
        for(String Id: ZoneId.getAvailableZoneIds()){
            builder.append(Id);
            builder.append(",");

        }
        String result = builder.toString();
        System.out.println(result.substring(0,200) + "...");
        System.out.println(result.length());

        greeting = "Hello, World!";
        location = greeting.substring(7, 12);
        System.out.println(location);

        System.out.println(location.equals("World"));
        System.out.println(location == "World");
        System.out.println(location.equalsIgnoreCase("world"));

        int n= 10;
        String str= Integer.toString(n,2);
        System.out.println(str);

        n = Integer.parseInt(str);
        System.out.println(n);

        n = Integer.parseInt(str,2);
        System.out.println(n);

        System.out.println(greeting.toUpperCase());
        System.out.println(greeting);

        String Javatm = "Java\u2122";
        System.out.println(Javatm);
        System.out.println(Arrays.toString(Javatm.codePoints().toArray()));

        String octonians = "\ud835\udd46";
        System.out.println(octonians);

    }

}
