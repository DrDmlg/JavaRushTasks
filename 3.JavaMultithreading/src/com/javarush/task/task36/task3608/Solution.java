package com.javarush.task.task36.task3608;

import com.javarush.task.task36.task3608.controller.Controller;
import com.javarush.task.task36.task3608.model.FakeModel;
import com.javarush.task.task36.task3608.model.MainModel;
import com.javarush.task.task36.task3608.model.Model;
import com.javarush.task.task36.task3608.view.EditUserView;
import com.javarush.task.task36.task3608.view.UsersView;

public class Solution {
    public static void main(String[] args) {
        Model model = new MainModel();
        UsersView usersView = new UsersView();
        EditUserView editUserView = new EditUserView();
        Controller controller = new Controller();

        controller.setModel(model);
        controller.setUsersView(usersView);
        controller.setEditUserView(editUserView);

        editUserView.setController(controller);
        usersView.setController(controller);

        usersView.fireEventShowAllUsers(); //возвращает всех пользоваталей из dao
        usersView.fireEventOpenUserEditForm(126L); //редактирование польз. по id
        editUserView.fireEventUserDeleted(124L); //удаление польз. по id
        editUserView.fireEventUserChanged("Golybev", 126L, 2); //добавляет нового пользователя
        usersView.fireEventShowDeletedUsers();
    }
}