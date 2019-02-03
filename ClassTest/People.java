package ClassTest;

enum Sex {
    female, male, unknown,
}

// 测试一下类的写法
public class People {
    private String name;
    private int age = 0;
    private Sex sex;

    People(String name, Sex sex) {
        this.name = name;
        this.sex = sex;
    }

    void set_age(int age) {
        this.age = age;
    }

    public int get_age() {
        return this.age;
    }

    void show_info() {
        System.out.println("name = " + this.name);
        System.out.println("age = " + this.age);
        System.out.println("sex = " + this.sex);
    }
}