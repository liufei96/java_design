package com.yiyang.java;

public class Main {

    public static void main(String sgf[]) throws Exception, NullPointerException {
//        StringBuffer a=new StringBuffer("A");
//        StringBuffer b=new StringBuffer("B");
//        operate(a,b);
//        System.out.println(a + "." + b );
          System.out.println("admi".concat("n") == "admin");
          System.out.println("admin".hashCode());
          System.out.println("Admin".toLowerCase().hashCode());
          float f = -412.2f;
          long test = 12;
    }
    static void operate(StringBuffer x,StringBuffer y) {
        StringBuffer append = x.append(y);
        y=x;
    }
}
