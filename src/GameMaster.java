import java.util.concurrent.Callable;

public class GameMaster {
    public static void main(String[] args) {
        Hero abel = new Hero("アベル",100,"鋼の剣");
        Slime s = new Slime("スライムA",30);
        System.out.println("冒険が始まる…！");
        abel.showStatus();
        s.showStatus();

        System.out.println("戦闘開始！");
        abel.attack(s);
        s.showStatus();
        s.attack(abel);
        abel.showStatus();
        abel.heal();
        abel.showStatus();
        abel.attack(s);
        abel.attack(s);
        abel.attack(s);
        System.out.println("--- 戦闘終了 ---");
        System.out.println("最終ステータス:");
        abel.showStatus();
        s.showStatus();
        System.out.println(abel.name + "は生きている:" + abel.isAlive());
        System.out.println(s.name + "は生きている:" + s.isAlive());
        System.out.println("--- 参照の確認 ---");

        Character partyMenber = abel;
        partyMenber.hp -= 50;
        System.out.println("partyMenber経由でHPを減らした後:");
        abel.showStatus();
    }
}
