package Elite;

import java.util.Scanner;

public class BuildingProgram {
    public class Main
    {
        public static void main(String[] args) {
// 		System.out.println("Hello World");
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int[][] arr1=new int[3][10];
            int[][] arr2=new int[3][10];
            int[][] arr3=new int[3][10];
            int[][] arr4=new int[3][10];
            for(int i=0;i<n;i++)
            {
                int build=sc.nextInt();
                int floor=sc.nextInt();
                int room=sc.nextInt();
                int person=sc.nextInt();
                if(build == 1)
                    arr1[floor-1][room-1]=person;
                else if(build == 2)
                    arr2[floor-1][room-1]=person;
                else if(build == 3)
                    arr3[floor-1][room-1]=person;
                else
                    arr4[floor-1][room-1]=person;
            }
            for(int i=0;i<3;i++)
            {
                for(int j=0;j<10;j++)
                {
                    System.out.print(arr1[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println("####################");
            for(int i=0;i<3;i++)
            {
                for(int j=0;j<10;j++)
                {
                    System.out.print(arr2[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println("####################");
            for(int i=0;i<3;i++)
            {
                for(int j=0;j<10;j++)
                {
                    System.out.print(arr3[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println("####################");
            for(int i=0;i<3;i++)
            {
                for(int j=0;j<10;j++)
                {
                    System.out.print(arr4[i][j]+" ");
                }
                if(i>=2)
                    System.out.println();
            }
        }
    }
}
