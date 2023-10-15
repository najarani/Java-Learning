import java.util.Stack;
public class stackclass{
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        stack.push("Minecraft");
        stack.push("Skyrim");
        stack.push("Doom");
        stack.push("Borderlands");
        stack.push("FFVII");
        //String myfavgame = stack.pop();
        System.out.println(stack.peek());
        System.out.println(stack.search("lolbro"));


    }
}
