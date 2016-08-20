public class Hello{
	public static void main(String[] ar){
		System.out.println("Hello kiu kiu");
		Student stu=new Student("Cuong", "Ha Noi");
		stu.show();
	}
}
class Student{
	private String name;
	private String addr;
	public Student(String name, String addr){
		this.name=name;
		this.addr=addr;
	}

	public void show(){
		System.out.println("Hello " + this.name+", address: " + addr);
	}
}
