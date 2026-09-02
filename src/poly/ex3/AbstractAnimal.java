package poly.ex3;

// 추상메서드가 하나라도 있는 클래스는 무조건 추상클래스로 선언해야 한다.
public abstract class AbstractAnimal {

    // 불완전한 추상메서드 선언, 객체 생성이 안되게 추상클래스로 막아야함.
    // 자식이 반드시 오버라이딩 해야 되는 목적으로 생성
    public abstract void sound();

    // 자식의 기능을 상속받아서 사용하는 목적으로 생성
    public void move() {
        System.out.println("동물이 움직입니다.");
    }
}
