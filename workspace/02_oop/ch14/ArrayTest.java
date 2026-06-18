package ch14;

import java.util.Arrays;

class ResizableArray {
    private String[] elements;
    private int size;

    public ResizableArray(int initialCapacity) {
        elements = new String[initialCapacity];
        size = 0;
    }

    public void add(String elem) {
        if(size == elements.length) {
            String[] tempList = new String[elements.length * 2];
            for(int i=0; i<elements.length; i++) {
                tempList[i] = elements[i];
            }
            elements = tempList;
        }
        elements[size++] = elem;
    }

    public String get(int index) {
        return elements[index];
    }

    public String toString() {
        return Arrays.toString(elements);
    }
}
public class ArrayTest {
    public static void main(String[] args) {
        ResizableArray list = new ResizableArray(2);

        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        list.add("Orange");
        list.add("Orange");

        System.out.println("인덱스 1의 요소: " + list.get(1));
        System.out.println(list);
    }
}
