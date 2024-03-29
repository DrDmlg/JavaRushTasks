# Проект MVC
Проект ***MVC*** представляет собой консольное приложение для управления информацией о пользователях. 
Пользователь может просматривать, создавать, редактировать и удалять пользователей в системе. 
Проект разработан с использованием Java и шаблона проектирования ***MVC (Model-View-Controller)***.

## Структура проекта
 **Проект состоит из следующих пакетов и классов**:

Пакет **com.javarush.task.task36.task3608.bean**  
В этом пакете находится класс User, представляющий модель пользователя. Он содержит информацию о имени, идентификаторе и уровне пользователя.

Пакет **com.javarush.task.task36.task3608.controller**  
В этом пакете находится класс Controller, который обрабатывает запросы от пользователя и взаимодействует с моделью и представлениями.Контроллер 
выполняет операции загрузки пользователей, создания, редактирования и удаления пользователей, а также отображения информации о пользователях.

Пакет **com.javarush.task.task36.task3608.dao**  
В этом пакете находится класс UserDao, который предоставляет доступ к данным о пользователях. Он выполняет операции получения пользователей 
по идентификатору, имени, уровню и другим параметрам, а также создания и обновления пользователей.

Пакет **com.javarush.task.task36.task3608.model**  
В этом пакете находятся классы, связанные с моделью данных. MainModel является основной моделью приложения, которая загружает данные о 
пользователях, выполняет операции с ними и управляет данными для отображения. ModelData содержит информацию о текущих данных для отображения, 
таких как список пользователей и активный пользователь.

Пакет **com.javarush.task.task36.task3608.view**  
В этом пакете находятся классы представлений. UsersView отображает список пользователей, а EditUserView предоставляет возможность редактировать
данные о пользователе.

Пакет **com.javarush.task.task36.task3608.model.service**  
Этот пакет содержит интерфейс UserService и его реализацию UserServiceImpl. UserService определяет операции, которые могут быть 
выполнены с пользователями, такие как создание, удаление, получение пользователей по различным параметрам. UserServiceImpl предоставляет 
конкретную реализацию этих операций.

Пакет **com.javarush.task.task36.task3608**  
Этот пакет содержит класс Solution, который содержит точку входа в приложение и инициализацию основных компонентов, таких как контроллер, 
модель и представления.

## Запуск проекта

**Для запуска проекта выполните следующие шаги:**  
- Склонируйте репозиторий с проектом на ваш компьютер.  
- Откройте проект в вашей среде разработки (IDE).  
- Запустите класс Solution с методом main.  

После запуска приложения вы сможете использовать консольное меню для управления пользователями.

## Использование приложения
**Приложение позволяет выполнять следующие операции:**
- Просмотреть список всех пользователей.  
- Просмотреть список удаленных пользователей.  
- Просмотреть информацию о конкретном пользователе по идентификатору.  
- Создать нового пользователя.  
- Редактировать информацию о пользователе.  
- Удалить пользователя.
  
Для выполнения этих операций следуйте инструкциям в консольном меню приложения.

## Развитие проекта
Этот проект представляет собой учебный проект с целью демонстрации архитектурного подхода MVC (Model-View-Controller).
Вы можете дорабатывать и расширять проект, добавлять новые функции, улучшать интерфейс и т. д. Проект предоставляет основу для создания 
системы управления пользователями и может быть использован как отправная точка для разработки более сложных приложений.

## Связь
Если у вас есть какие-либо вопросы или предложения, вы можете связаться с мной по адресу dorokhov.did@gmail.com или через страницу GitHub.






