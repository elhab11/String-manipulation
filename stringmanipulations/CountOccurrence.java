package stringmanipulations;

import java.util.Scanner;

public class CountOccurrence
{
    public static void main(String[] args) 
    {
        int n, x, count = 0, j = 0, i = 0;
       
        int a[]= {1,1,4,8};
       n= a.length;
     
        for(j = 0; j < n; j++)
        {
        	x=a[j];
        	
        for(i = 0; i < n; i++)
        {
            if(a[i] == x)
            {
                count++;
            }
        }
        System.out.println(x+";"+count);
        count=0;
    }
    }}
