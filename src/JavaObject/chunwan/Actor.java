package JavaObject.chunwan;

public class Actor {
    private String name ;

    public Actor(){}


    public Actor(String name){
        setName(name);
    }

    public void perform(){
        System.out.println("actor " + name + " is performing");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
