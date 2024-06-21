public class Array {

    public static void main(String[] args) {
        int[] cars = new int[5]; // Initialize the array with size 5

        for (int i = 0; i < 5; i++) {
            cars[i] = i + 1;
        }

        System.out.println("Cars: " + cars[0]);
    }
}

// To demonstrate a practical example of using arrays, let's create a program that calculates the average of different ages: