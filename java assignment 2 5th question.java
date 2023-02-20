package assignment;
//Program to sort an array using Selection Sort Algorithm.
public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numArray = {1,9,6,4,3,0,7,5,2,8};
		for(int i=0;i<numArray.length-1;i++) {
			int min_element =i;
		  for(int j=i+1;j<numArray.length;j++) {
			if(numArray[j]<numArray[min_element]) {
				   min_element=j;
				   
			}

		  }
		  int smallerNumber = numArray[min_element];
		  numArray[min_element]=numArray[i];
		  numArray[i]=smallerNumber;
		}
		for(int ele:numArray) {
			System.out.println(ele+" ");
		}
	}

}
