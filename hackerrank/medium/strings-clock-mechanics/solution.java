import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNext()) return;
        String[] t = sc.next().split(":");
        double h = Double.parseDouble(t[0]) % 12;
        double m = Double.parseDouble(t[1]);
        double ha = h * 30 + m * 0.5;
        double ma = m * 6;
        double diff = Math.abs(ha - ma);
        double angle = Math.min(diff, 360 - diff);
        System.out.printf(Locale.US, "%.1f\n", angle);
    }
}
