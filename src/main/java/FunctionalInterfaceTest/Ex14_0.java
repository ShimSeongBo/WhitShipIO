package FunctionalInterfaceTest;

//자바의 정석 함수 인터페이스 강의
public class Ex14_0 {
    public static void main(String[] args) {
//        MyFunctionEx2 f = new MyFunctionEx2() {
//            public int max(int a, int b) {
//                return Math.max(a, b);
//            }
//        };

        // int value = f.max(3, 5); // 함수형 인터페이스

        MyFunctionEx2 f = (a, b) -> a > b ? a : b;
    }
}

@FunctionalInterface //화장실엔 하나의 변기..
interface MyFunctionEx2 {
    int max(int a, int b);
}
