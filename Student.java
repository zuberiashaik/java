package pack1;
interface person{
	void speak();
}
 class Teacher implements person{
	public void speak() {
		System.out.println("I am a teacher");
	}
 }
 class Student implements person {
	public void speak() {
		System.out.println("I am a student");
	}
 public static void main(String args[]) {
		Teacher t=new Teacher();
		Student s=new Student();
		t.speak();
		s.speak();
		
	}
	}