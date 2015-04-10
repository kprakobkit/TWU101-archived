package Chapter789;

/**
 * Created by kprakobkit on 4/10/15.
 */
public abstract class Creature implements Monster {
    protected int hitPoints;
    protected String name;
    protected double damageFactor;

    public void takeDamage(int amount) {
        hitPoints -= amount * damageFactor;
    }

    public int currentHitPoints() {
        return hitPoints;
    }

    public String name() {
        return name;
    }
}
