
public class SwitchExam {
    public static void main(String[] args) {
        System.out.println(getValueViaYield("a"));
    }
    private static int getValueViaYield(String mode) {
        int result;
        switch (mode) {
            case "a":
            case "b":
                result = 1;
                break;
            case "c":
                result = 2;
                break;
            case "d":
            case "e":
            case "f":
                System.out.println("Supports multi line block!");
            default:
                result = -1;
                break;
        }
        return result;
    }
}
