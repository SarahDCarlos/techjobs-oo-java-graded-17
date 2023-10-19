package org.launchcode.techjobs.oo;

import org.junit.Test;

import static org.junit.Assert.*;

public class JobTest {
    //TODO: Create your unit tests here

    @Test
    public void testSettingJobId() {

        Job test_job1 = new Job();
        Job test_job2 = new Job();
        assertNotEquals(test_job1.getId(), test_job2.getId());

    }
    @Test
    public void testJobConstructorSetsAllFields() {
       Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

      //instance of
       assertEquals(String.valueOf(job1.getName()), "Product tester");
       assertEquals(String.valueOf(job1.getEmployer()), "ACME");
       assertEquals(String.valueOf(job1.getLocation()), "Desert");
       assertEquals("Quality control", String.valueOf(job1.getPositionType()));
       assertEquals(String.valueOf(job1.getCoreCompetency()), "Persistence");
    }

    @Test
    public void testJobsForEquality() {
        Job test1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job test2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(test1.getId() == test2.getId() );
    }


    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        // Create a Job object with specific data (for testing the toString method).
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));

    }

    @Test
    public void testToStringHandlesEmptyField(){
        Job testJob = new Job("Product tester", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
        String text = testJob.toString();
        assertTrue(text.contains("Data not available"));
    }

    }
