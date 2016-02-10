/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pluralsight.excercise.services;

import com.pluralsight.excercise.services.repository.ActivityRepositoryStub;
import javax.ws.rs.Path;

/**
 *
 * @author Zack Beck
 */

@Path("activities")
public class ActivityResource {
    
    private ActivityRepository activityRepository = new ActivityRepositoryStub();
    
    @GET
    @Produces(MediaType.Application_XML)
    public List<Activity> getAllActivities() {
        return activityRepository.findAllActivities();
    }
    
}
