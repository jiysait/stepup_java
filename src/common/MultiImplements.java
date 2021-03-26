package common;

interface One {
    default void method() {
        System.out.println("One");
    }
}

interface Two {
    default void method() {
        System.out.println("Two");
    }
}

public class MultiImplements implements One, Two {
    /**
     * Refer to its Driver in order to execute
     */
    @Override
    public void method() {
        One.super.method();
        Two.super.method();
    }
}