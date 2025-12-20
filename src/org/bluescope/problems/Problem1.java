package org.bluescope.problems;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

//hackerrankproblems
//https://www.hackerrank.com/challenges/climbing-the-leaderboard/problem?isFullScreen=true
public class Problem1 {

//climbing the leaderboard

    public static List<Integer> climbingLeaderboard(int[] ranked, int[] player) {

        Set<Integer> set=new LinkedHashSet<>();
        for(int r :ranked){
            set.add(r);
        }

        List <Integer>uq=new ArrayList<>(set);

        int n= uq.size();
        int index=n-1;


        List<Integer>result=new ArrayList<>();
        for(int score:player){


            while(index>=0 && score>=uq.get(index) ){
                index--;

            }
            result.add(index+2);
        }

        return result;

    }
    public static void main (String[] args){

        int[] ranked={100,90,65,35};
        int [] players ={70,80,105};

        List<Integer> output = climbingLeaderboard(ranked, players);
        System.out.println(output);


    }

}
