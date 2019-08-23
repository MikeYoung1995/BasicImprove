package javabase.sytaxbasement;

public class Test  {

    String var_1="我是外部类非静态成员变量";
    static String var_2="我是外部类静态成员变量";

//    public abstract static name(); Java中不能定义抽象静态方法


    /**
     * 内部类
     */
     //1. 内部类中的变量和方法不能声明为静态的。
     //2、内部类实例化：B是A的内部类，实例化B：A.B b = new A().new B()。
     //3、内部类可以引用外部类的静态或者非静态属性及方法。
    class InnerClassA{
//        static String name=""; 这种情况会报错
        String name="YangYu";
        public void getTest(){
            System.out.println(Test.this.var_1);
            System.out.println(Test.this.var_2); //内部类可以用外部static修饰的类名.this.调用外部类
        }

    }

    /**
     * 静态内部类
     */
    //1、静态内部类属性和方法可以声明为静态的或者非静态的。
     //2、实例化静态内部类：B是A的静态内部类，A.B b = new A.B()。
     //3、静态内部类只能引用外部类的静态的属性及方法。
    static class StaticInnerClassA{
        static StringBuffer var1=new StringBuffer("我是静态内部类里的静态成员变量"); //线程安全 用于多线程
        StringBuffer var2=new StringBuffer("我是静态内部类里的非静态成员变量");
        StringBuilder var3=new StringBuilder("我是静态内部类里的非静态成员变量StringBuilder");//线程不安全 用于单线程synchronization
        void getTest1(){
//            System.out.println(Test.this.var_1);会报错 static 内部类只能调用外部类的static成员变量
            System.out.println(Test.var_2);
        }
     }
    public static void main(String[] name)
    {
        Test.InnerClassA innerClassA =new Test().new InnerClassA();
        Test.StaticInnerClassA staticInnerClassA =new StaticInnerClassA(); //不用new外部内 直接new自己
        System.out.println(innerClassA.name="张三");
        innerClassA.getTest();
        staticInnerClassA.getTest1();
        System.out.println(staticInnerClassA.var2);
        System.out.print(staticInnerClassA.var3);




    }
}
