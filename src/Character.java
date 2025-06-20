abstract class Character implements Creature {
    String name;
    int hp;

    public abstract void attack(Character target);

    public final boolean isAlive(){
        return hp > 0;
    }

    public void showStatus(){
        System.out.println(this.name + ":" + this.hp);
    }
}
