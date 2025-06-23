abstract class Character implements Creature {
    String name;
    int hp;

    public final boolean isAlive(){
        return hp > 0;
    }

    public void showStatus(){
        System.out.println(this.name + ":" + this.hp);
    }
}
