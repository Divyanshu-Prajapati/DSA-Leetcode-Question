class Solution {
    public int reverse(int x) {
        boolean t;
        if (x < 0) {
            t = true;
            x = x * -1;
        } else {
            t = false;
        }

        StringBuilder str = new StringBuilder(String.valueOf(x));
        str.reverse();

        String s = str.toString();
        s = s.replaceFirst("^0+", "");

        try {
            int ans = Integer.parseInt(s);
            if (t == true) {
                ans = ans * -1;
            }
            return ans;
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}
