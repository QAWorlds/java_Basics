package interview;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "aaaaaaaxd";
        String result = "";
        for (char c : str.toCharArray()) {
            if (result.indexOf(c) == -1) {
                result += c;
            }
        }
        System.out.println("Without duplicates: " + result);
    }
}


//We check if the character is already in the result. If not, we append it.


/*



Step-by-step Explanation:
🧩 1. String str = "aaaaaaaxd";
Input string: "aaaaaaaxd"

It has many repeated 'a' characters.

🧩 2. String result = "";
This will store the result string without duplicates.

🧩 3. for (char c : str.toCharArray())
Converts the string into a character array and loops through each character.

🧩 4. if (result.indexOf(c) == -1)
Checks if c is already in result.

indexOf() returns -1 if the character is not found in result.

If it's not found, then it's a new character, so add it to result.

🧩 5. result += c;
Appends character c to the result string if it's unique.

🧩 6. Final System.out.println(...)
Prints the resulting string without duplicate characters.

*/