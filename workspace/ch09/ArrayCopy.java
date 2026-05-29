package ch09;

import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args){
        // 1. 얕은 복사 (Shallow Copy)
        int[] original = {10, 20, 30};
        int[] shallow = original;


        System.out.println("---- 1. 얕은 복사 ----");
        for(int i=0; i<original.length; i++){
            System.out.println("original: " + original[i] + ", shallow: " + shallow[i]);
        }


        shallow[0] = 99;
        original[0] = 88;


        for(int i=0; i<original.length; i++){
            System.out.println("original: " + original[i] + ", shallow: " + shallow[i]);
        }

        // 2. 깊은 복사 (Deep Copy) - 수동 복사 (for 문 사용)
        System.out.println("---- 2. 깊은 복사 - 수동 복사 (for 문 사용) ----");
        original = new int[]{10, 20, 30, 40, 50};
        shallow = new int[original.length];

//        shallow[0] = original[0]; // 10
//        shallow[1] = original[1]; // 20
//        shallow[2] = original[2]; // 30
//        shallow[3] = original[3]; // 40
//        shallow[4] = original[4]; // 50


        for(int i=0; i<original.length; i++){
            shallow[i] = original[i];
        }


        for(int i=0; i<original.length; i++){
            System.out.println("original: " + original[i] + ", shallow: " + shallow[i]);
        }


        shallow[0] = 99;
        original[0] = 88;


        for(int i=0; i<original.length; i++){
            System.out.println("original: " + original[i] + ", shallow: " + shallow[i]);
        }

        // 3. 깊은 복사 (System.arraycopy() 이용)
        System.out.println("---- 3. 깊은 복사 (System.arraycopy() 이용) ----");
        original = new int[]{10, 20, 30, 40, 50};
        shallow = new int[original.length];


        System.arraycopy(original, 2, shallow, 0, original.length-2);


        for(int i=0; i<original.length; i++){
            System.out.println("original: " + original[i] + ", shallow: " + shallow[i]);
        }


        shallow[0] = 99;
        original[0] = 88;


        for(int i=0; i<original.length; i++){
            System.out.println("original: " + original[i] + ", shallow: " + shallow[i]);
        }

        // 4. 깊은 복사 (Arrays.copyOf() 이용)
        System.out.println("---- 4. 깊은 복사 (Arrays.copyOf() 이용) ----");
        original = new int[]{10, 20, 30, 40, 50};
        shallow = Arrays.copyOf(original, original.length); // 배열의 깊은 복사


        for(int i=0; i<original.length; i++){
            System.out.println("original: " + original[i] + ", shallow: " + shallow[i]);
        }

        shallow[0] = 99;
        original[0] = 88;

        for(int i=0; i<original.length; i++){
            System.out.println("original: " + original[i] + ", shallow: " + shallow[i]);
        }
    }
}