package Elite;

import java.util.Scanner;

public class maximum_steps {
    public static void main(String[] args) {
                // System.out.println("Hello, World!");
                Scanner sc=new Scanner(System.in);
                int n=sc.nextInt();
                int[] arr=new int[n];
                for(int i=0;i<n;i++)
                    arr[i]=sc.nextInt();
                int steps=0;
                int maxstep=0;
                for(int i=0;i<n-1;i++)
                {
                    if(arr[i]<arr[i+1])
                        steps++;
                    else
                        steps=0;
                    if(steps>maxstep)
                        maxstep=steps;
                }
                System.out.println(maxstep);
            }
        }
