package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {


    @NotEmpty(message = "Location must have an annotation to ensure the field is not empty")
    //@NotBlank(message = "Name is Required.")
    @Size(max = 100, message = "Location must be less than 100 characters")
    @NotNull(message = "Location must not be null")
    private String location;

    @OneToMany
    @JoinColumn(name = "employer_id")  // Add this line to specify the foreign key column
    private List<Job> jobs = new ArrayList<>();

    public Employer(){
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }

    public Employer(String location){
        //super();
        this.location =location;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
