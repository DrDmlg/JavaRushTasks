package com.javarush.task.task17.task1712;

public class Cook implements Runnable {
    public boolean continueWorking = true;

    @Override
    public void run() {
        boolean needToWait;
        while (continueWorking || needToCookOrders()) { // пока true ИЛИ пока есть очередь с заказами
            try {
                synchronized (this) {
                    needToWait = !needToCookOrders(); // пока в очереди есть заказы
                    if (!needToWait) { // если false
                        cook(); //готовим
                    }
                }
                if (continueWorking && needToWait) {
                    System.out.println("Повар отдыхает");
                    Thread.sleep(100);
                }
            } catch (InterruptedException e) {
            }
        }
    }

    private boolean needToCookOrders() {
        return !Manager.getInstance().getOrderQueue().isEmpty(); // если очередь с заказами НЕ пустая
    }

    private void cook() throws InterruptedException {
        Manager manager = Manager.getInstance(); // получаем объект класса Manager
        Order order = manager.getOrderQueue().poll();      // повар берет заказ из  начала очереди (и он автоматически удаляется из начала очереди)
        System.out.println(String.format("Заказ будет готовиться %d мс для стола №%d", order.getTime(), order.getTableNumber()));
        Thread.sleep(order.getTime());     // готовим блюдо
        Dishes dishes = new Dishes(order.getTableNumber());       //  это готовое блюдо для стола
        System.out.println(String.format("Заказ для стола №%d готов", dishes.getTableNumber()));
        manager.getDishesQueue().add(dishes);
    }
}
