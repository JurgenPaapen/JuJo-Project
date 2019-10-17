package clockyourhours.BusinessLogicLayer;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TimeRegistrationImpl {


    public static long startTimer() {
        return System.currentTimeMillis();
    }

    public static long stopTimer(){
            return System.currentTimeMillis();
    }

    public static long timeDifference(long end, long start){
        long diff = ( end - start);
            return diff ;
    }

}