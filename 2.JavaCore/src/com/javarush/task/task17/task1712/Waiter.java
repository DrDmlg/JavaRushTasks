package com.javarush.task.task17.task1712;

public class Waiter implements Runnable {
    public boolean continueWorking = true;

    @Override
    public void run() {
        Manager manager = Manager.getInstance();

        while (continueWorking || !manager.getDishesQueue().isEmpty()) { //пока true ИЛИ очередь с готовыми блюдами НЕ пустая
            if (!manager.getDishesQueue().isEmpty()) {       // если есть готовое блюдо - относим готовый заказ
                Dishes dishes = manager.getDishesQueue().poll(); //возвращает с удалением элемент из начала очереди
                System.out.println("Официант отнес заказ для стола №" + dishes.getTableNumber()); // получаем номер стола
            } else {                                         // если очередь с готовыми заказами пустая - берем новый заказ
                Table table = manager.getNextTable(); //получаем номер текущего стола
                Order order = table.getOrder(); //получаем номер стола с которого был заказ
                System.out.println("Получен заказ от стола №" + order.getTableNumber()); // получаем номер стола
                manager.getOrderQueue().add(order); //добавляем блюдо в  очередь с заказами
            }
            try {
                Thread.sleep(100);  //walking to the next table
            } catch (InterruptedException e) {
            }
        }
    }
}
