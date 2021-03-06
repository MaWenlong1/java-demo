package com.mwl.lamada;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * @author mawenlong
 * @date 2018/11/21
 */
public class Test {
    public static void main(String[] args) {
        Runnable r = () -> System.out.println("hello world");
        r.run();
        Consumer<Integer> c = (Integer x) -> System.out.println(x);
        c.accept(1);
        BiConsumer<Integer, String> b = (Integer x, String y) -> System.out.println(x + " : " + y);
        b.accept(2, "22");
        Predicate<String> p = (String s) -> s == null;
        System.out.println(p.test("123"));
        WorkerInterface workerInterface = () -> {
            System.out.println("333");
        };
        workerInterface.doSomeWork();
        workerInterface.testDefault();
        Function<Integer, Integer> function = val -> val + 10;
        System.out.println(function.apply(777));
    }

}
