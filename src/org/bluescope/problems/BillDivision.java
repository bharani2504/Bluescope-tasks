package org.bluescope.problems;

import java.io.IOException;
import java.util.Scanner;
//HackerRank problem
public class BillDivision {


    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int k=sc.nextInt();


        int bill[]=new int[n];

        int sum=0;
        for(int i=0;i<n;i++){
            bill[i]=sc.nextInt();

            if(k==i){
                continue;

            }
            else {
                sum+=bill[i];
            }

        }
        int paid=sc.nextInt();
        int share =sum/2;
        if(paid==share){

            System.out.println("Bon Appetit");
        }
        else{

            System.out.println(paid-share);
        }
    }

}
