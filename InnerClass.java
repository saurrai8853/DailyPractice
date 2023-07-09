public class InnerClass {
    private String msg="Welcome to java";
    class Inner{
        void hello(){
            System.out.println(msg+" "+"lets start learing.");
        }
    }
    public static void main(String[] args) {
    InnerClass obj1=new InnerClass();
    InnerClass.Inner in=obj1.new Inner();
    in.hello();
    }
}