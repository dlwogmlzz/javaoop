package poly.ex3;

public class HelloAnimal extends AbstractAnimal {

    // 추상 메서드는 상속 받는 자식 클래스가 반드시 오버라이딩 해서 사용해야 한다.
    // 오버라이딩 하지 않으면 자식도 추상 클래스가 되어야 한다.
    @Override
    public void sound() {
        System.out.println("HelloAnimal-sound");
    }
}
