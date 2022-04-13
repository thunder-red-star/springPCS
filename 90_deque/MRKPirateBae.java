import java.util.Iterator;

public class MRKPirateBae {
    // The Pirate Bay is not very ethical... but the Pirate Bae is!

    public static void main (String[] args) {
        AllHandsOnDeque<String> plank = new AllHandsOnDeque<String>();

        plank.addFirst("Captain Jack Sparrow");
        plank.addFirst("Captain Barbossa");
        plank.addLast("Captain Blackbeard");
        plank.addFirst("Captain Hector Barbossa");
        plank.addLast("Captain Henry Morgan");
        plank.addFirst("Captain Elwood");
        plank.addLast("Captain Mykolyk");

        System.out.println(plank);

        plank.removeFirst();

        System.out.println(plank);

        plank.removeLast();

        System.out.println(plank);

        plank.pop();

        System.out.println(plank);

        plank.push("Captain Stuyvesant");

        System.out.println(plank);

        Iterator<String> it = plank.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}