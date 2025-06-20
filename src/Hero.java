public class Hero extends Character {
    public String weapon;

    public Hero(String name, int hp, String weapon) {
        super.name = name;
        super.hp = hp;
        this.weapon = weapon;
    }

    public void attack(Character target){
        System.out.println(this.name + "は" + this.weapon + "で攻撃！" + target.name + "に10のダメージを与えた！");
        target.hp -= 10;
    }
    public void heal(){
        System.out.println(this.name + "は回復の呪文を唱えた！HPが20回復した！");
        this.hp += 20;
    }
}
