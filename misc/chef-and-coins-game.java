// Problem: Chef and Coins Game
// Link: http://codechef.com/practice/course/2-star-difficulty-problems/DIFF1500/problems/CHCOINSG

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-->0){
            int n = Integer.parseInt(br.readLine().trim());
            if(n%6==0){
                System.out.println("Misha");
            }else{
                System.out.println("Chef");
            }
        }
	}
}
