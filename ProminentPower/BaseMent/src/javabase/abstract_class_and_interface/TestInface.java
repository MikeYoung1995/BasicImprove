package javabase.abstract_class_and_interface;

/**
 * interface中所有的成员方法都是abstract的，当然也就不能定义静态方法static。
 * 如果可以定义抽象静态方法static，设 static abstract method(); 是抽象类A的方法
 * 那么因为是静态方法那可以用A.method();
 * 而这个方法又是抽象的没有方法体，调用了怎么执行呢？
 */
public interface TestInface {
    String name =""; //默认为Public static final
    int getAge();
    String getName();
    String getListView();
}
