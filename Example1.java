public class Example1{
    public static void main(String args[])
    {
        int[] nums={1,2,3,4,5,6,7};
        int target=0;
        int ans=LinearSearch(nums,target);
        System.out.println(ans);
    }
    static int LinearSearch(int[] arr,int target)
    {
        for(int index=0;index<arr.length;index++)
        {
            int element=arr[index];
            if(element==target)
            {
                return index;
            }
        }
        return -1;
    }
}
