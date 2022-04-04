public class string_sort {
    public static void main(String[] args) {
        String s="the quick brown fox jumps over the lazy little dog";
        int length=s.length();
        String ar[]=s.split(" ");
        for(int x=0;x<ar.length;x++)
        {
            for(int y=0;y<ar.length-1-x;y++)
            {
                if(ar[y].length()>ar[y+1].length())
                {
                    String temp=ar[y];
                    ar[y]=ar[y+1];
                    ar[y+1]=temp;
                }
            }
        }

        for(int x=0;x<ar.length;x++)
        {
            for(int y=0;y<ar.length-1-x;y++)
            {
                if(ar[y].length()==ar[y+1].length() && ar[y].compareTo(ar[y+1])>0)
                {
                    String temp=ar[y];
                    ar[y]=ar[y+1];
                    ar[y+1]=temp;
                }
            }
        }
        String search="quick";
        int start=0,end=ar.length-1,flag=1;
        while(start<=end)
        {
            if(search.compareTo(ar[(start+end)/2])==0)
            {
                flag=0;
                break;
            }
            else if(search.compareTo(ar[(start+end)/2])>0)
                start=(start+end)/2+1;
            else
                end=(start+end)/2-1;
        }
        if(flag==1)
            System.out.println("NOt found");
        else
            System.out.println("Found");
        for(String temp:ar)
            System.out.println(temp);
    }
}
