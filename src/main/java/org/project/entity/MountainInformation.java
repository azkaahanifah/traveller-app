package org.project.entity;

import java.util.List;

public class MountainInformation {

    private String mountainName;
    private String description;
    private String location;
    private Integer mdpl;
    private String rate;
    private List<String> images;

    public String getMountainName() {
        return mountainName;
    }

    public void setMountainName(String mountainName) {
        this.mountainName = mountainName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getMdpl() {
        return mdpl;
    }

    public void setMdpl(Integer mdpl) {
        this.mdpl = mdpl;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }
}
