public class ArithmeticOperator{
	public static void main(String[] args){
		// 取余运算的本质  a % b = a - a / b * b
		// 如果a是负数   则  a % b = a - (int)a /b * b
		System.out.println(10 % 3);   // 1
		System.out.println(-10 % 3);  // -1
		System.out.println(10 % -3);  // 1
		System.out.println(-10 % -3); // -1

		int i = 1;
		i = i++; //规则使用临时变量 (1)tep = i; (2)i = i + 1 (3) i = tem + 1
		System.out.println(i);  // 1
		int j = 1;
		j = ++j;
		System.out.println(j);  // 2
		int k = 7;
		boolean x = true;
		boolean y = false;
		if(x = false || y == false){ // if(x=false) ==> if(x)
			k ++ ;
		}
		System.out.println(k);

		//复合赋值运算符会进行类型的转换
		byte b = 4;
		b += 4; // ==> b = (byte)(b + 2)
		System.out.println(x^y);
		int c = 66;
		System.out.println(++c+c);
	}
}