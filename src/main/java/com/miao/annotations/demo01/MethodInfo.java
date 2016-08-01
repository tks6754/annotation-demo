package com.miao.annotations.demo01;

import java.lang.annotation.*;

/**
 * Created by miaokun on 2016/8/1.
 *
 * 元注解：（描述注解的注解）
 * @Documented 拥有这个注解的元素可以被javadoc此类的工具文档化
 * @Target 指明 该类型的注解 可以注解程序元素的范围。ElementType取值有：TYPE,METHOD,CONSTRUCTOR,FIELD等
 * @Inherited 指明 该注解类型 被自动继承。
 * @Retention 指明 该注解被保留的时间长短。 RetentionPolicy取值为：SOURCE,CLASS,RUNTIME。
 *
 * 自定义注解创建注意：
 *      1、注解声明关键字为 @interface
 *      2、注解方法不能有参数
 *      3、注解方法的返回值类型可以是：基本数据类型，String，Enums，Annotations 或者是这些类型的数组
 *      4、注解方法可以有默认值
 *      5、注解本身能够包含元注解，元注解是用来注解其他注解的注解。
 *
 *
 * 创建一个名为 MethodInfo 的注解
 */

@Documented
@Target(ElementType.METHOD)
@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface MethodInfo {
    String author() default "miao";
    String date();
    int revision() default 1;
    String comments();
}
