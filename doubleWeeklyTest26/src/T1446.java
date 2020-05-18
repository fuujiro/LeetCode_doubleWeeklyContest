public class T1446 {
    class Solution {
        public int maxPower(String s) {
            int res = 0,cnt = 0;
            int len = s.length();
            if(len <= 1)
                return len;
            for (int i = 1; i < len; i++) {
                if(s.charAt(i) == s.charAt(i-1)){
                    cnt++;
                } else {
                    cnt = 0;
                }
                res = Math.max(res, cnt);
            }
            return res+1;
        }
    }
}
