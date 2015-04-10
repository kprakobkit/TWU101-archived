package Chapter789;

/**
 * Created by kprakobkit on 4/10/15.
 */
public class Troll extends Creature implements Monster {
    public Troll() {
        this.hitPoints = 40;
        this.name = "Troll";
        this.damageFactor = 0.5;
    }
}
