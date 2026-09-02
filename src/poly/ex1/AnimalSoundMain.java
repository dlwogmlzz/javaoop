package poly.ex1;

public class AnimalSoundMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Caw caw = new Caw();
        Cat cat = new Cat();

        // 배열일 경우, 선언 타입을 하나 정해야 되는데..
        // Caw[] cawArr = {dog, cat, caw}; // 하나(caw)를 정하고 나서 다른 타입은 배열에 담을 수 없음

        // 다형성을 안쓰면 매번 동물이 추가 될때마다 위에 객체 생성, 출력문을 추가 해줘야한다.
        // 중복 코드가 발생하기 때문에 중복을 제거 해줘야한다.
        // 중복 코드를 제거하기 위해서는 메서드를 사용하거나, 또는 배열을 사용해야 하는데 셋다 다른 클래스(타입이 다름)이다...

        System.out.println("동물 소리 테스트 시작");
        dog.sound();
        System.out.println("동물 소리 테스트 종료");

        System.out.println("동물 소리 테스트 시작");
        cat.sound();
        System.out.println("동물 소리 테스트 종료");

        // System.out.println("동물 소리 테스트 시작");
        // caw.sound();
        // System.out.println("동물 소리 테스트 종료");
        // soundCaw(cat);  // 타입이 맞지 않아 에러.
        soundCaw(caw);
    }
    private static void soundCaw(Caw caw){ // 이 매개변수에는 Caw만 있기때문에 타입이 맞지 않아 다른 동물들은 호출할 수 없다.
        System.out.println("동물 소리 테스트 시작");
        caw.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
