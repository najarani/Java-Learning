public class rec3reversestirng {
    public static void reversstring( String s, int in){
        if(in==0){
            System.out.println(s.charAt(in));
            return;
        }
        System.out.print(s.charAt(in));
        reversstring(s, in-1);
    }
    public static void firstandlaststring( int index, String str){
        if(index==str.length()-1){
            System.out.println("last string is " + str.charAt(index));
            return;
        }
        if(index==0){
         System.out.println("first string is " +str.charAt(0));
        }
        
        firstandlaststring(index+1, str);

    }
    //find the 1st and last occurance of an element in string


    public static void main(String[] args) {
        String str = "abcd";
        firstandlaststring(0, str);
    }

    
}
