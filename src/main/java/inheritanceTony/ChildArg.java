package inheritanceTony;

public class ChildArg extends ParentArg {
    public ChildArg() {
        super((InheritancePrint) null);
        System.out.println("Child Constructor");
    }
}
