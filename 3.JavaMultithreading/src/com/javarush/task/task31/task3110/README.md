# Проект "Архиватор файлов"
Проект "Архиватор файлов" представляет собой консольное приложение для архивации и управления файлами. Приложение позволяет создавать, редактировать, распаковывать и просматривать содержимое архивов. Проект разработан с использованием Java и представляет собой реализацию базовых операций архивации файлов.

## Структура проекта
**Проект состоит из следующих пакетов и классов:**

Пакет **com.javarush.task.task31.task3110.bean**
В этом пакете находятся классы, представляющие объекты, которые можно архивировать, например, файлы и директории.

Пакет **com.javarush.task.task31.task3110.command**
В этом пакете находятся классы, реализующие различные команды архиватора, такие как создание архива, добавление файлов в архив, удаление файлов из архива и другие.

Пакет **com.javarush.task.task31.task3110.exception**
В этом пакете находятся классы исключений, которые могут возникнуть при работе с архиватором, например, PathIsNotFoundException и WrongZipFileException.

Пакет **com.javarush.task.task31.task3110.model**
В этом пакете находятся классы, связанные с моделью данных архиватора, такие как ZipFileManager, FileProperties и другие.

Пакет **com.javarush.task.task31.task3110.view**
В этом пакете находятся классы, отвечающие за отображение информации пользователю, такие как консольные представления и сообщения.

Пакет **com.javarush.task.task31.task3110.service**
Этот пакет содержит сервисные классы, включая UserService и UserServiceImpl, которые предоставляют конкретные реализации операций с архивами.

Пакет **com.javarush.task.task31.task3110**
Этот пакет содержит точку входа в приложение и инициализацию основных компонентов, таких как контроллер, модель и представления.

## Запуск проекта

**Для запуска проекта выполните следующие шаги:**  
- Склонируйте репозиторий с проектом на ваш компьютер.   
- Откройте проект в вашей среде разработки (IDE).   
- Запустите класс Archiver с методом main.   

После запуска приложения вы сможете использовать консольное меню для управления архивами и файлами.

## Использование приложения
**Приложение позволяет выполнять следующие операции:**  
- Создание нового архива.  
- Добавление файлов в архив.  
- Удаление файлов из архива.  
- Распаковка архива.  
- Просмотр содержимого архива.

Для выполнения этих операций следуйте инструкциям в консольном меню приложения.

## Требования
Для запуска проекта требуется Java 8 или выше. 

## Связь
Если у вас есть какие-либо вопросы или предложения, вы можете связаться с мной по адресу dorokhov.did@gmail.com или через страницу GitHub.
