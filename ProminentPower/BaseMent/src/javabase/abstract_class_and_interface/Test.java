package javabase.abstract_class_and_interface;

/**
 * （1）抽象类可以有构造方法，接口中不能有构造方法。
 * （2）抽象类中可以有普通成员变量，接口中没有普通成员变量
 * （3）抽象类中可以包含静态方法，接口中不能包含静态方法
 * （4）一个类可以实现多个接口，但只能继承一个抽象类。
 * （5）接口可以被多重实现，抽象类只能被单一继承
 * （6）如果抽象类实现接口，则可以把接口中方法映射到抽象类中作为抽象方法而不必实现，而在抽象类的子类中实现接口中方法
 */

/**
 * 接口和抽象类的相同点：
 * (1) 都可以被继承
 * (2) 都不能被实例化
 * (3) 都可以包含方法声明
 * (4) 派生类必须实现未实现的方法
 */
//抽象方法没有方法体
public abstract class Test {
    public abstract void name();//抽象类中可以有抽象方法
    public void name(String name) {//抽象类中可以有非抽象的方法
        System.out.println(name);
    } //可以有非抽象方法

    //构造方法没有返回类型
    public Test() {
        this.name();
    }
    //抽象类中可以有static成员变量或者方法
    public static String name="HELLO";
    public static void main(String name)
    {

    }
}

/**
 * 接口中成员变量默认修饰符为public static final
 * 方法默认为Public abstract
 */
interface Test1{


}


