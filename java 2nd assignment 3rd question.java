package assignment;

public class bubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numArray = {1,9,6,4,3,0,7,5,2,8};
		int temp=0;
		for(int i=0;i<numArray.length;i++) {
			for(int j=1;j<(numArray.length-i);j++) {
				if(numArray[j-1]>numArray[j]) {
					temp=numArray[j-1];
					numArray[j-1]=numArray[j];
					numArray[j]=temp;
				}
			}
		}
		for(int ele:numArray) {
			System.out.println(ele);
		}
	}

}
