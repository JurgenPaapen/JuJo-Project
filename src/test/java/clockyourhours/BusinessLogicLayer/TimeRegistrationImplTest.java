package clockyourhours.BusinessLogicLayer;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import clockyourhours.BusinessLogicLayer.TimeRegistrationImpl;

import static org.junit.jupiter.api.Assertions.*;

class TimeRegistrationImplTest {
    private long start;
    private long end;

    @Test
    @DisplayName("tijdsverschil berekenen van 3 seconden")
    void timeDifferenceToCheckCalculation() {
        //Arrange
        long start = TimeRegistrationImpl.startTimer();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e1) {
            e1.printStackTrace();
        }
        long end = TimeRegistrationImpl.stopTimer();
        //Act
        long diff = TimeRegistrationImpl.timeDifference( end, start);
        diff = diff/1000;

        //Assert
        Assert.assertEquals(diff, 3);

    }
}