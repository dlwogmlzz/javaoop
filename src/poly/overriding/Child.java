package poly.overriding;

public class Child extends Parent {

    public String value = "child";

    // 다형성 참조후 오버라이딩 된 메서드가 항상 우선권을 가진다.
    @Override
    public void method() {
        System.out.println("Child.method");
    }
}
