# Answers
1. 
   1. 
      1. `public static double`
      2. The function takes a single parameter `word` of type `String`. If you tried to pass an input of different type, you'd end up with an error like `error: incompatible types`.
      3. The function returns a single value of type `double`. 
   2. Read method `testSentimentVal` in `Reviewer.java`.
      1. `hot` ➡️ `-0.33`
      2. `sad` ➡️ `-1.37`
      3. `crying` ➡️ `-1.17`
   3.  
      1. This function call would compile, it is calling the function correctly.
      2. The function call would not compile, it is calling the function confusing the input for the output and output for input, which is not defined by the function.
      3. This would fail as well, the function only takes one input and returns one output.
2. 
   1. Read method `totalSentiment` in `Review.java`.
   2. Total sentiment value of `aReview.txt` is `-0.5600000000000004`.
   3. Read method `starReview` in `Review.java`.
   4. `totalSentiment` opens the file and reads the file line by line, adding the file contents to a string. After that, it breaks the string into words by splitting on spaces. Then, for each word, it finds the sentiment value, and adds that to the existing total. After that, it returns the total.
   5. 
      1. The rating in `aReview.txt` is `-0.56`, but the review would be more negative if it wasn't sarcastic. The real review's rating was a 3/5, like this program gave.
      2. I could improve it either by adding more words to the sentiment value list (obviously, since we'd have more coverage), or by trying to integrate series of words into the program (to find patterns that could have different sentimental value than the words themselves)
   6. The student first used reviews between 0 and 4 stars which is wrong. Also, he uses the less than sign instead of the greater than sign, so the review will always be 4 or 0 stars.
3. 
   1. Done
   2. Done
   3. indexOf gets the index of the first occurrence of a specific character in a string, and substring gives a "slice" of the string from the first specified index to the second.
   4. Read method `fakeReview` in `Review.java`
   5. The difference between calling a static method and calling a non-static method is that calling the static method calls it directly on the class, while calling a non-static method calls it on an instance of that class initiated by the constructor.
   6. The review could be changed in this way by making sure all adjectives are replaced by the intended tense, instead of randomly substituting random adjectives.
4. 
   1. A person might want to harm another person's business.
   2. A person might want to bolster the performance of their own, or someone else's business. Or they could be completing this lab.
   3. To create a stronger (or more positive) review, we could substitute all the existing negative adjectives for positive ones.
      ```
      public static String fakeReviewStronger () {
         String review = getReviewFromFile("review.txt");
         String[] words = review.split(" ");
         String newReview = "";
         for (word in words) {
            double sentiment = getSentiment(word)
            if (sentiment < 0) {
               newReview += positiveAdjective();
            }
            else {
               newReview += word
            }
         }
         return newReview
      }
      ```
   4. Read method `fakeReviewDirection` in `Review.java`
   5. This method gets the word without the first character, i.e. the asterisk.
   6. If we had an asterisk at the beginning of the word, we could change the word we are querying the sentiment value of to something else, and probably something that doesn't exist in the sentiment value list at all.
   7. You could replace every single verb with a verb that is more positive.
   8. You could replace every single adjective with a verb that is more positive.
5. Read the `Open.java` file.
   1. I chose to implement it because I wanted to come up with something cool. Cool and Awesome are two very nice words with high sentiment ratings.
   2. I coded it in one shot using IntelliJ Idea Ultimate 2022.1 EAP.
   3. `public static String`. I chose this one because I didn't want to have to create an instance of the class, and I wanted a string as a return type so I could do more string manipulation if necessary. 
   4. The two methods calling String are `x.split(" ")`, where it splits the string up by space delimiters, and `x.replaceAll("\\s+", "_")` where it replaces all the spaces with underscores.
   5. ```
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
      ```
      This code segment checks if the word is "cool", and if it is, it adds 1 to the coolCounter. If it is "awesome", it adds 5 to the coolCounter. If it is neither, it adds 0 to the coolCounter. It also prints a message for each part.
   6. `for (String word : words) { /* ... */ }` is a for loop that iterates through the words in the sentence. (The code within was mentioned in the previous problem.)
      