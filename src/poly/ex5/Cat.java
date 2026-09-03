package poly.ex5;

import java.sql.SQLOutput;

public class Cat implements InterfaceAnimal {
    @Override
    public void sound() {
        System.out.println("냥냥 펀치");
    }

    @Override
    public void move() {
        System.out.println("고양이 이동");
    }
}
