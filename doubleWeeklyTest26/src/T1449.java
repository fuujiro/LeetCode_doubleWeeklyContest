public class T1449 {
    class Solution {
        public String largestNumber(int[] cost, int target) {
            Map<Integer, Integer> map = new HashMap<>();// cst -->  number
            for(int i=cost.length-1;i>=0;i--){
                if(!map.containsKey(cost[i])){//cost数组中，相同的数字只留下下标大的数
                    map.put(cost[i], i+1);
                }
            }
            //dp[i]表示cost为i时最大数字
            String[] dp = new String[target+1];
            dp[0] = "";
            for(int i=1;i<=target;i++){
                for(int cst:map.keySet()){
                    if(cst<=i && dp[i-cst] != null){
                        String b = dp[i-cst]+map.get(cst);  // 如果选择花掉这个成本，得到的数字
                        dp[i] = compare(dp[i], b);
                    }
                }
            }
            return dp[target] == null?"0":dp[target];
        }
        //比较两个数的大小
        public String compare(String a, String b){
            if(a == null) return b;
            if(a.length()>b.length()) return a;
            if(a.length() == b.length()){
                if(a.compareTo(b) > 0) return a;
                else return b;
            }
            return b;
        }
    }
}
