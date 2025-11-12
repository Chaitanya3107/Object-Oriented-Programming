package exceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a=6;
        int b=0;
        divide(a,b);
        try{
            int c = a/b;

        } catch (Exception e) {
            System.out.println(e.getMessage());
//            throw new RuntimeException(e);
        }
        finally {
            System.out.println("This will always execute");
        }
    }
    static int divide(int a, int b) throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException("Please do not divide by zero");
        }
        return a/b;
    }
}
