package JavaObject.chunwan;

public class TestChunWan {

    public static void main(String[] args) {
        Director ZhangYimou = new Director();

        Singer aaaaa = new Singer("aaaaa");
        Dancer bbbbb = new Dancer("bbbbb");

        ZhangYimou.action(aaaaa);
        ZhangYimou.action(bbbbb);



    }

}
