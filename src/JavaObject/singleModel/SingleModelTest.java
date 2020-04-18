package JavaObject.singleModel;

public class SingleModelTest {

    public static void main(String[] args) {
        SingleModelDemo single1 = SingleModelDemo.getInstance();
        System.out.println(single1.count);
        single1.count ++;

        SingleModelDemo single2 = SingleModelDemo.getInstance();
        System.out.println(single2.count );

        System.out.println(single1 == single2);
    }
}
