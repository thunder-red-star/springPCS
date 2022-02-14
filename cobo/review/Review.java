import java.util.Scanner;
import java.io.File;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Random;
import java.io.*;

// import filewriter and bufferedwriter
import java.io.FileWriter;
import java.io.BufferedWriter;

/**
 * Class that contains helper methods for the Review Lab
 **/
public class Review {

    private static HashMap<String, Double> sentiment = new HashMap<String, Double>();
    private static ArrayList<String> posAdjectives = new ArrayList<String>();
    private static ArrayList<String> negAdjectives = new ArrayList<String>();


    private static final String SPACE = " ";

    static {
        try {
            Scanner input = new Scanner(new File("cleanSentiment.csv"));
            while (input.hasNextLine()) {
                String[] temp = input.nextLine().split(",");
                sentiment.put(temp[0], Double.parseDouble(temp[1]));
                //System.out.println("added "+ temp[0]+", "+temp[1]);
            }
            input.close();
        } catch (Exception e) {
            System.out.println("Error reading or parsing cleanSentiment.csv");
        }


        //read in the positive adjectives in postiveAdjectives.txt
        try {
            Scanner input = new Scanner(new File("positiveAdjectives.txt"));
            while (input.hasNextLine()) {
                String temp = input.nextLine().trim();
                System.out.println(temp);
                posAdjectives.add(temp);
            }
            input.close();
        } catch (Exception e) {
            System.out.println("Error reading or parsing postitiveAdjectives.txt\n" + e);
        }

        //read in the negative adjectives in negativeAdjectives.txt
        try {
            Scanner input = new Scanner(new File("negativeAdjectives.txt"));
            while (input.hasNextLine()) {
                negAdjectives.add(input.nextLine().trim());
            }
            input.close();
        } catch (Exception e) {
            System.out.println("Error reading or parsing negativeAdjectives.txt");
        }
    }

    /**
     * returns a string containing all of the text in fileName (including punctuation),
     * with words separated by a single space
     */
    public static String textToString(String fileName) {
        String temp = "";
        try {
            Scanner input = new Scanner(new File(fileName));

            //add 'words' in the file to the string, separated by a single space
            while (input.hasNext()) {
                temp = temp + input.next() + " ";
            }
            input.close();

        } catch (Exception e) {
            System.out.println("Unable to locate " + fileName);
        }
        //make sure to remove any additional space that may have been added at the end of the string.
        return temp.trim();
    }

    /**
     * @returns the sentiment value of word as a number between -1 (very negative) to 1 (very positive sentiment)
     */
    public static double sentimentVal(String word) {
        try {
            return sentiment.get(word.toLowerCase());
        } catch (Exception e) {
            return 0;
        }
    }

    /**
     * Returns the ending punctuation of a string, or the empty string if there is none
     */
    public static String getPunctuation(String word) {
        String punc = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            if (!Character.isLetterOrDigit(word.charAt(i))) {
                punc = punc + word.charAt(i);
            } else {
                return punc;
            }
        }
        return punc;
    }

    /**
     * Returns the word after removing any beginning or ending punctuation
     */
    public static String removePunctuation(String word) {
        while (word.length() > 0 && !Character.isAlphabetic(word.charAt(0))) {
            word = word.substring(1);
        }
        while (word.length() > 0 && !Character.isAlphabetic(word.charAt(word.length() - 1))) {
            word = word.substring(0, word.length() - 1);
        }

        return word;
    }

    /**
     * Randomly picks a positive adjective from the positiveAdjectives.txt file and returns it.
     */
    public static String randomPositiveAdj() {
        int index = (int) (Math.random() * posAdjectives.size());
        return posAdjectives.get(index);
    }

    /**
     * Randomly picks a negative adjective from the negativeAdjectives.txt file and returns it.
     */
    public static String randomNegativeAdj() {
        int index = (int) (Math.random() * negAdjectives.size());
        return negAdjectives.get(index);

    }

    /**
     * Randomly picks a positive or negative adjective and returns it.
     */
    public static String randomAdjective() {
        boolean positive = Math.random() < .5;
        if (positive) {
            return randomPositiveAdj();
        } else {
            return randomNegativeAdj();
        }
    }

    /**
     * @param text the filename that contains a string to be analyzed
     * @returns the total sentiment of a review in a file measured by the sum of the values of each word in the review
     * (positive and negative)
     */
    public static double totalSentiment(String filename) {
        // read the file provided in the input
        String text = textToString(filename);

        // split the text into individual words
        String[] words = text.split("\\s+");

        // initialize the sum of the sentiment values
        double sum = 0;

        // for each word in the review, add its sentiment value to the sum
        for (String word : words) {
            sum += sentimentVal(word);
        }

        return sum;
    }

    /**
     * @params a filename that contains a string to be analyzed
     * @returns the star rating of a review in a file based on totalSentiment
     */
    public static int starReview(String filename) {
        // read the file provided in the input
        double sentiment = totalSentiment(filename);

        // if the sentiment is greater than 15, return 5 stars
        if (sentiment > 15) {
            return 5;
        }
        // if the sentiment is greater than 5 but less than 15, return 4 stars
        else if (sentiment > 5 && sentiment <= 15) {
            return 4;
        }
        // if the sentiment is greater than -5 but less than 5, return 3 stars
        else if (sentiment > -5 && sentiment <= 5) {
            return 3;
        }
        // if the sentiment is greater than -15 but less than -5, return 2 stars
        else if (sentiment > -15 && sentiment <= -5) {
            return 2;
        }
        // if the sentiment is less than -15, return 1 star
        else {
            return 1;
        }
    }

    /**
     * Copies the positive adjectives to the positiveAdjectives.txt file and the negative adjectives to the negativeAdjectives.txt file.
     *
     * This code is bad and won't work, I had to copy the files with a Node script.
     */
    public static void copyToFiles() {
        // open the positiveAdjectives.txt file
        try {
            FileWriter fw = new FileWriter("./positiveAdjectives.txt");
            BufferedWriter bw = new BufferedWriter(fw);

            // open the negativeAdjectives.txt file
            FileWriter fw2 = new FileWriter("./negativeAdjectives.txt");
            BufferedWriter bw2 = new BufferedWriter(fw2);

            // for each adjective in the positiveAdjectives array, write it to the positiveAdjectives.txt file
            for (String adj : posAdjectives) {
                bw.write(adj + "\n");
            }

            // for each adjective in the negativeAdjectives array, write it to the negativeAdjectives.txt file
            for (String adj : negAdjectives) {
                bw2.write(adj + "\n");
            }

            // close the positiveAdjectives.txt file
            bw.close();
            fw.close();

            // close the negativeAdjectives.txt file
            bw2.close();
            fw2.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * @params the file to generate from, and the direction of the edits (random, which substitutes positive adjectives for other positive ones and negative ones for other negative ones, positive, which substitutes negative adjectives for positive adjectives, and negative, which substitutes positive adjectives for negative ones.
     * @returns a fake review that randomizes adjectives based on sentiment generated from the provided file.
     */

    public static String fakeReviewDirection ( String filename, String direction ) {
        String review = textToString(filename);

        String[] words = review.split(" ");

        String newReview = ""
        for (String word : words) {
            if (direction == "positive") {
                if (word.split("")[0] == '*') {
                    boolean positive = sentimentVal(word.substring(1)) >= 0 ? true : false;
                    if (!positive) {
                        newReview += randomPositiveAdj();
                    }
                    else {
                        newReview += word.substring(1)
                    }
                }
                else {
                    newReview += word;
                }
            }
            if (direction == "negative") {
                if (word.split("")[0] == '*') {
                    boolean positive = sentimentVal(word.substring(1)) >= 0 ? true : false;
                    if (positive) {
                        newReview += randomNegativeAdj();
                    }
                    else {
                        newReview += word.substring(1);
                    }
                }
                else {
                    newReview += word;
                }
            }
            if (direction == "random") {
                if (word.split("")[0] == '*') {
                    boolean positive = sentimentVal(word.substring(1)) >= 0 ? true : false;
                    if (positive) {
                        newReview += randomPositiveAdj();
                    }
                    else {
                        newReview += randomNegativeAdj();
                    }
                }
                else {
                    newReview += word;
                }
            }
        }

        return newReview;
    }

    /**
     * @params the file to generate from.
     * @returns a fake review that randomizes adjectives generated from the provided file.
     */

    public static String fakeReview ( String filename ) {
        String review = textToString(filename);

        String[] words = review.split(" ");

        String newReview = ""
        for (String word : words) {
            if (word.split("")[0] == '*') {
                boolean positive = sentimentVal(word.substring(1)) >= 0 ? true : false;
                if (positive) {
                    newReview += randomAdjective();
                }
                else {
                    newReview += randomAdjective();
                }
            }
            else {
                newReview += word;
            }
        }

        return newReview;
    }
}
