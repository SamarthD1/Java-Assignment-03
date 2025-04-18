public class jaggedarrayEx 
{
    public static void main(String[] args) 
    {
        int[][] jaggedArray = new int[3][];
        
        jaggedArray[0] = new int[2];
        jaggedArray[1] = new int[3];
        jaggedArray[2] = new int[4];
        
        int value = 1;
        for (int i = 0; i < jaggedArray.length; i++) 
        {
            for (int j = 0; j < jaggedArray[i].length; j++) 
            {
                jaggedArray[i][j] = value++;
            }
        }
        
        for (int i = 0; i < jaggedArray.length; i++)
         {
            for (int j = 0; j < jaggedArray[i].length; j++) 
            {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println(); 
        }
    }
}
