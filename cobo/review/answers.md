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
      2. I could improve it either by 