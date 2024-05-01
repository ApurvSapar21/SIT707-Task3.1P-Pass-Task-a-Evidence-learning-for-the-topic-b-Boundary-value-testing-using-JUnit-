package sit707_tasks;

import java.util.Random;

import org.junit.Assert;
import org.junit.Test;


/**
 * @author Ahsan Habib
 */
public class DateUtilTest {
	
    @Test
    public void testStudentIdentity() {
        String studentId = "s222196167";
        Assert.assertNotNull(studentId);
    }

    @Test
    public void testStudentName() {
        String studentName = "Apurv";
        Assert.assertNotNull(studentName);
    }

    // Test D1: Days between 1 to 28
    @Test
    public void testDayBetween1And28() {
        DateUtil date = new DateUtil(15, 4, 2024); // 15th April 2024 (D1)
        Assert.assertEquals(15, date.getDay());
        // Add more assertions as needed for specific behaviors of days in this range
    }

    // Test D2: Day 29 (Leap year - February)
    @Test
    public void testDay29InLeapYear() {
        DateUtil date = new DateUtil(29, 2, 2024); // 29th February 2024 (D2)
        Assert.assertEquals(29, date.getDay());
        // Add assertions for leap year specific behavior
    }

    // Test D3: Day 30
    @Test
    public void testDay30() {
        DateUtil date = new DateUtil(30, 6, 2024); // 30th June 2024 (D3)
        Assert.assertEquals(30, date.getDay());
        // Add assertions for day 30 behavior
    }

    // Test D4: Day 31
    @Test
    public void testDay31() {
        DateUtil date = new DateUtil(31, 12, 2024); // 31st December 2024 (D4)
        Assert.assertEquals(31, date.getDay());
        // Add assertions for day 31 behavior
    }

    // Additional Test: Invalid day (outside valid range)
    @Test(expected = RuntimeException.class)
    public void testInvalidDay() {
        new DateUtil(32, 1, 2024); // Should throw RuntimeException for invalid day
    }
    
    
    // For Month
    
    // Test M28: February (28 days)
    @Test
    public void testFebruary28Days() {
        DateUtil date = new DateUtil(28, 2, 2023); // 28th February 2023 (M28)
        Assert.assertEquals(2, date.getMonth()); // February is represented by month number 2
        Assert.assertEquals(28, date.getDay());
        // Add assertions for month with 28 days behavior
    }

    // Test M29: February (29 days - Leap year)
    @Test
    public void testFebruary29DaysLeapYear() {
        DateUtil date = new DateUtil(29, 2, 2024); // 29th February 2024 (M29)
        Assert.assertEquals(2, date.getMonth()); // February is represented by month number 2
        Assert.assertEquals(29, date.getDay());
        // Add assertions for month with 29 days (Leap year) behavior
    }

    // Test M30: April (30 days)
    @Test
    public void testApril30Days() {
        DateUtil date = new DateUtil(30, 4, 2024); // 30th April 2024 (M30)
        Assert.assertEquals(4, date.getMonth()); // April is represented by month number 4
        Assert.assertEquals(30, date.getDay());
        // Add assertions for month with 30 days behavior
    }


    @Test
    public void testJanuary31Days() {
        DateUtil date = new DateUtil(31, 1, 2024); // 31st January 2024 (M31)
        Assert.assertEquals("January", DateUtil.MONTHS[date.getMonth() - 1]);
        Assert.assertEquals(31, date.getDay());
        // Add assertions for month with 31 days behavior
    }

    
    // For year
    
    @Test
    public void testLeapYearFebruary29Days() {
        DateUtil date = new DateUtil(29, 2, 2024); // 29th February 2024 (Leap year)
        Assert.assertEquals("February", DateUtil.MONTHS[date.getMonth() - 1]);
        Assert.assertEquals(29, date.getDay());
        // Add assertions for leap year specific behavior
    }


    @Test
    public void testNonLeapYearFebruary28Days() {
        DateUtil date = new DateUtil(28, 2, 2023); // 28th February 2023 (Non-leap year)
        Assert.assertEquals("February", DateUtil.MONTHS[date.getMonth() - 1]);
        Assert.assertEquals(28, date.getDay());
        // Add assertions for non-leap year specific behavior
    }

    
    
}
