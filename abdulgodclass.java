public class abdulgodclass{
    public boolean containsDuplicate(int[] nums) {
        for (int i = 0; i<nums.length; i++){
            int currchar = nums[0];
            for(int j=i+1; j<nums.length; j++){
                int secchar = nums[j];
                if(currchar == secchar){
                    return true;
                }
                
            }

        }
        return false;
      }
    
    public static void main(String[]args) {
        abdulgodclass object = new abdulgodclass();
        int[] nums = {1,2,3,1};
        System.out.println(object.containsDuplicate(nums));
       


         
}}
