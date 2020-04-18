package JavaObject.chunwan;


public class Singer extends Actor {

    public Singer(){
        super();
    }

    public Singer(String name){
        super(name);
    }

    @Override
    public void perform() {
        System.out.println("singer " + getName() + " is singing");
    }
}
