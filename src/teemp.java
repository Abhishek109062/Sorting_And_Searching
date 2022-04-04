/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        try {
            Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            while(t-->0)
            {
                int n=sc.nextInt();
                String s=sc.next();

                int count=Math.abs(0);
                for(int x=0;x<n;x++)
                {
                    if(x!=n-1 && s.charAt(x)==s.charAt(x+1))
                    {
                        count++;
                        x++;
                    }
                    else
                        count++;
                }
                System.out.println(count);
            }

        } catch(Exception e) {
            return;
        }
    }
}
