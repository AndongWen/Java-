package Chapter_5;

import java.util.*;
import java.lang.reflect.*;

public class ReflectionTest {
    public static void main(String[] args) throws ReflectiveOperationException{
        String name;
        if (args.length > 0) name = args[0];
        else{
            Scanner in = new Scanner(System.in);
            System.out.println("Enter class name: (e.g java.util.Date): ");
            name = in.next();
        }

        Class cl = Class.forName(name);

    }
}
