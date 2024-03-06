public class ExceptionOnArray {
    public static void main(String[] args) {
        integer[] arrayInteger = new Integer[4] ;
        try{
            arrayInteger[2] = 11;
            arrayInteger[4] = 10;
        }catch (ArrayIndexOutOfBoundsException){
            exception.printStackTrace();
        }finally{
            System.out.println("CleanUPCode...");
        }
    }
}
