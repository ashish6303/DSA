package Array;

public class Average {
    public static void main(String[] args) {
        int []ages = {12, 34, 67, 57,56};

        float avg , sum = 0;
        int size = ages.length;

        for(int i = 0 ; i < size;  i++)
        {
            sum += ages[i];
        }
        avg = sum / size;
        System.out.println("Average is " + avg);
    }
}
