package assignment;
// Program to find the duplicates present in an array.
public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[] numArray = {1,3,5,7,9,2,3,8,7,0};
			System.out.println("The duplicates present in Array are ");
			for(int i=0;i<numArray.length;i++) {
				for(int j=i+1;j<numArray.length;j++) {
					if (numArray[i]==numArray[j]){
						System.out.println(numArray[i]);
					}
				}
			}			
	}

}
