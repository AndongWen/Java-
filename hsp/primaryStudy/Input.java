import java.util.*;

public class Input{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in); 
		System.out.println("����������:");
		String name = scanner.next();
		System.out.println("����������:");
		int age = scanner.nextInt();
		System.out.println("������нˮ:");
		double sal = scanner.nextDouble();

		System.out.println("�˵���Ϣ���£�");
		System.out.println("����=" + name + " ����=" + age + " нˮ=" + sal);   
	}
}