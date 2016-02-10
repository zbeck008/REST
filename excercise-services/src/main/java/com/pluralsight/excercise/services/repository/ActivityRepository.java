/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pluralsight.excercise.services.repository;

import java.util.List;

/**
 *
 * @author Zack Beck
 */
public interface ActivityRepository {

    List<Activity> findAllActivities();
    
}
