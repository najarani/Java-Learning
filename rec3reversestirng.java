public class rec3reversestirng {
    public static void reversstring( String s, int in){
        if(in==0){
            System.out.println(s.charAt(in));
            return;
        }
        System.out.print(s.charAt(in));
        reversstring(s, in-1);
    }
    public static void main(String[] args) {
        String s = "abcd";
        reversstring(s, s.length()-1);
    }

    
}
