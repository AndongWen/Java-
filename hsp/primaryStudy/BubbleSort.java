import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int[] arry = {1, 35, 5467, 76923, 6523, 875, 8967, 18964, 17, 83, 35687};
        System.out.println("排序之前的数组为：");
        int arryLength = arry.length;
        for (int i = 0; i < arryLength; i++) {
            System.out.print(arry[i] + "\t");
        }
        for (int i = arryLength - 1; i >= 1; i--) {
            for (int j = i - 1; j >= 0; j--) {
                int temp;
                if (arry[j] > arry[i]) {
                    temp = arry[i];
                    arry[i] = arry[j];
                    arry[j] = temp;
                }
            }
        }
        System.out.println("排序之后的数组为：");
        for (int i = 0; i < arryLength; i++) {
            System.out.print(arry[i] + "\t");
        }
        String[] names = new String[7];
        String[] strs = new String[]{"asdfg", "dsqtg", "edsqtg"};

    }
}