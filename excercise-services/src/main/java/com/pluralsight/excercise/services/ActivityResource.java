package com.pluralsight.excercise.services;

import com.pluralsight.excercise.services.model.Activity;
import com.pluralsight.excercise.services.model.User;
import com.pluralsight.excercise.services.repository.ActivityRepository;
import com.pluralsight.excercise.services.repository.ActivityRepositoryStub;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Zack Beck
 */

@Path("activities") //http://localhost:8084/excercise-services/webapi/activities
public class ActivityResource {
    
    private ActivityRepository activityRepository = new ActivityRepositoryStub() {};
    
    
    @GET
    @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
    public List<Activity> getAllActivities() {
        return activityRepository.findAllActivities();
    }
    
    @GET
    @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
    @Path("{activityId}")
    public Activity getActivity(@PathParam ("activityId") String activityId) {
        return (Activity) activityRepository.findActivity(activityId);
    }
    
    @GET
    @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
    @Path("{activityId}/user") //http:localhost:8080/exercise-services/webapi/activities/1234/user
    public User getActivityUser(@PathParam ("activityId") String activityId) {
        return activityRepository.findActivity(activityId).getUser();
        }
        
        //Activity activity = activityRepository.findActivity(activityId);
        //User user = activity.getUser();
        //return User;
        
        
        }
        
