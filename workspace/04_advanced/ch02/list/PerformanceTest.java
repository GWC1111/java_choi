package ch02.list;

public class PerformanceTest {
    void main() {
        int times = 100000;

        MyArray list = new MyArray(100000);

//        long start = System.currentTimeMillis();
//        addFirst(list, times);
//        System.out.println("저장된 수: " + list.size());
//        long end = System.currentTimeMillis();
//        System.out.println("MyArray addFirst 소요 시간: " + (end - start) + "ms");

        long start = System.currentTimeMillis();
        addLast(list, times);
        System.out.println("저장된 수: " + list.size());
        long end = System.currentTimeMillis();
        System.out.println("MyArray addFirst 소요 시간: " + (end - start) + "ms");
    }

    void addFirst(MyList list, int times) {
        for(int i=0; i<times; i++) {
            list.add(0, "데이터-" + i);
        }
    }

    void addLast(MyList list, int times) {
        for(int i=0; i<times; i++) {
            list.add("데이터-" + i);
        }
    }
}
