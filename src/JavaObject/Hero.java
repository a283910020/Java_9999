package JavaObject;

public class Hero {

    private String nickName;
    private int level;
    private int maxLife;
    private int currLife;
//    private int

    public Hero(String nickName, int level, int maxLife, int currLife) {
        this.nickName = nickName;
        this.level = level;
        this.maxLife = maxLife;
        this.currLife = currLife;
    }

    public Hero() {
        super();
    }



    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getMaxLife() {
        return maxLife;
    }

    public void setMaxLife(int maxLife) {
        this.maxLife = maxLife;
    }

    public int getCurrLife() {
        return currLife;
    }

    public void setCurrLife(int currLife) {
        this.currLife = currLife;
    }



    //##########################################################################################

    public void move(){
        System.out.println("hero's moving method");
    }

}
