/**
 * a program for Divison operator
 * @author prashanth
 * @since 27/07/2023
 */
public class findthelargestnumber {

	public class Largest {
	    static int findLargest(int[] nums)
	    {
	        int largestNum=nums[0];
	        for(int i=1;i<nums.length;i++)
	        {
	            if(nums[i]>largestNum)
	            {
	                largestNum=nums[i];
	            }
	        }
	        return largestNum;      
	    }
	    public static void main(String[] args) {
	        int[] data= {74,56,51,48,90,12,5};
	        System.out.println(findLargest(data));
	    }

	 
	}
	}