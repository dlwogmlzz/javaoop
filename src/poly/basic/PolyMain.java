package poly.basic;

public class PolyMain {
    public static void main(String[] args) {
        // 부모 변수가 부모 인스턴스를 참조
        System.out.println("Parent → Parent");
        Parent parent = new Parent();
        parent.parentMethod();

        // 자식 변수가 자식 인스턴스를 참조
        System.out.println("Child → Child");
        Child child = new Child();
        // child가 parent를 상속했기때문에 부모 메서드도 불러진다.
        child.parentMethod();
        child.childMethod();

        // 부모 변수가 자식 인스턴스를 참조(다형적 참조)
        // 부모는 하위 자식(전부)을 담을 수 있음.
        System.out.println("Parent → Child");
        Parent poly = new Child();
        // Parent poly = new Grandson();    // Child보다 하위의 자손이 있어도 가능.
        poly.parentMethod();

        // Child child1 = new Parent();    // 자식새끼는 부모를 담을 수 없다.
        // poly.childMethod(); // 자식의 기능을 호출할 수 없음. 부모(Parent) 타입이기 때문에
        // 자식의 기능을 사용하고 싶으면 다운캐스팅을 해야한다.


    }
}
