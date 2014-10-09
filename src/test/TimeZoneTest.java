package test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class TimeZoneTest {

    public static void main(String[] args) {

        Date date = new Date();

        String timeZoneId = "Europe/Paris";
        //String timeZoneId = "GMT";
        String dateFormat = "MM.dd.yyyy HH:mm:ss";
        String localeStr = "MM/dd/yyyy hh:mm:ssa z";
        DateFormat dateFormatter = new SimpleDateFormat(dateFormat, getLocale(null));
        TimeZone timeZone = TimeZone.getTimeZone(timeZoneId);
        dateFormatter.setTimeZone(timeZone);
        String localTime = dateFormatter.format(date);
        System.out.println("localTime: " + localTime);

    }

    public static Locale getLocale(String locale) {
        if (locale == null)
            return Locale.US;
        else if ("zh_TW".equalsIgnoreCase(locale))
            return Locale.CHINESE;
        else if ("zh_cn".equalsIgnoreCase(locale))
            return Locale.CHINA;

        try {
            return new Locale(locale);
        } catch (Exception e) {
            return Locale.US;
        }
    }
}
