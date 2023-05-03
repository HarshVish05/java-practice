package Exception;



public class ExceptionDemo {
    public static void main(String[] args) {

        int arr[] = new int[5];

        try{
            // int res = 100/0;
            arr[5]=9;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Index out of range "+ e.getMessage());
        }
        catch(Exception e){
            System.out.println("Invalid Calculation "+ e);
        }
        finally{
            System.out.println("fina block");
            arr[0]=4;
            arr[1]=7;
            arr[2]=3;
            for(int i=0; i<arr.length;i++){
                System.out.println(arr[i]);
            }
        }
    }
    
}
