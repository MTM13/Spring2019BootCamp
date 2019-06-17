package day27;

public class ForEachLoop {

	public static void main(String[] args) {
	
		
		int [] nums = {1,33,567,11,22};
//		for (int i = 0; i < nums.length; i++) {
//			int eachItem = nums[i];
//			System.out.println(eachItem);
//		}
       // for each loop sytax 
		//for ( eachItemDataType Variable name  : collectionVariable ) {
		//your action in here 
		//    }
		// for each loop can only be used for looping through collection type
		for(int  eachItem   :    nums) {
			System.out.println(eachItem);
		}
		//----------------------------------------------------
		String [] names = {"Ali","ahmed","mustafa","akbar"};
		for( String    all :     names) {
			System.out.print(all+" ");
		}
		
		
		
		
	}

}
