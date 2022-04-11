import java.util.*;

public class ALTest {
    public static void main (String[] args) {
        ArrayList<String> list = new ArrayList<String>();
	list.add("Hello");
	list.add("World");
	list.add("!");

	System.out.println(list.remove(0));
	System.out.println(Arrays.toString(list.toArray()));
    }
}
