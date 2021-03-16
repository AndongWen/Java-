package Chapter_5;

import java.util.*;

public class ObjectAnalyzerTest {
    public static void main(String[] args) throws ReflectiveOperationException{
        ArrayList<Integer> squares = new ArrayList<>();
        for (int i = 1; i <= 6; i++){
            squares.add(i * i);
            System.out.println(new ObjectAnalyzer().toString(squares));
        }
    }
}
