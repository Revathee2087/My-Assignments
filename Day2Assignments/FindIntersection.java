package week1.day2.Day2Assignments;

public class FindIntersection {

	public static void main(String[] args) {
		int[] nums={3,2,11,4,6,7};
		int[] nums1={1,2,8,4,9,7};
		for(int i=0;i<nums.length;i++) {
		for(int j=0;j<nums1.length;j++) {
			if(nums[i]==nums1[j]){
				System.out.println("Common numbers in both array:"+nums[i]);
			}
			
			
		}
		}
			
		
	}

}
