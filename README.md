# ShopDaggerJava
Задание, для провеки уровня владением Dagger, на тематику приложения агрегатора товаров в магазинах
Шаблон этого задания на kolin https://github.com/JunoHunt/JunoShopDaggerTaskKotlin
---
Ход выполнения:
1. Создать свой репозиторий из этого шаблона
2. Реализовать поведение описанное в MainActivity
3. Закоммитить решение и запушить в свой репозиторий на своем аккаунте
4. Скинуть ссылку на репозиторий на почту hello@junohunt.ru

## Задача
---
В больших проектах используются различные MV*(MVP, MVI, MVVM),
но большинстве все эти зависимости в этих архитектурах решаются с помощью даггера

В этом проекте Activity взаимодействует с интерактором,
который в свою очередь берет данные из репозитория,
который берет данные из датасоурсов

Ваша задача решить зависимости уже реализованной архитектуры с помошью даггера
получить список магазинов из IMainActivityInteractor и вывести их в act_main_result_tv
Задача будет считаться решенной, если вы раскоментируете строки, возможно добавите,
запустите приложение и увидите на экране список магазинов

![task1](https://github.com/JunoHunt/JunoShopDaggerTaskKotlin/blob/master/examples/DaggerTask.jpg)
