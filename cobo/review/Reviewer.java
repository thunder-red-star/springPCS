public class Reviewer {
    /**
     * @returns void, a test of the sentimentVal method
     * @requires None
     * @ensures None
     * @throws None
     * @param None
     * An answer to Q2 of the College Board Consumer Review lab.
     */
    public static void testSentimentVal () {
        System.out.println(Review.sentimentVal("happily"));
        System.out.println(Review.sentimentVal("terrible"));
        System.out.println(Review.sentimentVal("cold"));
        System.out.println(Review.sentimentVal("hot"));
        System.out.println(Review.sentimentVal("sad"));
        System.out.println(Review.sentimentVal("crying"));
        System.out.println(Review.sentimentVal("definitelynotawordinthere"));
    }

    public static void testTotalSentiment () {
        System.out.println(Review.totalSentiment("aReview.txt"));
    }

    public static void main (String[] args) {
        testTotalSentiment();
    }
}