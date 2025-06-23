abstract class Character implements Creature {
    String name;
    int hp;

    final boolean isAlive(){
        return hp > 0;
    }

    void showStatus(){
        System.out.println(this.name + ":" + this.hp);
    }
}
