package com.harsha.sdos.addtask.interfaces;

import com.harsha.sdos.models.TaskGroup;
import com.harsha.sdos.models.User;

import java.util.ArrayList;

/**
 * Created by ruano on 09/02/2018.
 */

public interface IAddTaskView {

    void getallSkillGroupOK(ArrayList<TaskGroup> skillgroups);
    void getallSkillGroupKO();

    void getFreeUsersForTaskKO();

    void taskAddedCompletedOK(User user);
    void taskAddedCompletedKO();

}
