public class rec3reversestirng {
    public static void reversstring( String s, int in){
        if(in==0){
            System.out.println(s.charAt(in));
            return;
        }
        System.out.print(s.charAt(in));
        reversstring(s, in-1);
    }
        //find the 1st and last occurance of an element in string
    public static int first =-1;
    public static int last =-1;
    public static void fNlOccofanelement(String str, int index,  char element){
        if(index==str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char chrChar = str.charAt(index);
        if(chrChar==element){
            if(first ==-1){
                first =index;
            }
            else{
                last = index;
            }
        }
        fNlOccofanelement(str, index+1, element);

    }
    public static void main(String[] args) {
        String str = "abcdab";
        fNlOccofanelement(str, 0,'a');










    }
}
