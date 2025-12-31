package charOperation;

public class NameReverse {

		public static void main(String[] args)  {

	        String input = "I am anjali";

	        // convert to lowercase
	        input = input.toLowerCase();

	        // split into words
	        String[] words = input.split(" ");

	        StringBuilder result = new StringBuilder();

	        // traverse words in reverse order
	        for (int i = words.length - 1; i >= 0; i--) {

	            // reverse each word
	            StringBuilder revWord = new StringBuilder(words[i]).reverse();

	            result.append(revWord).append(" ");
	        }

	        // remove trailing space
	        System.out.println(result.toString().trim());
	    }
	}

