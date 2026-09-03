package poly.diamond;

public class DiamondMain {
    public static void main(String[] args) {
        // 다형성, 부모는 자식을 담을 수 있다.
        InterfaceA a = new Child();
        a.methodA();
        a.methodCommon();

        InterfaceB b = new Child();
        b.methodB();
        b.methodCommon();
    }
}
