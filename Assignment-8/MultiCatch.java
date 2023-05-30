public class MultiCatch {
    public static void main(String[] args){
        try{
            int[] arr={1,2,3};
            System.out.println(arr[4]);
        }
        catch(Exception e){
            System.out.println("Exception caught: "+e.getMessage());
        }
        finally{
            System.out.println("Array executed");
        }

        try{
            int x=5;
            System.out.println(x/0);
        }
        catch(Exception e1){
            System.out.println("Arithmetic Exception caught: "+e1.getMessage());
        }
    }    
}
