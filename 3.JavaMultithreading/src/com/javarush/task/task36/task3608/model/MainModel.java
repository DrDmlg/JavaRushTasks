package com.javarush.task.task36.task3608.model;

import com.javarush.task.task36.task3608.bean.User;
import com.javarush.task.task36.task3608.model.service.UserService;
import com.javarush.task.task36.task3608.model.service.UserServiceImpl;

import java.util.List;

public class MainModel implements Model {

    private ModelData modelData = new ModelData();
    private UserService userService = new UserServiceImpl();

    @Override
    public ModelData getModelData() {
        return modelData;
    }

    @Override
    public void loadUsers() {
        List<User> users = getAllUsers();
        modelData.setUsers(users);
        modelData.setDisplayDeletedUserList(false);
    }

    public void loadDeletedUsers() {
        List<User> users = userService.getAllDeletedUsers();
        userService.filterOnlyActiveUsers(users);
        modelData.setUsers(users);
        modelData.setDisplayDeletedUserList(true);
    }

    public void loadUserById(long userId) {
        User user = userService.getUsersById(userId);
        modelData.setActiveUser(user);
    }

    public void deleteUserById(long id) {
        userService.deleteUser(id);
        List<User> usersBetweenLevels = userService.getUsersBetweenLevels(1, 100);
        List<User> users = userService.filterOnlyActiveUsers(usersBetweenLevels);
        modelData.setUsers(users);
    }

    private List<User> getAllUsers() {
        List<User> usersBetweenLevels = userService.getUsersBetweenLevels(1, 100);
        return userService.filterOnlyActiveUsers(usersBetweenLevels);
    }
}
