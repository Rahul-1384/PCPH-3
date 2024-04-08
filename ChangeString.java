public class ChangeString {
    public static void main(String[] args) {
        String str="Rahul";
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(Character.isLowerCase(ch)){
                sb.append(Character.toUpperCase(ch));
            }
            else if(Character.isUpperCase(ch)){
                sb.append(Character.toLowerCase(ch));
            }
        }
        System.out.println(sb);
    }
}
