package ThreadPractice;

public class Myexception {
    public static void meth (int age){
        try{
            if(age>18)
                throw new CustomException("heyy");
        }
        catch(CustomException ex){
            System.out.println( ex.getMessage());
        }
    }
    public static void main(String[] args) {
        meth(20);

    }
}
