package javabase;

/**
 * 访问修饰符测试
 * 内部类和静态内部类的区别
 * 内部类的作用
 * 匿名内部类
 * 为什么Java程序如口是main方法
 */
 class AccessSymbolTest { //状态为default 只能同一个包内访问 甚至外包子类都不能访问
    protected static String name="YangYu"; //这个字符串成员变量只能在同一个包和子类中访问

// 状态为default 只能同一个包中的类访问
    public static void main(String[] word)
    {
        System.out.print(name);
    }
}
