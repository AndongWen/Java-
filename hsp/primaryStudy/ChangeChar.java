/**
*
*/
public class ChangeChar {
	public static void main(String[] args){
		//  \t制表符  实现对齐的功能
		System.out.println("北京\t南京\t上海\t");
		//  \n换行符
		System.out.println("北京\n南京\n上海\n");
		//  \\ 一个斜杠
		System.out.println("C:\\\\Anthony");
		//  \"  "
		System.out.println("Anthony says\" good job! \"");
		//  \'  '
		System.out.println("Anthony says\' good job! \'"); 
		//  \r  回车  光标顶到最前面
		System.out.println("Anthony says\r good job! \r");

		System.out.println(100 + 24 + "AnthonyJ");

		System.out.println("AnthonyJ" + 1100 + 24);

		double num1 = 2.7;

		System.out.println(num1);

		double num2;

		num2 = 8.1 / 3;

		System.out.println(num2); //接近2.7
		// 对运算结果是小数的结果，进行比较判断，要小心
		// 应该是以两个数值差值的绝对值，再某个精度范围内判断
		System.out.println(2|3);
		System.out.println(2^3);
	}
}