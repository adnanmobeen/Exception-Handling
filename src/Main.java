public class Main {
    public static void main(String[] args) {
//        System.out.println("A");
//        int i = 10;
//        int j = 5;
//        try {
//            int k = i / j;
//            int[]arr = {1,2,3,4};
//            System.out.println(arr[5]);
//        }
//
//        catch (ArithmeticException e){
//            System.out.println("B");
//        }
//        catch(ArrayIndexOutOfBoundsException e){
//            System.out.println("C");
//        }
//        catch(Exception e){
//            System.out.println("D");
//        }
//
//        finally {
//            System.out.println("E");
//        }
//        System.out.println("F");
//        try{
//            fun();
//        }
//        catch (ArithmeticException e){
//            System.out.println("padh le thoda");
//        }
//        catch (Exception e){
//            System.out.println("padh le thoda!!");
//        }
        try{
            fun(10);
        }
        catch(underageException e){
            System.out.println(e.getMessage());
        }

    }
//    public static void fun() throws Exception{
//        int i=10;
//        int j = 0;
//        System.out.println(i/j);
//        int[]arr = {1,2,3,4};
//            System.out.println(arr[5]);
//        System.out.println("A");
// }
      public static void fun(int age) throws underageException{
        if(age < 18){
            throw new underageException("bhai abhi chhota hai tu");
        }

      }
    public static class underageException extends Exception{
        public underageException(String message){
            super(message);
        }
    }
}