public class Hello{
	public static void main(String[] ar){
		System.out.println("Hello kiu kiu");
		Student stu=new Student("Cuong");
		stu.show();
	}
}
class Student{
	private String name;
	public Student(String name){
		this.name=name;
	}

	public void show(){
		System.out.println("Hello " + this.name);
	}
}
