package ClassTest;


// 程序的入口
public class Demo {
    public static void main(String[] args) {
        People testPeople = new People("name", Sex.unknown);
        // People test_people = new ClassTest.People("MeowMeow", Sex.male);
        // test_people.set_age(14);
        // test_people.show_info();
        testPeople.set_age(21);
        testPeople.show_info();
    }
}
