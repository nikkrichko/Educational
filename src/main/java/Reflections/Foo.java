package Reflections;

import java.lang.reflect.Field;

/**
 * Created by никита on 07.01.14.
 */
public class Foo {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        FooInner fooInner = new FooInner();
        Class<?> fooInnerClass = fooInner.getClass();
        Field aField = fooInnerClass.getDeclaredField("B");
        fooInner.showA();
        aField.setAccessible(true);
        aField.setInt(fooInner, 12);
        fooInner.showA();
    }

}

class FooInner {

    private int C;

    public void showA() {
        System.out.println("C = " + C);
    }

}
