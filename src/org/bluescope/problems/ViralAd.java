package org.bluescope.problems;
//viral advertistement ,Hacker rank problem
//https://www.hackerrank.com/challenges/strange-advertising/problem?isFullScreen=true
public class ViralAd {


    public static int viralAdvertising(int n) {

        int sum=0;
        int receipent=5;
        int liked=0;

        for(int i=0;i<n;i++){

            liked=(receipent/2);
            sum+=liked;
            receipent=liked*3;
        }

        return sum;
    }
}
