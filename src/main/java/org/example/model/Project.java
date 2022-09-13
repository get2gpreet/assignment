package org.example.model;

import java.util.List;

public class Project {
    private String projectName;
    private double projectCost;
    private double rate;
    private double totalIncome;
    private double npv;
    List<Duration> duration;

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public double getProjectCost() {
        return projectCost;
    }

    public void setProjectCost(double projectCost) {
        this.projectCost = projectCost;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public List<Duration> getDuration() {
        return duration;
    }

    public void setDuration(List<Duration> duration) {
        this.duration = duration;
    }

    public double getTotalIncome() {
        return totalIncome;
    }

    public void setTotalIncome(double totalIncome) {
        this.totalIncome = totalIncome;
    }

    public double getNpv() {
        return npv;
    }

    public void setNpv(double npv) {
        this.npv = npv;
    }
}
