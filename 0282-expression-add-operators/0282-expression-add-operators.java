class Solution {

    private List<String> ans;
    private String num;
    private int target;

    private void helper(int index, long total, long prev, StringBuilder expr) {

        // if we've used all digits
        if (index == num.length()) {
            if (total == target) ans.add(expr.toString());
            return;
        }

        // try all possible number splits
        for (int i=index; i<num.length(); i++) {

            // Avoid leading zeros
            if (i != index && num.charAt(index) == '0')
                break;

            String part = num.substring(index, i+1);
            long curr = Long.parseLong(part);

            int len = expr.length();

            if (index == 0) {
                // first number (no operator before it)
                expr.append(part);
                helper(i+1, curr, curr, expr);
                expr.setLength(len);

            } else {

                // +
                expr.append("+").append(part);
                helper(i+1, total+curr, curr, expr);
                expr.setLength(len);

                // -
                expr.append("-").append(part);
                helper(i+1, total-curr, -curr, expr);
                expr.setLength(len);

                // *
                expr.append("*").append(part);
                helper(i+1, total-prev + (prev*curr), prev*curr, expr);
                expr.setLength(len);
            }
        }
    }

    public List<String> addOperators(String num, int target) {
        this.ans = new ArrayList<>();
        this.num = num;
        this.target = target;

        helper(0, 0, 0, new StringBuilder());
        return ans;
    }
}