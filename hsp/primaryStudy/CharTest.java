public class CharTest{

	public static void main(String[] args){
		// char������һ������ �����unicode���Ӧ���ַ�   ---->�������� 
		// Ҫ�����Ӧ�����֣�����(int)�ַ�  
		char c1 = '\t'; //�ַ�����ֻ���õ����ţ�˫����Ĭ��Ϊ�ַ������ᱨ��
		char c2 = 'a';
		char c3 = 'w';
		char c4 = 99; //�ַ����Ϳ���ֱ�Ӵ��һ������,ռ�������ֽ�

		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println((int)c3);  // ()ǿ������ת���ı�־

		//������0�ͷ�0����ʾtrue��false


		//����һ�����������ֵ��byteʱ�����жϸ���ֵ�ڲ���byte��Χ�ڣ�����Ǿ�OK
		//����Ǳ�����ֵ���� �ж�����
		byte i = 9;
		// char j = i; char�޷���  byte�з���
		// System.out.println(j);

		byte j = 7;
		// byte k = i + j;  byte char short ֻҪ�������㣬ȫ��ת����int����
//		System.out.println(k);
	}
} 