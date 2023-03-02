
public class ControlExercise{
	public static void main(String[] args) {
		double money = 100000;
		int count = 0;
		while(true){
			if(money > 50000){	
				money = money * .95;
				count++;
			}
			else if(money < 1000){
				break; 
			}
			else{
				money -= 1000;
				count++;
			}
		}
		System.out.println("拥有100000时候，可以经过" + count + "次路口");		

		int num = 0;
		for(int i = 1; i <= 100; i++){
			if(0 != i % 5){
				num++;
				System.out.print(i + "\t");
				if(0 == num % 5){
					System.out.println("");
				}
			}
		}	
	}
}