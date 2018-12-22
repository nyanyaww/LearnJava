package ClassTest;

// 程序的入口
public class Demo
{
    public static void main(String[] args)
    {
        People test_people = new People("MeowMeow", Sex.male);
        test_people.set_age(14);
        test_people.show_info();
    }
}
