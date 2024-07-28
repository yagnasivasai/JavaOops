//can be accessed from anywhere or global level
public class top_class_modifiers {
    private class p1{}
    protected class p2{}
    static class p3{}
}
// can be accessed from the inside of the package/within the package
class top_class_default_modifier{
    private class d1{}
    protected class d2{}
    static class d3{}

    //Private methods can be accesses within the same class
    private void m1(){
        System.out.println("Private class Method");
    }
}
// applicable for methods, classes.
abstract class top_class_abstract_modifier{
    // all classes supported by abstract class
    private class a1{}
    protected class a2{}
    static class a3{}

    //all methods supported by abstract class
    public abstract int method1();

}

// if child class implements all the methods from the parent class then the child class
// don't have to become abstract class otherwise child class should become abstract class
class child_class_abstract_modifier extends top_class_abstract_modifier{
    @Override
    public int method1() {
        return 100;
    }
}
class child_class_abstract_modifier2 extends top_class_abstract_modifier{
    @Override
    public int method1() {
        return 200;
    }
}
//
final class top_class_final_modifier {
    private class f1{}
    protected class f2{}
    static class f3{}
}
strictfp class top_class_strictfp_modifier {
    private class s1{}
    protected class s2{}
    static class s3{}
}