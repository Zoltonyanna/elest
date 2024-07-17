public class MyClass {

    private SomeType someVariable;

    public MyClass(SomeType initialValue) {
        this.someVariable = initialValue;
    }

    public SomeType getSomeVariable() {
        return someVariable;  // returning the instance variable
    }
    
    public static void main(String[] args) {
        SomeType initialValue = new SomeType();
        MyClass myClassInstance = new MyClass(initialValue);
        SomeType value = myClassInstance.getSomeVariable();
        // use the returned value
    }
}
