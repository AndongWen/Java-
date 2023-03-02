import java.util.*;

public class MultForExercise{
	public static void main(String[] args){
		for(int i = 1; i <= 9; i++){
			for(int j = 1; j <= i; j++){
				System.out.print(j + " * " + i + " = " + i*j);
				System.out.print("\t");  
			}
			System.out.print("\n");
		}

		//半个金字塔
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请金字塔的层数:");
		int totalLevel = myScanner.nextInt();
		for(int i = 1; i <= totalLevel; i++){
			for(int j = 1; j <= i; j++){
				System.out.print("*");
			}
			System.out.print("\n");
		}

		//整个金字塔
		for(int i = 1; i <= totalLevel; i++){
			for(int j = 1; j <= totalLevel - i; j++){
				System.out.print(" ");
			}
			for(int j = 1; j <= 2 * i - 1; j++){
				System.out.print("*");
			}
			System.out.print("\n");
		}

		//空心金字塔
		for(int i = 1; i <= totalLevel; i++){
			for(int j = 1; j <= totalLevel - i; j++){
				System.out.print(" ");
			}
			for(int j = 1; j <= 2 * i - 1; j++){
				if(1 == j || 2 * i - 1 == j || i == totalLevel){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}  
			}
			System.out.print("\n");
		}
	}
}