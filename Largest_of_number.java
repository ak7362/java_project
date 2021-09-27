package java_project;

public class Largest_of_number {
	public static void main(String args[]) {
		int arr[]= {344,555,423,435,657,343,766,67,435,454,54};
		int highest=0;
		for(int i=0;i< arr.length;i++) {
			if(arr[i]>highest)
				highest=arr[i];
		}
		System.out.println("highest number="+highest);
		
	}

}
