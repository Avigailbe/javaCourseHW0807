package home_work97;

import java.util.Random;

public class Soldier {
    private String name = "Avi";
    private int age;


    public Soldier(int age) {
        this.age = age;
        initSoldierName();
    }

    private void initSoldierName() {
        Random random = new Random();
        int randomName = random.nextInt(100);
        this.name = name+randomName;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public Integer getAge() {

        return age;
    }

    public void setAge(int age) {

        this.age = age;
    }
}
