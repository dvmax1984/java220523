public class Lecture_002 {
    public static void main(String[] args) {
        System.out.println(longStringBuilding(10, 'a', 'b'));
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
}