package com.javarush.task.task36.task3608.controller;
/* получает запрос от клиента, оповещает модель об этом, а модель в свою очередь будет
обновлять ModelData
 */

import com.javarush.task.task36.task3608.model.Model;
import com.javarush.task.task36.task3608.model.ModelData;

public class Controller {

    private Model model;

    public void setModel(Model model) {
        this.model = model;
    }

    public void onShowAllUsers() {
        model.loadUsers();
    }
}
