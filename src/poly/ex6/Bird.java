package poly.ex6;

public class Bird extends AbstractAnimal implements Fly {

    @Override
    public void sound() {   // AbstractAnimal의 추상메서드
        System.out.println("짹짹");
    }

    @Override
    public void fly() {     // Fly의 추상메서드 구현
        System.out.println("새 날기");
    }
}
