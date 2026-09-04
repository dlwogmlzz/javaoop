package poly.ex6;

// 클래스 상속과 인터페이스 구현을 함께 사용.
public abstract class AbstractAnimal {
    // 순수 추상 메서드(구현)
    public abstract void sound();

    // 상속을 위한 메서드(상속)
    public void move() {
        System.out.println("동물이 이동합니다.");
    }
}
