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


        String expected = "\n" +
                "ID: " + job.getId() + "\n" +
                "Name: Product tester" + "\n" +
                "Employer: ACME" + "\n" +
                "Location: Desert" + "\n" +
                "Position Type: Quality control" + "\n" +
                "Core Competency: Persistence" + "\n";

        assertEquals(expected, job.toString());

    }


    @Test
    public void testToStringHandlesEmptyField(){
        Job testJob = new Job("Product tester", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
        String text = testJob.toString();
        assertTrue(text.contains("Data not available"));

    }


    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));

        String expected = System.lineSeparator();
//                "ID: " + job.getId() + System.lineSeparator() +
//                "Name: Product tester" + System.lineSeparator() +
//                "Employer: ACME" + System.lineSeparator() +
//                "Location: Desert" + System.lineSeparator() +
//                "Position Type: Quality control" + System.lineSeparator() +
//                "Core Competency: Persistence" + System.lineSeparator();
//                "\r\n"; // Ending new line


        int length = job.toString().length()-2;
        System.out.println(length);
        assertEquals(expected, job.toString().charAt(0));
        assertEquals(expected, job.toString().charAt(118));


    }

    }
