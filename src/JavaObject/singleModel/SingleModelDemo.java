package JavaObject.singleModel;

public class SingleModelDemo {
//    public int count = 0;
//    public SingleModelDemo(){count++;}

    private static SingleModelDemo me = null;

    public int count = 1;

    private SingleModelDemo(){
        count++;
    }

    public static SingleModelDemo getInstance(){
        // if me is null ==> only chance to getInstance
        if (me == null)
            me = new SingleModelDemo();
        return me;
    }


//    SingleModelDemo single = new SingleModelDemo();

//    public static void main(String[] args) {
//        SingleModelDemo single1 = new SingleModelDemo();
//        System.out.println(single1.count);
//        SingleModelDemo single2 = new SingleModelDemo();
//        System.out.println(single2.count);
//        SingleModelDemo single3 = new SingleModelDemo();
//        System.out.println(single3.count);
//        SingleModelDemo single4 = new SingleModelDemo();
//        System.out.println(single4.count);
//    }

}
