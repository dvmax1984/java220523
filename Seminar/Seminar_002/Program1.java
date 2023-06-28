package Seminar.Seminar_002;

public class program1 {
    public static void main(String[] args) {
        System.out.println(longStringBuilding(10, 'a', 'b'));
        System.out.println(isPalindrom("qwwq"));
    }
    
    static String longStringBuilding(int n, char c1, char c2) {
        // BaHo 4eTHoe uncno N (>@) u cumeonsi cl u c2.
        // HanucaTb MeTOA, KOTOpsIi BEpHET CTPOKY AMHb N, KOTOpas cocTom
        // waumHas c cl.
        StringBuilder newStr = new StringBuilder();
        for (int i = 0; i < n / 2; i++) {
            newStr.append(c1);
            newStr.append(c2);
        }
        return newStr.toString();
    }

    static boolean isPalindrom(String str) {
        StringBuilder res = new StringBuilder("");
        
        for (int i = str.length() - 1; i >= 0; i--)
            res.append(str.charAt(i));
            
        return str.equals(res.toString());
    }
}