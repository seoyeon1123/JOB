package Day10;

import java.text.SimpleDateFormat;
import java.util.Date;

public class BOJ10699 {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat =
                new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(simpleDateFormat.format(date));
    }
}
