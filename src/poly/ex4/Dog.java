package poly.ex4;

public class Dog extends AbstractAnimal {

    // 부모의 불완전한 메서드를 자식이 구현함.
    @Override
    public void sound() {
        System.out.println("멍멍");
    }

    @Override
    public void move() {
        System.out.println("개 이동");
    }
}
