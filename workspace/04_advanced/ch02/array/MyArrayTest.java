package ch02.array;

public class MyArrayTest {
    void main() {
//        MyArray arr = new MyArray();
        MyArray arr = new MyArray(5);

        arr.append(10);
        arr.append(20);
        arr.append(30);
        arr.append(40);
        arr.append(2, 25);

        System.out.println(arr);
    }
}
