package Chapter_6;

import java.util.*;
//修改字符串的对比方法
public class ComparatorTest {
    public static void main(String[] args) {
        LengthComparator str1 = new LengthComparator();
        int res = str1.compare("Anthony", "blackj");
        System.out.println(res);
    }
}
//Comparator（比较器）是Comparator接口的类的实例 此处可以不写，从java.util包中导入
//interface Comparator<T> {
//    int compare(T first, T second);
//}

class LengthComparator implements Comparator<String>{
    public int compare(String first, String second){
        return first.length() - second.length();
    }
}