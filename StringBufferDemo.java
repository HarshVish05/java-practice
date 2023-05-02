public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("");
        int arr[]={1,2,3,4,5};
        sb.append("Vishwakarma");
        sb.insert(0, "Harsh");
        sb.append(5);
        sb.append(arr);
        sb.delete(16,sb.length());

        System.out.println(sb);
    }
    
}
