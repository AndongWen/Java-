public class CharTest{

	public static void main(String[] args){
		// char本质是一个整数 输出是unicode码对应的字符   ---->可以运算 
		// 要输出对应的数字，可以(int)字符  
		char c1 = '\t'; //字符类型只能用单引号；双引号默认为字符串，会报错
		char c2 = 'a';
		char c3 = 'w';
		char c4 = 99; //字符类型可以直接存放一个数字,占用两个字节

		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println((int)c3);  // ()强制类型转换的标志

		//不可以0和非0来表示true和false


		//当把一个具体的数赋值给byte时，先判断该数值在不在byte范围内，如果是就OK
		//如果是变量赋值，先 判断类型
		byte i = 9;
		// char j = i; char无符号  byte有符号
		// System.out.println(j);

		byte j = 7;
		// byte k = i + j;  byte char short 只要参与运算，全部转换成int类型
//		System.out.println(k);
	}
} 