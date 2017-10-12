package hello;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MyService {

    private final long id;
    private final String date;


    public MyService(long id) {
        this.id = id;
        this.date = provideDate();
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return date;
    }

    private String provideDate() {
        DateFormat df = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        Date today = Calendar.getInstance().getTime();
        return df.format(today);
    }
}
