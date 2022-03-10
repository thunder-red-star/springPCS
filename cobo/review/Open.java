public class Open {
    /*
     * An open ended project.
     */

    // The method that takes one parameter.
    public static String underscore(String x) {
        x = x.replaceAll("\\s+", "_")
        return x
    }

    // Another method that takes a parameter
    public static void coolMeter (String x) {
        String[] words = x.split(" ");
        int coolCounter = 0;
        for (String word : words) {
            if (word.toLowerCase().equals("cool")) {
                System.out.println("cool");
                coolCounter++;
            }
            else if (word.toLowerCase().equals("awesome")) {
                System.out.println("whoa!");
                coolCounter += 5;
            }
            else {
                System.out.println("not cool");
            }
        }
    }

    public static void main (String[] args) {
        String x = "Hello world!";
        System.out.println(underscore(x));
        System.out.println(coolMeter(x) + " coolness level.");

        String y = "I am cool, right? Actually, I'm awesome!";
        System.out.println(underscore(y));
        System.out.println(coolMeter(y) + " coolness level.");
    }
}