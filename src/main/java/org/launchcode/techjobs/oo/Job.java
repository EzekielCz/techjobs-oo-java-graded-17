package org.launchcode.techjobs.oo;

import java.util.Objects;

import static java.util.Objects.isNull;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }
    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.


    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.


    @Override
    public String toString() {
        String stringThing = "\nID";
//         if(employer.getValue().isEmpty()&& location.getValue().isEmpty() && positionType.getValue().isEmpty() && coreCompetency.getValue().isEmpty()){
//            return "There is no job";
        stringThing +=  ": "+this.id + "\n";
        if (name.isEmpty()) {
            stringThing += "Name: Data not available\n";
        }
        else {
            stringThing += "Name: " +this.name + "\n";
        }

        if (this.employer == null || employer.getValue().isEmpty()){
            stringThing +=  "Employer: Data not available\n";
        }
        else {
            stringThing += "Employer: " +this.employer + "\n";
        }

        if (location.getValue().isEmpty()){
            stringThing += "Location: Data not available\n";
        }
        else {
            stringThing += "Location: " +this.location + "\n";
        }

        if (positionType.getValue().isEmpty()){
            stringThing += "Position Type: Data not available\n";
        }
        else {
            stringThing += "Position Type: " +this.positionType + "\n";
        }

        if (coreCompetency.getValue().isEmpty()){
            stringThing += "Core Competency: Data not available\n";
        }
        else {
            stringThing += "Core Competency: " +this.coreCompetency + "\n";
        }
        return stringThing;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public int getId() {
        return id;
    }
}
