package day28;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {

		int [] nums = {1,8,69,4,2,7};
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		int Index = Arrays.binarySearch(nums, 4);
		System.out.println(Index);

	}

}
