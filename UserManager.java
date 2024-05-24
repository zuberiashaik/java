package pack1;

public class UserManager {

	String name="zara",pin="1234",email="zara@gmail.com";
	int num=4567,pin1=1234;

	public void match(String user,String password) {
		if(name==user && pin==password) {
			System.out.println("matched");
		}else {
			System.out.println("unmatched");
		}
	}
	public void match(String mail,int password) {
		if(email==mail && pin1==password) {
			System.out.println("matched");
		}else {
			System.out.println("unmatched");
		}
	}
	public void match(int phno,String password) {
		if(num==phno && pin==password) {
			System.out.println("matched");
		}else {
			System.out.println("unmatched");
		}
	}

	public static void main(String[] args) {
		UserManager g=new UserManager();
		g.match("zara","1234");
		g.match("zara@gmail.com",1234);
		g.match(4567, "1234");
		
	}

}
