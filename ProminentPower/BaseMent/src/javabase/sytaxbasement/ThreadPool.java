package javabase.sytaxbasement;

/**
 *Base knowledgement about ThreaadPool
 * 1.内部类 和静态内部类的区别和相同点 *
 * 2.访问修饰符(public private default protected)*
 * 3.多线程
 * 4.内部类的作用
 * 5.线程池
 * 6.重载和重写
 * 7.网络
 * 8.算法
 * 9.框架
 * 10.全局变量 局部变量
 * 11.Java反射机制
 * 12. ArrayList和LinkList的区别和联系
 * 13. HashMap和HashTable的区别和联系
 * 14. StringBuffer和StringBuilder
 * 15.
 *
 */
public class ThreadPool {
    static String name=null;
    int age=35;
    public static void main(String args[]){
        ThreadPool.InnerClassTest innerClassTest =new ThreadPool().new InnerClassTest();//内部类实例化
        ThreadPool.StaticInnerClassTest staticInnerClassTest =new ThreadPool.StaticInnerClassTest();

    }


    /**
     * 内部类 InnerClass
     * 1.内部类的属性不能是静态的
     * 2.内部类可以调用外部类的静态和非静态的属性和方法
     * 3.内部类实例化 A.B b =new A().new B();
     */
    class InnerClassTest{
        String name="Tom";
        String MyName=ThreadPool.name+"YangYu"+age;
        private String getName(int age){
            return null;
        }
    }

    /**
     * 静态内部类 StaticInnerClass
     * 1.StaticInnerClass can have static or nonStatic variable and method.
     * 2.StaticInnerClass can only call OuterClass's static variable and static method
     * 3.The simple of instantiating a StaticInnerClass: OuterClass.InnerClass innerclass = new OuterClass.InnerClass();
     *
     */
    static class StaticInnerClassTest{
        String Player="Oliver";
        static String RunnerName="Bolt";
        static void checkName(){}
//        String Test=ThreadPool.name+age;//This code is gonna have exception cause variable age is not static

    }


}
