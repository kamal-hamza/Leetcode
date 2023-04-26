import java.util.List;
class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int index = 0;
        int numMatches = 0;
        if (ruleKey.equals("color")) {
            index = 1;
        }
        else if (ruleKey.equals("type")) {
            index = 0;
        }
        else {
            index = 2;
        }
        for (int  i = 0; i < items.size(); i++) {
            List<String> item = items.get(i);
            if (item.get(index).equals(ruleValue)) {
                numMatches++;
            } 
        }
        return numMatches;
    }

    public static void main(String[] args) {
        List<List<String>> list = List.of(List.of("phone", "blue", "pixel"),List.of("computer", "silver", "lenovo"),List.of("phone", "gold", "iphone"));
        Solution sol = new Solution();
        sol.countMatches(list, "color", "silver");
    }
}