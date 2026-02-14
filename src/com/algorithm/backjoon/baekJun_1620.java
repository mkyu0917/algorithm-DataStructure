package com.algorithm.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class baekJun_1620 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int inputPkNum=Integer.parseInt(st.nextToken());
        int inputPkAns=Integer.parseInt(st.nextToken());
        String[] pkNo = new String[inputPkNum+1];
        HashMap<String, String> pkName = new HashMap<>(inputPkNum+1);

        for(int i=0; i<inputPkNum; i++){
            st = new StringTokenizer(br.readLine());
            String pkNm=st.nextToken();
            pkNo[i+1] = pkNm;
            pkName.put(pkNm,String.valueOf(i+1));
        }

        for(int i=0; i<inputPkAns; i++){
            st = new StringTokenizer(br.readLine());
            String ans=st.nextToken();

            if(ans.charAt(0)>=48 && ans.charAt(0)<=57){
                String ansPkNm=pkNo[Integer.parseInt(ans)];
                sb.append(ansPkNm+"\n");
            }else{
                String ansPkNo=pkName.get(ans);
                sb.append(ansPkNo+"\n");
            }

        }
        System.out.print(sb);

    }
}
