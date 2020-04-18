package JavaObject.chunwan;


public class Dancer extends Actor {

    public Dancer(){
        super();
    }

    public Dancer(String name){
        super(name);
    }

    @Override
    public void perform() {
        System.out.println("Dancer " + getName() + " is Dancing");
    }
}
