//Print all permutations of a string"abc"
 class backtracking{
public static void printPermutation(String str, String prem,int idx){
    if(str.length()==0){
        System.out.println(prem);
        return;
    }
    for(int i=0;i<str.length(); i++){
        char currChar = str.charAt(i);
        String newStr = str.substring(0, i) + str.substring(i+1);
        printPermutation(newStr, prem +currChar, idx+1);
    }
}
public static void main(String[] args) {
    
String str = "abc";
printPermutation(str, "", 0);


}

}

//n queens

