import java.util.Arrays;

public class Example3{
    public static void main(String args[])
    {
        int[][] nums={{1,3,5,7,9},
                    {2,4,6,8,10,12,13},
                    {1,5,8,3,9,},
                    {1,2}};
                    int target=13;
                    int[] ans=Search(nums,target);
        System.out.println (Arrays.toString(ans));
    }
    static int[] Search(int array[][],int target)
    {
       for(int i=0;i<array.length;i++)
       {
        for(int j=0;j<array[i].length;j++)
        {
            if(array[i][j]==target)
            {
                return new int[]{i,j};
            }
        }
       }
       return new int[]{-1,-1};
    }
}
