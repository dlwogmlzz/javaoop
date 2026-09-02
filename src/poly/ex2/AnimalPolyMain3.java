package poly.ex2;

// 배열과 for문 활용 개선+
public class AnimalPolyMain3 {
    public static void main(String[] args) {
        // ctrl + alt + n : 인라인 베리어블, 변수가 선언된 상태(Dog dog = new Dog()...)에서
        Animal[] animalArr = {new Dog(), new Cat(), new Caw(), new Duck(), new Dog()};

        // 동물이 추가되도 변하지 않음.
        for (Animal animal : animalArr) {   // iter, 향상된 for문
            soundAnimal(animal);
        }
    }

    // Extract Method : ctrl + alt + m, 중복된 코드 메서드로 만들때(중복 코드를 선택하고)
    private static void soundAnimal(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
