package com.harsha.sdos.addtask.interfaces;

import com.harsha.sdos.models.Task;
import com.harsha.sdos.models.TaskGroup;
import com.harsha.sdos.models.User;

import java.util.ArrayList;

import io.realm.RealmResults;

/**
 * Created by ruano on 09/02/2018.
 */

public interface IAddTaskPresenter {

    void getallSkillGroupOK(ArrayList<TaskGroup> skillgroups);
    void getallSkillGroupKO();
    void getallUsersOK(ArrayList<User> users);
    void getallUsersKO();

    void getPendingTaskOfThisUsersOK(RealmResults<Task> skillsPending);
    void getPendingTaskOfThisUsersKO();

    void userFoundOK(User user);
    void userFoundKO();

}
