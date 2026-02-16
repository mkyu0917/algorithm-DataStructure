package com.algorithm.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.StringTokenizer;

public class baekJun_7785 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inputNum = Integer.parseInt(br.readLine());
        HashSet<String> commuteEmpList = new HashSet<>();
        StringTokenizer st = null;
        for(int i=0; i<inputNum; i++){

            st  = new StringTokenizer(br.readLine());
            String name=st.nextToken();
            String commuteState=st.nextToken();

            if(commuteEmpList.contains(name)){
                if("enter".equals(commuteState)){
                    continue;
                }else if("leave".equals(commuteState)){
                    commuteEmpList.remove(name);
                }
            }else{
                commuteEmpList.add(name);
            }

        }

        Iterator<String> empIter = commuteEmpList.iterator();
        String[] empList = new String[commuteEmpList.size()];
        int cnt=0;
        while(empIter.hasNext()){
            empList[cnt]=empIter.next();
            cnt++;
        }

        Arrays.sort(empList,(o1, o2)->{ return o2.compareTo(o1); });
        StringBuilder sb = new StringBuilder();
        for(int j=0; j<empList.length;j++){
            sb.append(empList[j]).append("\n");
        }

        System.out.print(sb);

    }
}
