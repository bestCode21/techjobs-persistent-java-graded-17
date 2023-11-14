package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {
    @NotBlank(message = "Description is required")
    @Size(min = 10, max = 75, message = "Description must be between 10 and 75 characters")
    private String description;
    @ManyToMany(mappedBy = "skills")
    private List<Job> jobs = new ArrayList<>();
    public Skill() {
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public List<Job> getJobs() {
        return jobs;
    }
    //    public void addJob(Job job) {
//        this.jobs.add(job);
//    }
    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }
}









