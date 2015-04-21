package Chapter789;

/**
 * Created by kprakobkit on 4/10/15.
 */
public abstract class AbstractMonster implements Monster {
    private int hitPoints;
    private String name;
    private double damageFactor;

    public AbstractMonster(int iHitPoints, String iName, double iDamageFactor) {
        hitPoints = iHitPoints;
        name = iName;
        damageFactor = iDamageFactor;
    }

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
