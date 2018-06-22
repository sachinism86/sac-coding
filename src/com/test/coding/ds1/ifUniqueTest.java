package com.test.coding.ds1;

/**
 * Created by ssachin on 6/22/18.
 */
public class ifUniqueTest {
    public static void main(String args[]) {
        //test("abcdef");
        test("abcabcbb");
        //("a");
    }

    public static void test(String s) {
        System.out.println("\nIS UNIQUE chars in string :: "+IfUnique.ifUnique(s));
    }

}