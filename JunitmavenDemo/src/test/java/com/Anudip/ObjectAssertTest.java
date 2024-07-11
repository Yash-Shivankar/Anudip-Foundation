package com.Anudip;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ObjectAssertTest {
    private Employee[] expectedEmps = new Employee[3];

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        // Initialization before all tests (if any)
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        // Cleanup after all tests (if any)
    }

    @Before
    public void setUp() throws Exception {
        // Initialize expectedEmps array with Employee objects
        expectedEmps[0] = new Employee(122, "Padmaja", "1200000");
        expectedEmps[1] = new Employee(123, "John", "1500000");
        expectedEmps[2] = new Employee(124, "Jane", "1300000");
    }

    @After
    public void tearDown() throws Exception {
        // Clean up after each test (if needed)
    }

    @Test
    public void testEmployeeList() {
        // Get the actual list of employees from Employee.getEmpList()
        Employee[] actualEmps = Employee.getEmpList().toArray(new Employee[0]);

        // Compare expectedEmps with actualEmps
        assertArrayEquals(expectedEmps, actualEmps);
    }
}
