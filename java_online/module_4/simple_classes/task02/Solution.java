package by.java_online.module_4.simple_classes.task02;

public class Solution {

    public static void main(String[] args) {

        Test2 test2 = new Test2();
        System.out.println(test2.getFirstVar());
        System.out.println(test2.getSecondVar());

        Test2 test = new Test2(14,19);
        test.setFirstVar(27);
        test.setSecondVar(42);
        System.out.println(test.getFirstVar());
        System.out.println(test.getSecondVar());
    }
}
