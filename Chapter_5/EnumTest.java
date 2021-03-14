package Chapter_5;

import java.util.*;

public class EnumTest {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a size: {SMALL, MEDIUM, LARGE, EXTRA_LARGE}");
        String input = in.next().toUpperCase();
        Size size = Enum.valueOf(Size.class, input);
        System.out.println("size = " + size);
        System.out.println("abbreivation = " + size.getAbbreviation());
        if (size == Size.MEDIUM){
            System.out.println("you are right");
        }
    }
}

enum Size {
    SMALL("S"), MEDIUM("M"), LAGRE("L"), EXTRA_LAGRE("XL");

    private String abbreviation;

    private Size(String abbreviation){
        this.abbreviation = abbreviation;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

}
