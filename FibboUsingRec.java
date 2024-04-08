public class FibboUsingRec {
    static int n1=0;
    static int n2=1;
    static int n3=0;
    public static void fibbo(int n){
        if(n==0 ||n==1){
            return;
        }
        n3=n1+n2;
        n1=n2;
        n2=n3;
        System.out.print(n3+" ");
        fibbo(n-1);
        return;
    }
    public static void main(String[] args) {
        int n=5;
        System.out.print(n1+" "+n2+" ");
        fibbo(n);
    }
}
