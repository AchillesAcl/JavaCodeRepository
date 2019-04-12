package com.achilles.test;


public class Main {
    private static int[] arr = {1, 2, 3, 4};

    public static void main(String[] args) {
        while (arr.length != 0) {
            int[] ints = new DeleteArray().deleteArrayElement(0, arr);
            arr = ints;
            System.out.println(ints.length);
        }
    }
}
