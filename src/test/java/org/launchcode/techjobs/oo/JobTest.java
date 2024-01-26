package org.launchcode.techjobs.oo;

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
        Job jobTesterOne = new Job("Product tester", new Employer("ACME"),
        new Location("Desert"), new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
        Job jobTesterTwo = new Job("Product tester", new Employer("ACME"),
                new Location("Desert"), new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
        assertNotEquals(jobTesterOne, jobTesterTwo);
    }
}
