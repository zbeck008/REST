package com.pluralsight.excercise.services.repository;

import com.pluralsight.excercise.services.model.Activity;
import java.util.List;

/**
 *
 * @author Zack Beck
 */
public interface ActivityRepository {

    List<Activity> findAllActivities();
    
}
