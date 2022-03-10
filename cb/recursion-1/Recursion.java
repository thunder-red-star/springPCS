public class Recursion {
    // Given n of 1 or more, return the factorial of n, which is n * (n-1) * (n-2) ... 1. Compute the result recursively (without loops).
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    // We have a number of bunnies and each bunny has two big floppy ears. We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).
    public static int bunnyEars(int bunnies) {
        return bunnies == 0 ? 0 : 2 + bunnyEars(bunnies - 1);
    }

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 1;
        }
        else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    // We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies (1, 3, ..) have the normal 2 ears. The even bunnies (2, 4, ..) we'll say have 3 ears, because they each have a raised foot. Recursively return the number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).
    public static int bunnyEars2(int bunnies) {
        if (bunnies == 0) {
            return 0;
        }
        if (bunnies % 2 == 0) {
            return 3 + bunnyEars2(bunnies - 1);
        }
        else {
            return 2 + bunnyEars2(bunnies - 1);
        }
    }

    // We have triangle made of blocks. The topmost row has 1 block, the next row down has 2 blocks, the next row has 3 blocks, and so on. Compute recursively (no loops or multiplication) the total number of blocks in such a triangle with the given number of rows.
    public static int triangle (int rows) {
        if (rows == 0) {
            return 0;
        }
        if (rows == 1) {
            return 1;
        }
        else {
            return rows + triangle(rows - 1);
        }
    }

    // Given a non-negative int n, return the sum of its digits recursively (no loops). Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).
    public static int sumDigits(int n) {
        if (n == 0)
            return 0;
        if (n > 0 && n < 10) {
            return n;
        }
        else {
            return n % 10 + sumDigits(n / 10);
        }
    }

    // Given a non-negative int n, return the count of the occurrences of 7 as a digit, so for example 717 yields 2. (no loops). Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).
    public static int count7(int n) {
        // get the first digit
        int firstDigit = n % 10;
        // if the first digit is 7, return 1
        if (firstDigit == 7 && n < 10) {
            return 1;
        }
        else if (firstDigit != 7 && n < 10) {
            return 0;
        }
        else if (firstDigit == 7 && n >= 10) {
            return 1 + count7(n / 10);
        }
        // if the first digit is not 7, return 0
        else {
            return 0 + count7(n / 10);
        }
    }

    // Given a non-negative int n, compute recursively (no loops) the count of the occurrences of 8 as a digit, except that an 8 with another 8 immediately to its left counts double, so 8818 yields 4. Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).
    public static int count8 (int n) {
        int firstDigit = n % 10;
        if (firstDigit == 8 && n < 10) {
            return 1;
        }
        else if (firstDigit != 8 && n < 10) {
            return 0;
        }
        else if (firstDigit == 8 && n >= 10) {
            return (count8(n / 10) > count8(n / 100) ? 2 : 1) + count8(n / 10);
        }
        else {
            return 0 + count8(n / 10);
        }
    }
}