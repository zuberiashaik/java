package pack1;

public class FibanocciSeries {

	

	public static void main(String[] args) {
		//fibanocci series means by adding 2 numbers we have to get the next number in the series
		int n = 6;
		int sum =0;
		int first_number = 0, second_number = 1;
		for(int i=0;i<=6;i++) {
			System.out.print(first_number + "  ");//0 1 2 3
			 sum = first_number + second_number;//1 2 3 5
			first_number = second_number;//1 1 2 3
			second_number = sum;//1 2 3 5
		}
	}

}


//output
// 0 1 1 2 3 5 8