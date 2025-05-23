package SpiralMatrix.KishoreSpiral;

import java.util.Scanner;

public class DefaultKishoreSpiral {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int db[][]=new int[n][n];
        int ltors=0,ltore=n-1,ltorp=0;
        int ttobs=1,ttobe=n-1,ttobp=n-1;
        int rtols=n-2,rtole=0,rtolp=n-1;
        int btots=n-2,btote=1,btotp=0;
        int data=1;
        for(int j=0;j<=n/2;j++) {
            for(int i=ltors;i<=ltore;i++) {
                db[ltorp][i]=data;
                data++;
            }

            for(int i=ttobs;i<=ttobe;i++) {
                db[i][ttobp]=data;
                data++;
            }

            for(int i=rtols;i>=rtole;i--) {
                db[rtolp][i]=data;
                data++;
            }

            for(int i=btots;i>=btote;i--) {
                db[i][btotp]=data;
                data++;
            }
            ltors++;ltore--;ltorp++;
            ttobs++;ttobe--;ttobp--;
            rtols--;rtole++;rtolp--;
            btots--;btote++;btotp++;

        }

        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                System.out.printf("%02d ",db[i][j]);
            }
            System.out.println();
        }

    }

}

