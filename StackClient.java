public class StackClient {
    public static void main(String[] args) throws Exception{
        StackFuntions stk=new StackFuntions();
        System.out.println(stk.isEmpty());
        stk.push(10);
        stk.push(20);
        stk.push(30);
        stk.push(40);
        stk.push(50);
        System.out.println(stk.isFull());
        System.out.println(stk.pop());
        System.out.println(stk.peek());
    }
}
