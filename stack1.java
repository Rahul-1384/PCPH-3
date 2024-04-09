public class stack1 {
    public class stack{
        int st[];
        int tos=-1;
        int size=0;
        public stack(){
            st=new int[5];
        }
        public stack(int size){
            st=new int[size];
        }
        public boolean isEmpty(){
            if(tos==-1){
                System.out.println("stack is empty");
                return true;
            }
            return false;
        }
        public boolean isFull(){
            if(tos==st.length-1){
                System.out.println("stack is full");
                return true;
            }
            return false;
        }
        public void push(int data) throws Exception{
            if(isFull()){
                throw new Exception("Overflow");
            }
            tos=tos++;
            st[tos]=data;
            size++;
        }
        public int pop() throws Exception{
            if(isEmpty()){
                throw new Exception("Underflow");
            }
            int data=st[tos];
            tos=tos--;
            size--;
            return data;
        }
        // peek--->it is used to see what data is at the TOS.
        public int peek() throws Exception{
            if(isEmpty()){
                throw new Exception("Underflow");
            }
            int data=st[tos];
            return data;
        }
    }
    public static void main(String[] args) {
        stack1 stk=new stack1();
    }
}
