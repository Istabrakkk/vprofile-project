package com.visualpathit.account.utils;

public class QualityGateDemo {

    public int demo1(int a, String s1, String s2) {
        if (a > 0) {                  // correction 2
            s1 = s1.trim();           // correction 3
        }
        if (s1.equals(s2)) {          // correction 4
            return 1;
        }
        return 0;
    }

    public int demo2(int a, String s1, String s2) {
        if (a == a) {         // bug restant
            s1.trim();        // bug restant
        }
        if (s1 == s2) {       // bug restant
            return 1;
        }
        return 0;
    }
}
