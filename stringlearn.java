import java.util.Scanner;

public class stringlearn {
    public static void main(String[] args) {
        //concatenation
        String firstName = "Tony";
        String lastName = "Tony";
        String sentence = "NirajanPoudel";
        String fName = sentence.substring(7, sentence.length());
        System.out.println(fName);
        if(firstName.compareTo(lastName)==0){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }

        //String fullName = firstName +" "+ lastName;
        //System.out.println(fullName.length());
        //charAt
        //for(int i=0; i<fullName.length(); i++){
          //  System.out.println(fullName.charAt(i));}
    }
}
