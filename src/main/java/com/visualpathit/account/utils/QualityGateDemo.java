package com.visualpathit.account.utils;

public class QualityGateDemo {

    public int demo1(int a, String s1, String s2) {
        a = a;                // bug 1 : auto-affectation
        if (a == a) {         // bug 2 : même expression des deux côtés
            s1.trim();        // bug 3 : valeur de retour ignorée
        }
        if (s1 == s2) {       // bug 4 : String comparées avec ==
            return 1;
        }
        return 0;
    }

    public int demo2(int a, String s1, String s2) {
        a = a;                // bug 5
        if (a == a) {         // bug 6
            s1.trim();        // bug 7
        }
        if (s1 == s2) {       // bug 8
            return 1;
        }
        return 0;
    }
}
