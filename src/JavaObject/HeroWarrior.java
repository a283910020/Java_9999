package JavaObject;

public class HeroWarrior extends Hero {


    @Override
    public void move() {
        System.out.println("new method of move");
    }


    @Override
    public boolean equals(Object obj) {
        if(! (obj instanceof HeroWarrior)){
            return false;
        }
        HeroWarrior newWarrior = (HeroWarrior) obj;

        if (this.getLevel() == newWarrior.getLevel()){
            return true;
        }
        return false;

    }
}
