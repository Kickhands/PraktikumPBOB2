package PBO.Praktikum3.LearnPBO3;

public class ExceptiononJava {
    public static void main(String[] args) {
        integer[] arrayInteger = new Integer[4];
        try{
            arrayInteger [2] = 11;
            arrayInteger [4] = 19;

        }catch (ArrayIndexOutOfBoundsException exception){
            exception.printStackTrace();
        }finally{
            System.out.println("Clean upCode...");
        }
    }
}
