package assignment;
//Program to check whether an array is a subset of another array.
public class checkSubset {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  int[] mainArray = {1,9,6,4,3,0,7,5,2,8};
	  int[] subArray = {8,9,3,7};
	  boolean temp=false;
	  for(int i=0;i<subArray.length;i++) {
	    for (int j=0;j<mainArray.length;j++) {
		 if(subArray[i]==mainArray[j]) {
		    break;
		 }	
	    }
		if(mainArray.length==subArray.length) {
		  temp=false;
		}
		else {
		  temp=true;
		 }
	  }
	  System.out.println(temp);

	}

}
