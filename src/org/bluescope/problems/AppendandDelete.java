package org.bluescope.problems;
//Hackerrank problem
//https://www.hackerrank.com/challenges/append-and-delete/problem?isFullScreen=true
public class AppendandDelete {

        public static String appendAndDelete(String s, String t, int k) {

            int countlength=0;

            for(int i=0;i<Math.min(s.length(), t.length());i++){
                char ch=s.charAt(i);
                char sh=t.charAt(i);
                if(ch==sh){
                    countlength++;
                }
                else{
                    break;
                }

            }

            int total=s.length()-countlength+t.length()-countlength;

            if(k==total){
                return "Yes";
            }
            else if(total<k && (k-total)%2==0){
                return "Yes";
            }
            else if(k>=s.length()+t.length()){
                return "Yes";
            }
            else{
                return "No";
            }


        }


}
