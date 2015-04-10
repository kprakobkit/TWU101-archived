package Chapter789;

import java.util.ArrayList;

/**
 * Created by kprakobkit on 4/10/15.
 */
public class Chapter789TestDrive {
    public static void main(String[] args) {
        ArrayList<Creature> creatures = new ArrayList<Creature>();
        Orc orc = new Orc();
        Troll troll = new Troll();
        creatures.add(orc);
        creatures.add(troll);

        for (Creature creature:creatures) {
            creature.takeDamage(10);
        }

        System.out.println("Report: ");
        for (Creature creature:creatures) {
            System.out.println("Name = " + creature.name());
            System.out.println("Hit Points = " + creature.currentHitPoints());
        }
    }
}
