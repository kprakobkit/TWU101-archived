package Chapter789;

import java.util.ArrayList;

/**
 * Created by kprakobkit on 4/10/15.
 */
public class Chapter789TestDrive {
    public static void main(String[] args) {
        ArrayList<AbstractMonster> creatures = new ArrayList<AbstractMonster>();
        Orc orc = new Orc();
        Troll troll = new Troll();
        creatures.add(orc);
        creatures.add(troll);

        for (AbstractMonster creature:creatures) {
            creature.takeDamage(10);
        }

        System.out.println("Report: ");
        for (AbstractMonster creature:creatures) {
            System.out.println("Name = " + creature.name());
            System.out.println("Hit Points = " + creature.currentHitPoints());
        }
    }
}
