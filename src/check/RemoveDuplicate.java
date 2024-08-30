package check;

public class RemoveDuplicate {

    public static int[] findAndDuplicate(int[] array) {
        // create a new array with the same size as the input array
        int[] newArray = new int[array.length];

        // create a variable to keep track of the index of the new array
        int index = 0;

        // create a variable to store the previous element of the input array
        int prev = array[0];

        // copy the first element of the input array to the new array
        newArray[index] = prev;
        index++;

        // loop through the input array from the second element
        for (int i = 1; i < array.length; i++) {
            // get the current element of the input array
            int curr = array[i];

            // if the current element is not equal to the previous element
            if (curr != prev) {
                // copy the current element to the new array
                newArray[index] = curr;
                index++;
            }

            // update the previous element
            prev = curr;
        }

        // return the new array
        return newArray;
    }

    public static void main(String[] args) {
        // test cases
        int[] input1 = {1, 2, 2, 3, 4, 5, 5, 6};
        int[] output1 = findAndDuplicate(input1);
        System.out.println("Input 1: " + java.util.Arrays.toString(input1));
        System.out.println("Output 1: " + java.util.Arrays.toString(output1));

        int[] input2 = {1, 1, 1, 2, 2, 3, 4, 5, 5, 6, 6, 6, 8};
        int[] output2 = findAndDuplicate(input2);
        System.out.println("Input 2: " + java.util.Arrays.toString(input2));
        System.out.println("Output 2: " + java.util.Arrays.toString(output2));
    }
}

