package com.miao.annotations.demo01;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * 注解的使用
 *
 * Java内建注解：
 *      1、@Override 复写父类方法时可使用。这样，父类被复写的方法被删除后悔报错
 *      2、@Deprecated 方法已过时，不建议使用
 *      3、@SuppressWarnings 忽略特定的警告

 *
 */
public class AnnotationExample {
    public static void main(String[] args) {
    }

    @Override
    @MethodInfo(author = "miao", comments = "Main method", date = "Nov 17 2012", revision = 1)
    public String toString() {
        return "Override toString method";
    }

    @Deprecated
    @MethodInfo(comments = "deprecated method", date = "Nov 17 2012")
    public static void oldMethod() {
        System.out.println("old method, don't use it.");
    }

    @SuppressWarnings({ "unchecked", "deprecation" })
    @MethodInfo(author = "Pankaj", comments = "Main method", date = "Nov 17 2012", revision = 10)
    public static void genericsTest() throws FileNotFoundException {
        List list = new ArrayList();
        list.add("abc");
        oldMethod();
    }

}
