class Solution {
    public long smallestNumber(long num) {
        if (num == 0)
            return 0;

        boolean negative = num < 0;

        char[] digits = String.valueOf(Math.abs(num)).toCharArray();

        Arrays.sort(digits);

        if (negative)
        {
            StringBuilder sb = new StringBuilder(new String(digits));
            sb.reverse();

            return -Long.parseLong(sb.toString());
        }

        int index = 0;
        while (digits[index] == '0')
        index++;

        char temp = digits[0];
        digits[0] = digits[index];
        digits[index] = temp;

        return Long.parseLong(new String(digits));
    }
}