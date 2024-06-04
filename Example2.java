public class Example2{
    public static void main(String args[])
    {
        String s="Jaswanth";
        char target='J';
        System.out.println(StringSearch(s,target,1,4));
    }
    static boolean StringSearch(String str,char target,int start,int end)
    {
        for(int i=start;i<end;i++)
        {
            if(target==str.charAt(i))
            {
                return true;
            }
        }
        return false;
    }
}