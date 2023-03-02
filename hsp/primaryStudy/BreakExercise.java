public class BreakExercise{
	public static void main(String[] args){
		int  sum = 0;
		int i = 1;
		for(; i <= 100; i++){
			sum += i;
			if(sum > 20){
				System.out.println("sum=" + sum + " i=" + i);
				break;
			}		 
		}
	}
}