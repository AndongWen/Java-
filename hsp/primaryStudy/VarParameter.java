public class VarParameter{
	public static void main(String[] args){
		T t1 = new T();
		System.out.println(t1.Method("Anthony", 60, 135, 100, 67));
	}
}

class T{
	public String Method(String name, double... socres){
		double totalSocres = 0;
		for(int i = 0 ; i < socres.length; i++){
			totalSocres += socres[i];
		}

		return name + "  " + socres.length + "门成绩的总分是：" + totalSocres;
	}
}