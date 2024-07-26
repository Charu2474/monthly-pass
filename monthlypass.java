import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner d=new Scanner(System.in);
        int x=d.nextInt();
        int y=d.nextInt();
        Float s=d.nextFloat();
        Float r=d.nextFloat();
        Float l=d.nextFloat();
        Float tot1=x*s;
        Float tot2=y*r;
        Float res=tot1+tot2;
        if(l<=res)
        {
            System.out.println("Monthly Pass");
        }
        else if(s>r||(2*s)<r)
        {
            System.out.println("Invalid Input");
        }
        else
        {
            System.out.println("Solo Trail + Roundabout Ride");
        }
    }
}
