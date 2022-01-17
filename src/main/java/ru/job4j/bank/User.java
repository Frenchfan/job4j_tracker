package ru.job4j.bank;

import java.util.Objects;

/**
 * Класс описывает модель пользователя банка
 * @author PETR SUMKIN
 * @version 1.0
 */
public class User {
    /**
     * Поля класс - паспорт и ФИО
     */
    private String passport;
    private String username;

    /**
     * Конструктор класса, задает номер паспорта и ФИО нового пользователя
     * @param passport номер паспорта
     * @param username ФИО пользователя
     */
    public User(String passport, String username) {
        this.passport = passport;
        this.username = username;
    }

    /**
     * Метод позволяет получить номер паспорта
     * @return возвращает номер паспорта
     */
    public String getPassport() {
        return passport;
    }

    /**
     * Метод позволяет задать номер паспорта пользователя
     * @param passport новый номер паспорта
     */
    public void setPassport(String passport) {
        this.passport = passport;
    }

    /**
     * Метод позволяет получить ФИО пользователя
     * @return возвращает ФИО пользователя
     */
    public String getUsername() {
        return username;
    }

    /**
     * Метод позволяет установить ФИО пользователя
     * @param username новые ФИО пользователя
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Метод переопределяет работу стандартного метода equals,
     * сравнивая пользователей по номеру паспорта
     * @return возвращает true, если номера паспортов идентичны
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(passport, user.passport);
    }

    /**
     * Метод переопределяет работу стандартного метода hashCode,
     * устанавливая номер паспорта в качестве уникального
     * идентификатора пользователя
     * @return возвращает номер паспорта
     */
    @Override
    public int hashCode() {
        return Objects.hash(passport);
    }
}