package finalStaticTony;

public class FinalVariableTest {

    // a final variable
    // direct initialize
    final int THRESHOLD = 5;

    // a black final variable
    final int CAPACITY;

    // another black final variable
    final int MINIMUM;

    // a final static variable PI
    // direct initialize
    static final double PI = 3.141592653589793;

    // a black final static variable
    static final double EULERCONSTANT;

    // instance initializer block for
    // initializing CAPACITY
    {
        CAPACITY = 25;
    }

    // static initializer block for
    // initializing EULERCONSTANT
    static {
        EULERCONSTANT = 2.3;
    }

    // constructor for initializing MINIMUM
    // Note that if there are more than one
    // constructor, you must initialize MINIMUM
    // in them also
    public FinalVariableTest()
    {
        MINIMUM = -1;
    }
}
