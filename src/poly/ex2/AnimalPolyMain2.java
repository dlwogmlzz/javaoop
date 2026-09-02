package poly.ex2;

// 배열과 for문 활용 개선
public class AnimalPolyMain2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();
        Duck duck = new Duck();
        Animal[] animalArr = {dog, cat, caw, duck};

        // 동물이 추가되도 변하지 않음.
        for (Animal animal : animalArr) {   // iter, 향상된 for문
            System.out.println("동물 소리 테스트 시작");
            animal.sound();
            System.out.println("동물 소리 테스트 종료");
        }
    }
}
