public class SumAndAverage 
{
    public static void main(String[] args) 
    {
        double[] numbers = {12.5, 18.8, 25.2, 30.6, 45.1};
        double sum = 0;
        double average;

        for (double num : numbers) 
        {
            sum += num;
        }

        average = sum / numbers.length;

        System.out.println("Sum of the elements: " + sum);
        System.out.println("Average of the elements: " + average);
    }
}
