public class oddEven {
    public static void oddandeven(int[] arr,int idx){
        if(idx<0 || idx>=arr.length){
            return;
        }
        if(arr[idx]%2!=0){
            System.out.println(arr[idx]);
        }
        oddandeven(arr, idx+1);
        
        if(arr[idx]%2==0){
            System.out.println(arr[idx]);
        }
    }
    public static void main(String[] args) {
        int[] array = {1,2,5,6,3,2};
        oddandeven(array, 0);
    }
}
