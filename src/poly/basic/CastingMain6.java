package poly.basic;

public class CastingMain6 {
    public static void main(String[] args) {
        Parent parent1 = new Parent();
        System.out.println("parent1 호출");
        call(parent1);

        Parent parent2 = new Child();
        System.out.println("parent2 호출");
        call(parent2);
    }

    private static void call(Parent parent) {
        parent.parentMethod();
        // Child 인스턴스인 경우 childMethod() 실행.
        if (parent instanceof Child child) {    // 16이후부터 'child' 이렇게 변수 선언이 가능함.
            System.out.println("Child 인스턴스가 맞음");
//            Child child = (Child) parent; // 위에서 parent instanceof Child 'child' 변수 선언을 해주면 필요없어짐.
            child.childMethod();
        }
    }
}
