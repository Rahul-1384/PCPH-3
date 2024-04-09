public class StackFuntions{
    int st[];
    int tos=-1;
    int size=0;
    public StackFuntions(){
        st=new int[5];
    }
    public StackFuntions(int size){
        st=new int[size];
    }
    public boolean isEmpty(){
        if(tos==-1){
            // System.out.println("stack is empty");
            return true;
        }
        return false;
    }
    public boolean isFull(){
        if(tos==st.length-1){
            // System.out.println("stack is full");
            return true;
        }
        return false;
    }
    public void push(int data) throws Exception{
        if(isFull()){
            throw new Exception("Overflow");
        }
        tos=tos+1;
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

    public int noOfElementsInAStack() throws Exception{
        if(isEmpty()){
            throw new Exception("Underflow");
        }
        int size=0;
        int temp=tos;
        while(temp!=-1){
            size++;
            temp=temp-1;    //temp--;
        }
        return size;
    }
}

