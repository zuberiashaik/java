package pack1;

public class MostFrequentElement {

	public static void main(String[] args) {
		int arr[]= {1,2,1,3,4,1};
		int count=0;
		int temp=0;
		 int res=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
			if(count>temp) {
				temp=count;
				res=arr[i];
			}
			
		}
		System.out.println("most frequent element:"+res);
		
		
	}

}
//output
//most frequent element:1
