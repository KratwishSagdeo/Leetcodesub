// Problem: Strong Password
// Link: https://www.hackerrank.com/challenges/strong-password/problem?isFullScreen=true

public static int minimumNumber(int n, String password) {
    int uppercase = 0;
    int lowercase = 0;
    int digit = 0;
    int specialCount = 0;
    int ans = 0;
    String specials = "!@#$%^&*()-+";

    for (int i = 0; i < n; i++) {
        int x = (int) password.charAt(i);
        if (x >= 65 && x <= 90) { // Fixed range from 95 to 90
            uppercase++;
        } else if (x >= 97 && x <= 122) {
            lowercase++;
        } else if (x >= 48 && x <= 57) {
            digit++;
        } else if (specials.indexOf(password.charAt(i)) != -1) {
            specialCount++;
        }
    }

    if (uppercase == 0) ans++;
    if (lowercase == 0) ans++;
    if (specialCount == 0) ans++;
    if (digit == 0) ans++;

    // Return the maximum of missing categories vs characters needed to reach length 6
    return Math.max(ans, 6 - n);
}