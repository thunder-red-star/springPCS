/**
 * / ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ \
 * |  /~~\                                                       /~~\  |
 * |\ \   |  William Vongphanith, Jacob Kirmayer, Ari Gurovich  |   / /|
 * | \   /|                        APCS                         |\   / |
 * |  ~~  |            HW76 -- Building Linked Lists            |  ~~  |
 * |      |                     2022-03-14m                     |      |
 * |      |                Time elapsed: 0.8hrs                 |      |
 * |      |                                                     |      |
 * \     |~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|     /
 *  \   /                                                       \   /
 *   ~~~                                                         ~~~
 * (generated with boxes -- boxes -a c d scroll <<< "design")
 */

// Uses the LLNode class from HW75 to construct the Linked List class.
// Note: I made the cargo and next variables public because I accidentally used the variables instead of the getter methods and refactoring would take a lot of time.

public class LList implements List {
    // Instance vars
    private LLNode head;
    private int size;

    // Constructor
    public LList() {
        head = null;
        size = 0;
    }

    public boolean add (String s) {
        LLNode newHead = new LLNode(s, this.head);
        this.head = newHead;
	    size++;
	    return true;
    }

    public String get(int index) {
        if (index < 0 || index >= size) {
            return null;
        }
        LLNode curr = head;
        for (int i = 0; i < size-index-1; i++) {
            curr = curr.next;
        }
        return curr.cargo;
    }

    public String set(int index, String s) {
        if (index < 0 || index >= size) {
            return null;
        }
        LLNode curr = head;
        for (int i = 0; i < size-index-1; i++) {
            curr = curr.next;
        }
        String old = curr.cargo;
        curr.cargo = s;
        return s;
    }

    public int size() {
        return size;
    }

    // Other methods not in interface
    public String toString() {
        String result = "";
        LLNode curr = head;
        result += curr.cargo + "]";
        curr = curr.next;
        while (curr != null) {
            result = Utils.addToBeginning(result, curr.cargo + " -> ");
            curr = curr.next;
        }
        result = Utils.addToBeginning(result, "[");
        return result;
    }

    // Main method for testing
    public static void main(String[] args) {
        LList tongueTwister = new LList();
        String[] words = "Imagine an imaginary menagerie manager managing an imaginary menagerie".split(" ");
        for (int i = 0; i < words.length; i++) {
            tongueTwister.add(words[i]);
        }
        System.out.println(tongueTwister);

        LList getTest = new LList();
        for (int i = 0; i < 18; i++) {
            getTest.add(i + "");
        }

        System.out.println("The element at index 0 is " + getTest.get(0));
        System.out.println("The element at index 1 is " + getTest.get(1));
        System.out.println("The element at index 5 is " + getTest.get(5));
        System.out.println("The element at index 17 is " + getTest.get(17));

        System.out.println(getTest);

        LList setTest = new LList();
        for (int i = 0; i < 18; i++) {
            setTest.add(i + "");
        }

        System.out.println("The element at index 0 is currently " + setTest.get(0));
        System.out.println("The element at index 0 is now " + setTest.set(0, "13"));
        System.out.println("The element at index 3 is currently " + setTest.get(3));
        System.out.println("The element at index 3 is now " + setTest.set(3, "e"));
        System.out.println("The element at index 17 is currently " + setTest.get(17));
        System.out.println("The element at index 17 is now " + setTest.set(17, "a picture of a dog"));

        System.out.println(setTest);
    }
}

//Utils for hacking stuff
class Utils {
    public static String addToBeginning (String original, String s) {
        return s + original;
    }
}
