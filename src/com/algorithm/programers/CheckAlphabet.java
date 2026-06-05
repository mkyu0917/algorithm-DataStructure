package com.algorithm.programers;

public class CheckAlphabet {

    public static void main(String[] args) {

        CheckAlphabet checkAlphabet = new CheckAlphabet();
        checkAlphabet.alphabetCheck("pyypYppYpPYppYppOOPOeoasoeifP");
        checkAlphabet.alphabetCheck("pyppypyy");

    }


    private void alphabetCheck(String s){

        char[] charArray=s.toCharArray();

        int cntP =0;
        int cntY =0;

        for(char c : charArray){

            char lc = Character.toLowerCase(c);

            if(lc == 'p'){
                cntP++;
            }else if( lc == 'y'){
                cntY++;
            }


        }

        System.out.println(cntP==cntY);

    }

}
