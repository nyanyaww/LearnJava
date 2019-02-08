import java.util.Vector;

public class VectorTest {
    /*
     * 若Vector()参数缺省，则创建一个大小为10，增量每次递增2倍向量大小的向量
     * Vector(Collection c)参数也可以是集合元素c
     */
    private Vector vector_test1 = new Vector();

    void test() {
        System.out.println("初始化size = " + this.vector_test1.capacity());
        for (int i = 0; i < 1000; i++) {
            this.vector_test1.addElement(i);
            System.out.println(i + " " + this.vector_test1.capacity());
        }
    }
}