package org.launchcode.techjobs.oo;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;


public class JobTest {
    //TODO: Create your unit tests here

    @Test
    public void testSettingJobId() {
        Job jobOne = new Job();
        Job jobTwo = new Job();
        assertNotEquals(jobOne.getId(), jobTwo.getId());
    }
    @Test
    public void testJobConstructorSetsAllFields() {
        Job jobTests = new Job("Product tester", new Employer("ACME"),
                new Location("Desert"), new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
        assertTrue(jobTests instanceof Job);
        assertTrue(jobTests.getEmployer() instanceof Employer);
        assertTrue(jobTests.getLocation() instanceof Location);
        assertTrue(jobTests.getPositionType() instanceof PositionType);
        assertTrue(jobTests.getCoreCompetency() instanceof CoreCompetency);
        assertEquals(jobTests.getName(), "Product tester");
        assertEquals(jobTests.getEmployer().getValue(), "ACME");
        assertEquals(jobTests.getLocation().getValue(), "Desert" );
        assertEquals(jobTests.getPositionType().getValue(),"Quality control" );
        assertEquals(jobTests.getCoreCompetency().getValue(),"Persistence" );
    }

    @Test
    public void testJobsForEquality() {
        Job jobTesterOne = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job jobTesterTwo = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertNotEquals(jobTesterOne, jobTesterTwo);
    }
    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job stringJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
//        stringJob.toString();
//    assertEquals(stringJob.getName(), );
        String expected = stringJob.toString();
//        String firstChar = String.valueOf(stringJob.toString().charAt(0));
//        String lastChar = String.valueOf(stringJob.toString().charAt(stringJob.toString().length()-1));
        assertEquals(true, expected.startsWith("\n"));
        assertEquals(true, expected.endsWith("\n"));
    }
    @Test
    public void testToStringContainsCorrectLabelsAndData(){
        Job stringJob2 = new Job("Jeff", new Employer("ACME"), new Location("STL"), new PositionType("Web Dev"), new CoreCompetency("JS"));
        String stringFormat = "\nID: 4\n" + "Name: Jeff\n" + "Employer: ACME\n" + "Location: STL\n" + "Position Type: Web Dev\n" + "Core Competency: JS\n";
        assertEquals(stringFormat, stringJob2.toString());
    }
    @Test
    public void testToStringHandlesEmptyField(){
        Job stringJob3 = new Job("Jeff", new Employer(""), new Location("STL"), new PositionType("Web Dev"), new CoreCompetency("JS"));
        String stringFormat2 = "\nID: 3\n" + "Name: Jeff\n" + "Employer: Data not available\n" + "Location: STL\n" + "Position Type: Web Dev\n" + "Core Competency: JS\n";
        assertEquals(stringFormat2, stringJob3.toString());
    }
}
