import java.util.Scanner;

public class Recursion{
	public static void main(String[] args){
		Scanner myScaner = new Scanner(System.in);
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个正数");
		int num = myScaner.nextInt();
		Tools myTools = new Tools();
		int res = myTools.fab(num);
		System.out.println(res);
	}
}

class Tools{
	public int fab(int num){
		if(num == 1 || num == 2){
			return 1;
		}
		else{
			return fab(num-1) + fab(num-2);
		}
	}
}