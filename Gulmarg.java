package pack1;

public class Gulmarg extends HillStation{
	@Override
	public void location() {
		System.out.println("location:gulmarg");
	}
	@Override
	public void famousFor() {
		System.out.println("famous for:cable car ride");
	}
	public static void main(String args[]) {
		HillStation Manali=new Manali();
		HillStation Mussoorie=new Mussoorie();
		HillStation Gulmarg=new Gulmarg();
		System.out.println("manali");
		Manali.location();
		Manali.famousFor();
		System.out.println("mussoorie");
		Mussoorie.location();
		Mussoorie.famousFor();
		System.out.println("gulmarg");
		Gulmarg.location();
		Gulmarg.famousFor();
	}
}
