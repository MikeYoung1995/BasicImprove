package basement;

/**
 * 1.内部类和静态内部类的区别
 * 2.接口和静态类的区别
 * 3.静态类和非静态类的区别
 */
public class Test001 {
    static String name="YangYu";
    String realname="IsAHero";
    static void getName(){
        System.out.println(name);
//        System.out.println(realname);//或报错 静态方法不能引用非静态变量

    }    //普通内部类

    /**
     * 1. 普通内部类中不能定义静态的变量和方法
     * 2.  普通内部类的实例化 A.B b =new A().new();
     * 3.   普通内部类可以引用外部类的静态和非静态的变量和方法
     */
    class InnerClass{
//        static string name="MMMM"; //会报错
//        static int getAge(){  return  0;   }//会报错
        public void showInfo(){
            System.out.println(name);
            System.out.println(realname);//可以调用静态和非静态的方法和变量
            getName();
        }



    }


    /**1. 静态内部类中可以定义静态变量和方法和非静态变量以及方法
     * 2. 静态内部类的实例化 A.B b =new A.B() 或者 A.B b =new B()
     * 3. 静态内部类不能引用外部类中非静态的变量和方法
     */
    static class StaticInnerClass{
        String address="Goat";
        static String wordsExplation="Great of All Time";
        public void testsomething(){
            System.out.println(name);
//            System.out.println(realname);//realname为非静态变量 会报错
            getName();
        }

    }//静态内部类
    public static void main(String[] args){

        //普通内部类的实例化
        Test001.InnerClass innerClass =new Test001().new InnerClass();
        innerClass.showInfo();
        //静态内部类的实例化
        Test001.StaticInnerClass staticInnerClass =new StaticInnerClass();
    }
}
