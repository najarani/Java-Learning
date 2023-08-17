public class recursion2 {
    public static int powerof(int a,int b){
        if(a==0){
            return 0;
        }
        if(b==0){
            return 1;
        }
        int powerofnm1 = powerof(a, b-1);
        int finalans= a*powerofnm1;
        return finalans;
    }
    public static void main(String[] args) {
        
         System.out.println(powerof(2, 3));
    }
}
