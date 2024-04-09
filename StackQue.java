import java.util.Stack;

public class StackQue {
    public static void main(String[] args) {
        String str="abcdef";
        Stack<Character> st=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            st.push(ch);
        }
        String newStr="";
        while(!st.isEmpty()){
            newStr+=st.pop();
        }
        System.out.println(newStr);
    }
}
