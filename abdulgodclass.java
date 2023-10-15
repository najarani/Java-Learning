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
      public int sum(int n){
      if(n==0){
        return n;
      }
        int totalsum= n+ sum(n-1);
        return totalsum;
      }
    
    public static void main(String[]args) {
        abdulgodclass object = new abdulgodclass();
        System.out.println(object.sum(5));
        
       


         
}}
