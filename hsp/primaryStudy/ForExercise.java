public class ForExercise{
	public static void main(String[] args){
		int count = 0;
		int sum = 0;
		for(int i = 1; i <= 100; i++){
			if(0 == i % 9){
				count += 1;
				sum += i;
			}
		}
		System.out.println("1-100������9�ı�����������" + count + "�����ܺ�Ϊ" + sum);
	}
}