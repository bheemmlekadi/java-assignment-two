package assignment;
//Program to sort an array using Quick Sort Algorithm.
public class assignmenttwo {
	
		public static void main(String[] args) {
			int[] numArray = {1,9,6,4,3,0,7,5,2,8};
			int temp;
			for(int i=0;i<numArray.length;i++) {
				for(int j=1;j<numArray.length-i;j++) {
					if(numArray[j]<numArray[j-1]) {
						temp=numArray[j];
						numArray[j] =  numArray[j-1];
						numArray[j-1]=temp;
					}
				}
			}
			for(int el:numArray) {
				System.out.println(el+" ");
			}
	}

}
