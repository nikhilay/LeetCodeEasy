/**
 * Created by Nikhil on 10/21/16.
 */
public class ExcelSheetColumnTitle {
    public String convertToTitle(int n) {
        if (n < 0) return null;
        StringBuilder sb = new StringBuilder();

        while (n > 0) {
            n--;
            char c = (char) ('A' + n % 26);
            sb.append(c);
            n = n / 26;
        }

        return sb.reverse().toString();
    }
}
