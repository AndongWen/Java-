public class ObjExercise{
	public static void main(String[] args){
		PassObject a = new PassObject();
		Circle c = new Circle(0);
		a.printAreas(c, 7);
	}
}

class Circle{
	double radius;
	public Circle(double radius){
		this.radius = radius;
	}

	public double findArea(){
		return Math.PI * radius * radius;
	}
}

class PassObject{
	public void printAreas(Circle c, int times){
		System.out.print("Radius" + "\t");
		System.out.print("Area" + "\t");
		System.out.println();
		for(int i = 1; i <= times; i++){
			c.radius = i;
			System.out.print(c.radius + "\t");
			System.out.print(c.findArea() + "\t");
			System.out.println();
		}
	}
}