package com.mypro.text;

public class test {
    public static void main(String[] args) {
        // int count = numRows - 2;
        String s = "4193 with word";
        s = s.trim();
        char[] ch = new char[s.length()];
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '-' || s.charAt(i) >= '0' && s.charAt(i) <='9' ){
                ch[i] = s.charAt(i);
            }else{
                break;
            }
        }
        System.out.println(Integer.parseInt(String.valueOf(ch)));
    }
}
