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
	
    // For January Month 2024
    
    @Test
	public void testMaxJanuary31ShouldIncrementToFebruary1() {
		// January max boundary area: max+1
		DateUtil date = new DateUtil(31, 1, 2024);
        System.out.println("january31ShouldIncrementToFebruary1 > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(2, date.getMonth());
        Assert.assertEquals(1, date.getDay());
	}
	
	@Test
	public void testMaxJanuary31ShouldDecrementToJanuary30() {
		// January max boundary area: max-1
		DateUtil date = new DateUtil(31, 1, 2024);
        System.out.println("january31ShouldDecrementToJanuary30 > " + date);
        date.decrement();
        System.out.println(date);
        Assert.assertEquals(30, date.getDay());
        Assert.assertEquals(1, date.getMonth());
	}
	
	@Test
	public void testNominalJanuary() {
		int rand_day_1_to_31 = 1 + new Random().nextInt(31);
        DateUtil date = new DateUtil(rand_day_1_to_31, 1, 2024);
        System.out.println("testJanuaryNominal > " + date);
        date.increment();
        System.out.println(date);
	}
	
	
	//For February Month
	
	@Test
	public void testFebruaryMaxShouldIncrementToMarch1() {
	    // February max boundary area: max+1
	    DateUtil date = new DateUtil(29, 2, 2024); // Leap year, so 29 days in February
	    System.out.println("februaryMaxShouldIncrementToMarch1 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(3, date.getMonth());
	    Assert.assertEquals(1, date.getDay());
	}
	
	@Test
	public void testFebruaryLeapYearShouldDecrementToFebruary29() {
	    // February max boundary area: max-1 (Leap year)
	    DateUtil date = new DateUtil(1, 3, 2024); // March 1, 2024
	    System.out.println("februaryLeapYearShouldDecrementToFebruary29 > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(29, date.getDay());
	    Assert.assertEquals(2, date.getMonth());
	}
	
	@Test
	public void testNominalFebruary() {
		int rand_day_1_to_29 = 1 + new Random().nextInt(31);
        DateUtil date = new DateUtil(rand_day_1_to_29, 1, 2024);
        System.out.println("testFebruaryNominal > " + date);
        date.increment();
        System.out.println(date);
	}
	
	
	// March Month
	
	@Test
	public void testMarchMaxShouldIncrementToApril1() {
	    // March max boundary area: max+1
	    DateUtil date = new DateUtil(31, 3, 2024); // March 31, 2024
	    System.out.println("marchMaxShouldIncrementToApril1 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(4, date.getMonth());
	    Assert.assertEquals(1, date.getDay());
	}

	@Test
	public void testMarchShouldDecrementToFebruary28LeapYear() {
	    // March max boundary area: max-1 (Leap year)
	    DateUtil date = new DateUtil(1, 4, 2024); // April 1, 2024
	    System.out.println("marchShouldDecrementToFebruary28LeapYear > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(31, date.getDay());
	    Assert.assertEquals(3, date.getMonth());
	}

	@Test
	public void testNominalMarch() {
	    int rand_day_1_to_31 = 1 + new Random().nextInt(31);
	    DateUtil date = new DateUtil(rand_day_1_to_31, 3, 2024);
	    System.out.println("testMarchNominal > " + date);
	    date.increment();
	    System.out.println(date);
	}
	
	//For April
	
	@Test
	public void testAprilMaxShouldIncrementToMay1() {
	    // April max boundary area: max+1
	    DateUtil date = new DateUtil(30, 4, 2024); // April 30, 2024
	    System.out.println("aprilMaxShouldIncrementToMay1 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(5, date.getMonth());
	    Assert.assertEquals(1, date.getDay());
	}

	@Test
	public void testAprilShouldDecrementToMarch31() {
	    // April max boundary area: max-1
	    DateUtil date = new DateUtil(1, 5, 2024); // May 1, 2024
	    System.out.println("aprilShouldDecrementToMarch31 > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(30, date.getDay());
	    Assert.assertEquals(4, date.getMonth());
	}

	@Test
	public void testNominalApril() {
	    int rand_day_1_to_30 = 1 + new Random().nextInt(30);
	    DateUtil date = new DateUtil(rand_day_1_to_30, 4, 2024);
	    System.out.println("testAprilNominal > " + date);
	    date.increment();
	    System.out.println(date);
	}
	
	// For May
	@Test
	public void testMayMaxShouldIncrementToJune1() {
	    // May max boundary area: max+1
	    DateUtil date = new DateUtil(31, 5, 2024); // May 31, 2024
	    System.out.println("mayMaxShouldIncrementToJune1 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(6, date.getMonth());
	    Assert.assertEquals(1, date.getDay());
	}

	@Test
	public void testMayShouldDecrementToApril30() {
	    // May max boundary area: max-1
	    DateUtil date = new DateUtil(1, 5, 2024); // May 1, 2024
	    System.out.println("mayShouldDecrementToApril30 > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(30, date.getDay());
	    Assert.assertEquals(4, date.getMonth());
	}

	@Test
	public void testNominalMay() {
	    int rand_day_1_to_31 = 1 + new Random().nextInt(31);
	    DateUtil date = new DateUtil(rand_day_1_to_31, 5, 2024);
	    System.out.println("testMayNominal > " + date);
	    date.increment();
	    System.out.println(date);
	}

	//For June
	
	@Test
	public void testJuneMaxShouldIncrementToJuly1() {
	    // June max boundary area: max+1
	    DateUtil date = new DateUtil(30, 6, 2024); // June 30, 2024
	    System.out.println("juneMaxShouldIncrementToJuly1 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(7, date.getMonth());
	    Assert.assertEquals(1, date.getDay());
	}

	@Test
	public void testJuneShouldDecrementToMay31() {
	    // June max boundary area: max-1
	    DateUtil date = new DateUtil(1, 6, 2024); // June 1, 2024
	    System.out.println("juneShouldDecrementToMay31 > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(31, date.getDay());
	    Assert.assertEquals(5, date.getMonth());
	}

	@Test
	public void testNominalJune() {
	    int rand_day_1_to_30 = 1 + new Random().nextInt(30);
	    DateUtil date = new DateUtil(rand_day_1_to_30, 6, 2024);
	    System.out.println("testJuneNominal > " + date);
	    date.increment();
	    System.out.println(date);
	}
	
	
	//For July
	
	@Test
	public void testJulyMaxShouldIncrementToAugust1() {
	    // July max boundary area: max+1
	    DateUtil date = new DateUtil(31, 7, 2024); // July 31, 2024
	    System.out.println("julyMaxShouldIncrementToAugust1 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(8, date.getMonth());
	    Assert.assertEquals(1, date.getDay());
	}

	@Test
	public void testJulyShouldDecrementToJune30() {
	    // July max boundary area: max-1
	    DateUtil date = new DateUtil(1, 7, 2024); // July 1, 2024
	    System.out.println("julyShouldDecrementToJune30 > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(30, date.getDay());
	    Assert.assertEquals(6, date.getMonth());
	}

	@Test
	public void testNominalJuly() {
	    int rand_day_1_to_31 = 1 + new Random().nextInt(31);
	    DateUtil date = new DateUtil(rand_day_1_to_31, 7, 2024);
	    System.out.println("testJulyNominal > " + date);
	    date.increment();
	    System.out.println(date);
	}
	
	// For August
	
	@Test
	public void testAugustMaxShouldIncrementToSeptember1() {
	    // August max boundary area: max+1
	    DateUtil date = new DateUtil(31, 8, 2024); // August 31, 2024
	    System.out.println("augustMaxShouldIncrementToSeptember1 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(9, date.getMonth());
	    Assert.assertEquals(1, date.getDay());
	}

	@Test
	public void testAugustShouldDecrementToJuly31() {
	    // August max boundary area: max-1
	    DateUtil date = new DateUtil(1, 9, 2024); // September 1, 2024
	    System.out.println("augustShouldDecrementToJuly31 > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(31, date.getDay());
	    Assert.assertEquals(8, date.getMonth());
	}

	@Test
	public void testNominalAugust() {
	    int rand_day_1_to_31 = 1 + new Random().nextInt(31);
	    DateUtil date = new DateUtil(rand_day_1_to_31, 8, 2024);
	    System.out.println("testAugustNominal > " + date);
	    date.increment();
	    System.out.println(date);
	}
	
	//For September
	
	@Test
	public void testSeptemberMaxShouldIncrementToOctober1() {
	    // September max boundary area: max+1
	    DateUtil date = new DateUtil(30, 9, 2024); // September 30, 2024
	    System.out.println("septemberMaxShouldIncrementToOctober1 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(10, date.getMonth());
	    Assert.assertEquals(1, date.getDay());
	}

	@Test
	public void testSeptemberShouldDecrementToAugust31() {
	    // September max boundary area: max-1
	    DateUtil date = new DateUtil(1, 9, 2024); // September 1, 2024
	    System.out.println("septemberShouldDecrementToAugust31 > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(31, date.getDay());
	    Assert.assertEquals(8, date.getMonth());
	}

	@Test
	public void testNominalSeptember() {
	    int rand_day_1_to_30 = 1 + new Random().nextInt(30);
	    DateUtil date = new DateUtil(rand_day_1_to_30, 9, 2024);
	    System.out.println("testSeptemberNominal > " + date);
	    date.increment();
	    System.out.println(date);
	}
	
	// For October
	
	@Test
	public void testOctoberMaxShouldIncrementToNovember1() {
	    // October max boundary area: max+1
	    DateUtil date = new DateUtil(31, 10, 2024); // October 31, 2024
	    System.out.println("octoberMaxShouldIncrementToNovember1 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(11, date.getMonth());
	    Assert.assertEquals(1, date.getDay());
	}

	@Test
	public void testOctoberShouldDecrementToSeptember30() {
	    // October max boundary area: max-1
	    DateUtil date = new DateUtil(1, 10, 2024); // October 1, 2024
	    System.out.println("octoberShouldDecrementToSeptember30 > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(30, date.getDay());
	    Assert.assertEquals(9, date.getMonth());
	}

	@Test
	public void testNominalOctober() {
	    int rand_day_1_to_31 = 1 + new Random().nextInt(31);
	    DateUtil date = new DateUtil(rand_day_1_to_31, 10, 2024);
	    System.out.println("testOctoberNominal > " + date);
	    date.increment();
	    System.out.println(date);
	}
	
	
	// For November
	
	@Test
	public void testNovemberMaxShouldIncrementToDecember1() {
	    // November max boundary area: max+1
	    DateUtil date = new DateUtil(30, 11, 2024); // November 30, 2024
	    System.out.println("novemberMaxShouldIncrementToDecember1 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(12, date.getMonth());
	    Assert.assertEquals(1, date.getDay());
	}

	@Test
	public void testNovemberShouldDecrementToOctober31() {
	    // November max boundary area: max-1
	    DateUtil date = new DateUtil(1, 12, 2024); // December 1, 2024
	    System.out.println("novemberShouldDecrementToOctober31 > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(30, date.getDay());
	    Assert.assertEquals(11, date.getMonth());
	}

	@Test
	public void testNominalNovember() {
	    int rand_day_1_to_30 = 1 + new Random().nextInt(30);
	    DateUtil date = new DateUtil(rand_day_1_to_30, 11, 2024);
	    System.out.println("testNovemberNominal > " + date);
	    date.increment();
	    System.out.println(date);
	}
	
	// For December
	
	@Test
	public void testDecemberMaxShouldIncrementToJanuary1NextYear() {
	    // December max boundary area: max+1
	    DateUtil date = new DateUtil(31, 12, 2024); // December 31, 2024
	    System.out.println("decemberMaxShouldIncrementToJanuary1NextYear > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(1, date.getMonth());
	    Assert.assertEquals(1, date.getDay());
	}

	@Test
	public void testDecemberShouldDecrementToNovember30() {
	    // December max boundary area: max-1
	    DateUtil date = new DateUtil(1, 12, 2024); // December 1, 2024
	    System.out.println("decemberShouldDecrementToNovember30 > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(30, date.getDay());
	    Assert.assertEquals(11, date.getMonth());
	}

	@Test
	public void testNominalDecember() {
	    int rand_day_1_to_31 = 1 + new Random().nextInt(31);
	    DateUtil date = new DateUtil(rand_day_1_to_31, 12, 2024);
	    System.out.println("testDecemberNominal > " + date);
	    date.increment();
	    System.out.println(date);
	}
	/*
	 * Complete below test cases.
	 */
	
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
