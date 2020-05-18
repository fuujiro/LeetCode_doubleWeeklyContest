import java.util.ArrayList;
import java.util.List;

public class T1447 {
    class Solution {
        public int gcd(int a, int b) {
            int c = (a > b)? b : a;
            while(a%c!=0 || b%c!=0) {
                c--;
            }
            return c;
        }

        public List<String> simplifiedFractions(int n) {
            List<String> res = new ArrayList<>();
            if(n <= 1)
                return res;
            for (int i = 2; i <= n; i++) {
                for (int j = 1; j < n; j++) {
                    if(gcd(i,j)==1 && i > j) {
                        res.add(j+"/"+i);
                    }
                }
            }

            return res;
        }
    }
}
