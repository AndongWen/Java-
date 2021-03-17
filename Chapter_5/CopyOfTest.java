package Chapter_5;

import java.lang.reflect.*;
import java.util.*;

public class CopyOfTest {
    public static void main(String[] args){
        int[] a = {1, 2, 3, 4};
        a = (int[]) goodCopyOf(a, 4);
        System.out.println(Arrays.toString(a));

        String[] b = {"wad", "blackj", "Anthony"};
        b = (String[]) goodCopyOf(b, 4);
        System.out.println(Arrays.toString(b));

        System.out.println("====error====");
        b = (String[]) badCopyOf(b, 4);

    }


    public static Object[] badCopyOf(Object[] a, int newLength){
        Object[] newArray = new Object[newLength];
        System.arraycopy(a, 0, newArray, 0, Math.min(a.length, newLength));
        return newArray;
    }

    public static Object goodCopyOf(Object obj, int newLength){
        Class cl = obj.getClass();
        if (!cl.isArray()) return null;
        Class componentType = cl.getComponentType();
        int length = Array.getLength(obj);
        Object newArray = Array.newInstance(componentType, length);
        System.arraycopy(obj, 0, newArray, 0, Math.min(length, newLength));
        return newArray;
    }
}


