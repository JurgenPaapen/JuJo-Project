package clockyourhours.BusinessLogicLayer;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TimeRegistrationImpl {


    public long startTimer() {
        return System.currentTimeMillis();
    }

    public long stopTimer(){
            return System.currentTimeMillis();
    }

    public long timeDifference(long end, long start){
        long diff = ( end - start);
            return diff ;
    }

}