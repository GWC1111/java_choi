package ch02.list;

public class MyLinkedListTest {
    public static void main(String[] args) {
        // 10개의 요소를 담을 수 있는 MyArray 객체를 생성한다.
        MyLinkedList myArr = new MyLinkedList();

        // MyArray에 "데이터-0" 부터 "데이터-4"까지의 문자열을 담는다.
        for(int i=0;i<5;i++) {
            myArr.appendTo("데이터-" + i);
        }

        // MyArray에 담긴 모든 요소를 출력한다. [데이터-0, 데이터-1, 데이터-2, 데이터-3, 데이터-4]
        System.out.println(myArr);

        // MyArray의 0번째 요소를 출력한다. 데이터-0
        System.out.println(myArr.get(0));

        // MyArray의 3번째 요소를 출력한다. 데이터-3
        System.out.println(myArr.get(3));

        // index 2를 삭제한다. 데이터-2
        myArr.remove(2);

        // MyArray에 담긴 모든 요소를 출력한다. [데이터-0, 데이터-1, 데이터-3, 데이터-4]
        System.out.println(myArr);

        // index 2에 데이터-5를 삽입한다.
        myArr.appendTo(2, "데이터-5");

        // MyArray에 담긴 모든 요소를 출력한다. [데이터-0, 데이터-1, 데이터-5, 데이터-3, 데이터-4]
        System.out.println(myArr);

        // 마지막 위치에 데이터-6을 추가한다.
        myArr.appendTo("데이터-6");

        // MyArray에 담긴 모든 요소를 출력한다. [데이터-0, 데이터-1, 데이터-5, 데이터-3, 데이터-4, 데이터-6]
        System.out.println(myArr);

        System.out.println("갯수: " + myArr.size());


    }
}
