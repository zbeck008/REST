/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pluralsight.excercise.services.model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Zack Beck
 */
@XmlRootElement
public class Activity {
    
    private String description;
    private int duration;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
    
}
