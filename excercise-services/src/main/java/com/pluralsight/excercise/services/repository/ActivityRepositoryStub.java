/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pluralsight.excercise.services.repository;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Zack Beck
 */
public class ActivityRepositoryStub implements ActivityRepository {

    public List<Activity> findAllActivities() {
        List(Activity > activities = new ArrayList<Activity>());

        Activity activity1 = new Activity();

        activity1.setDescription("Swimming");
        activity1.setDuration(55);

        activities.add(activity1);

        Activity activity2 = new Activity();

        activity2.setDescription("Cycling");
        activity2.setDuration(120);

        activities.add(activity2);

        return activities;
    }

}
