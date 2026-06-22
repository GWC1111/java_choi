package ch01;

public class MultiCatchTest {
    void main() {
        divide4(100, new String[] {"hello"});
        divide4(100, new String[] {"  "});
        divide4(100, new String[] {});
        divide4(100, null);
        divide4(100, new String[] {null});

        System.out.println("프로그램 종료.");
    }

    void divide(int num1, String[] arr) {
        try{
            int num2 = arr[0].trim().length(); // str이 null일 경우 NullPointerException 발생
            int result = num1 / num2; // str이 ""일 경우 ArithmeticException 발생
            System.out.println(num1 + " / " + num2 + " = " + result);
        }catch(ArithmeticException | NullPointerException e){
            System.out.println(e.getMessage());
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("arr 사이즈가 0입니다.");
        }finally{
            System.out.println("finally는 try-catch 블럭이 실행된 뒤 항상 실행을 보장.");
        }

        System.out.println("finally 블럭과 try-catch 다음줄에 실행되는 코드는 무슨차이?");
    }

    void divide2(int num1, String[] arr) {
        // 올바른 예시: 하위 예외를 먼저 catch하고 상위 예외를 나중에 catch함
        try{
            int num2 = arr[0].trim().substring(0,10).length(); // str이 null일 경우 NullPointerException 발생
            int result = num1 / num2; // str이 ""일 경우 ArithmeticException 발생
            System.out.println(num1 + " / " + num2 + " = " + result);
        }catch(IndexOutOfBoundsException e){
            System.out.println("arr 사이즈가 0입니다.");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    void divide3(int num1, String[] arr) {
        // 올바른 예시: 하위 예외를 먼저 catch하고 상위 예외를 나중에 catch함
        try{
            int num2 = arr[0].trim().substring(0,10).length(); // str이 null일 경우 NullPointerException 발생
            int result = num1 / num2; // str이 ""일 경우 ArithmeticException 발생
            System.out.println(num1 + " / " + num2 + " = " + result);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    void divide4(int num1, String[] arr) {
        if(arr != null && arr.length > 0 && arr[0] != null && arr[0].trim().length() > 0) {
            int num2 = arr[0].trim().length(); // str이 null일 경우 NullPointerException 발생
            int result = num1 / num2; // str이 ""일 경우 ArithmeticException 발생
            System.out.println(num1 + " / " + num2 + " = " + result);
        }


    }
}
