public class DoWhileLoopPractice {
    public static void main(String[] args) {
        System.out.println("=== DO-WHILE LOOP EXERCISES ===\n");

        // TODO 1: Basic Do-While Count
        // Write a do-while loop to print numbers 1 to 5
        System.out.println("TODO 1: Count 1 to 5");
        int count = 1;
        do {
            System.out.println(count);
            count++;
        } while (count <= 5);

        System.out.println();

        // TODO 2: Menu Simulation
        // Write a do-while loop to simulate a menu that runs at least once
        // Print "Menu: 1. Start 2. Exit" and set choice = 2 to exit
        System.out.println("TODO 2: Menu simulation");
        int choice = 1;
        do {
            System.out.println("Menu: 1. Start 2. Exit");
            // Simulate user selects exit after first iteration
            choice = 2;
        } while (choice != 2);

        System.out.println();

        // TODO 3: Input Validation Simulation
        // Write a do-while loop to simulate input validation
        // Start with invalid input, then make it valid
        System.out.println("TODO 3: Input validation simulation");
        int inputValue = -1; // Start with invalid
        int attempts = 0;
        do {
            attempts++;
            // Simulate input update, valid if between 1-10
            inputValue = attempts * 3; // 3, 6, 9, 12, ...
        } while (inputValue < 1 || inputValue > 10);

        System.out.println("Valid input accepted: " + inputValue);
        System.out.println();

        // TODO 4: At Least Once Execution
        // Write a do-while that demonstrates execution even when condition is false
        System.out.println("TODO 4: Executes even when condition is false");
        boolean condition = false;
        do {
            System.out.println("This runs at least once!");
        } while (condition);

        System.out.println();

        // TODO 5: Sum Until Zero
        // Write a do-while to add numbers until you encounter zero
        // Use array: {5, 3, 8, 2, 0, 7, 1}
        System.out.println("TODO 5: Sum until zero");
        int[] numbers = {5, 3, 8, 2, 0, 7, 1};
        int index = 0;
        int sum = 0;
        do {
            if (numbers[index] == 0) {
                break;
            }
            sum += numbers[index];
            index++;
        } while (index < numbers.length);

        System.out.println("Sum until zero: " + sum);
        System.out.println();

        // TODO 6: Reverse Number
        // Write a do-while to reverse digits of number 12345
        System.out.println("TODO 6: Reverse number 12345");
        int number = 12345;
        int reversed = 0;
        do {
            reversed = reversed * 10 + (number % 10);
            number /= 10;
        } while (number > 0);

        System.out.println("Reversed: " + reversed);
        System.out.println();

        // TODO 7: Find Character
        // Write a do-while to find first occurrence of 'a' in "programming"
        System.out.println("TODO 7: Find 'a' in 'programming'");
        String text = "programming";
        int charIndex = 0;
        char target = 'a';
        boolean found = false;
        do {
            if (text.charAt(charIndex) == target) {
                found = true;
                break;
            }
            charIndex++;
        } while (charIndex < text.length());
        if (!found) charIndex = -1; // if not found

        System.out.println("Found 'a' at index: " + charIndex);
        System.out.println();

        // TODO 8: Countdown Timer
        // Write a do-while for countdown from 5 to 1, then print "Go!"
        System.out.println("TODO 8: Countdown timer");
        int timer = 5;
        do {
            System.out.println(timer);
            timer--;
        } while (timer >= 1);

        System.out.println("Go!");
        System.out.println();

        // TODO 9: Password Attempts
        // Write a do-while to simulate password attempts (max 3 tries)
        System.out.println("TODO 9: Password attempts simulation");
        String correctPassword = "secret123";
        String enteredPassword = "wrong"; // Start with wrong password
        int attemptCount = 0;
        int maxAttempts = 3;
        do {
            attemptCount++;
            if (enteredPassword.equals(correctPassword)) {
                System.out.println("Access granted");
                break;
            } else {
                System.out.println("Attempt " + attemptCount + ": Incorrect password");
                // Simulate user entering correct password on 3rd attempt
                if (attemptCount == maxAttempts) {
                    enteredPassword = "secret123";
                }
            }
        } while (attemptCount < maxAttempts);

        System.out.println();

        // TODO 10: Game Level Completion
        // Write a do-while to simulate completing game levels
        // Start at level 1, complete levels until level 5
        System.out.println("TODO 10: Game level completion");
        int currentLevel = 1;
        int targetLevel = 5;
        do {
            System.out.println("Level " + currentLevel + " completed.");
            currentLevel++;
        } while (currentLevel <= targetLevel);

        System.out.println("All levels completed!");

    }
}