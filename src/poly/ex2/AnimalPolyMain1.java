package poly.ex2;

public class AnimalPolyMain1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();
        Duck duck = new Duck();

        // Animal로 해도 OK
        // Animal dog = new Dog();
        // Animal cat = new Cat();
        // Animal caw = new Caw();

        // 이제 Animal을 상속한 dog, cat, caw를 전부 호출 할수 있다.
        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(caw);
        soundAnimal(duck);
    }

    private static void soundAnimal(Animal animal) {    // ★핵심!! 매개변수를 부모인 Animal을 선언
        System.out.println("동물 소리 테스트 시작");
        // 오버라이딩이 여러개일 경우 오버라이딩 된 순서 대로 위에서 메서드 호출한 순서대로 실행됨.
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
