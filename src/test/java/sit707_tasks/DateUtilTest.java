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

    @Test
    public void test1B_IncrementFromJune1st1994() {
        DateUtil date = new DateUtil(1, 6, 1994); // June 1, 1994
        System.out.println("test1B_IncrementFromJune1st1994 > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(2, date.getDay());
        Assert.assertEquals(6, date.getMonth());
        Assert.assertEquals(1994, date.getYear());
    }

    @Test
    public void test2B_IncrementFromJune2nd1994() {
        DateUtil date = new DateUtil(2, 6, 1994); // June 2, 1994
        System.out.println("test2B_IncrementFromJune2nd1994 > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(3, date.getDay());
        Assert.assertEquals(6, date.getMonth());
        Assert.assertEquals(1994, date.getYear());
    }


    @Test
    public void test3B_IncrementFromJune15th1994() {
        DateUtil date = new DateUtil(15, 6, 1994); // June 15, 1994
        System.out.println("test3B_IncrementFromJune15th1994 > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(16, date.getDay());
        Assert.assertEquals(6, date.getMonth());
        Assert.assertEquals(1994, date.getYear());
    }

    @Test
    public void test4B_IncrementFromJune30th1994() {
        DateUtil date = new DateUtil(30, 6, 1994); // June 30, 1994
        System.out.println("test4B_IncrementFromJune30th1994 > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(1, date.getDay());
        Assert.assertEquals(7, date.getMonth());
        Assert.assertEquals(1994, date.getYear());
    }

    @Test
    public void test5B_IncrementFromJune31st1994() {
        DateUtil date = new DateUtil(31, 6, 1994); // June 31, 1994 (Invalid Date)
        System.out.println("test5B_IncrementFromJune31st1994 > " + date);
        try {
            date.increment();
            Assert.fail("Expected RuntimeException for invalid date");
        } catch (RuntimeException e) {
            System.out.println("Caught expected exception: " + e.getMessage());
        }
    }

    @Test
    public void test6B_IncrementFromJanuary15th1994() {
        DateUtil date = new DateUtil(15, 1, 1994); // January 15, 1994
        System.out.println("test6B_IncrementFromJanuary15th1994 > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(16, date.getDay());
        Assert.assertEquals(1, date.getMonth());
        Assert.assertEquals(1994, date.getYear());
    }

    @Test
    public void test7B_IncrementFromFebruary15th1994() {
        DateUtil date = new DateUtil(15, 2, 1994); // February 15, 1994
        System.out.println("test7B_IncrementFromFebruary15th1994 > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(16, date.getDay());
        Assert.assertEquals(2, date.getMonth());
        Assert.assertEquals(1994, date.getYear());
    }

    @Test
    public void test8B_IncrementFromNovember15th1994() {
        DateUtil date = new DateUtil(15, 11, 1994); // November 15, 1994
        System.out.println("test8B_IncrementFromNovember15th1994 > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(16, date.getDay());
        Assert.assertEquals(11, date.getMonth());
        Assert.assertEquals(1994, date.getYear());
    }

    @Test
    public void test9B_IncrementFromDecember15th1994() {
        DateUtil date = new DateUtil(15, 12, 1994); // December 15, 1994
        System.out.println("test9B_IncrementFromDecember15th1994 > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(16, date.getDay());
        Assert.assertEquals(12, date.getMonth());
        Assert.assertEquals(1994, date.getYear());
    }

    @Test
    public void test10B_IncrementFromJune15th1700() {
        DateUtil date = new DateUtil(15, 6, 1700); // June 15, 1700
        System.out.println("test10B_IncrementFromJune15th1700 > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(16, date.getDay());
        Assert.assertEquals(6, date.getMonth());
        Assert.assertEquals(1700, date.getYear());
    }

    @Test
    public void test11B_IncrementFromJune15th1701() {
        DateUtil date = new DateUtil(15, 6, 1701); // June 15, 1701
        System.out.println("test11B_IncrementFromJune15th1701 > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(16, date.getDay());
        Assert.assertEquals(6, date.getMonth());
        Assert.assertEquals(1701, date.getYear());
    }

    @Test
    public void test12B_IncrementFromJune15th2023() {
        DateUtil date = new DateUtil(15, 6, 2023); // June 15, 2023
        System.out.println("test12B_IncrementFromJune15th2023 > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(16, date.getDay());
        Assert.assertEquals(6, date.getMonth());
        Assert.assertEquals(2023, date.getYear());
    }

    @Test
    public void test13B_IncrementFromJune15th2024() {
        DateUtil date = new DateUtil(15, 6, 2024); // June 15, 2024
        System.out.println("test13B_IncrementFromJune15th2024 > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(16, date.getDay());
        Assert.assertEquals(6, date.getMonth());
        Assert.assertEquals(2024, date.getYear());
    }

	@Test
	public void testMinJanuary1ShouldIncrementToJanuary2() {
		// Code here
	}
	
	@Test
	public void testMinJanuary1ShouldDecrementToDecember31() {
		// Code here
	}
	
	/*
	 * Write tests for rest months of year 2024.
	 */
}
