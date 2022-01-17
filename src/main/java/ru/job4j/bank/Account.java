package ru.job4j.bank;

import java.util.Objects;

/**
 * Класс описывает модель банковского счета
 * @author PETR SUMKIN
 * @version 1.0
 */
public class Account {
    /**
     * Поля класса - баланс и реквизиты
     */
    private String requisite;
    private double balance;

    /**
     * Конструктор класса, принимает на вход реквизиты
     * и первоначальный баланс счета
     * @param requisite
     * @param balance
     */
    public Account(String requisite, double balance) {
        this.requisite = requisite;
        this.balance = balance;
    }

    /**
     * Метод позволяет получить реквизиты счета
     * @return возвращает реквизиты счета
     */
    public String getRequisite() {
        return requisite;
    }

    /**
     * Метод позволяет задать реквизиты счета
     * @param requisite новые реквизиты счета
     */
    public void setRequisite(String requisite) {
        this.requisite = requisite;
    }

    /**
     * Метод позволяет получить баланс счета
     * @return возвращает баланс счета
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Метод позволяет задать баланс счета
     * @param balance новый баланс счета
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * Метод переопределяет работу стандартного метода equals,
     * сравнивая счета на основе реквизитов
     * @return возвращает true, если реквизиты идентичны
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Account account = (Account) o;
        return Objects.equals(requisite, account.requisite);
    }

    /**
     * Метод переопределяет работу стандартного метода hashCode,
     * устанавливая реквизиты в качестве уникального идентификатора счета
     * @return возвращает реквизиты счета
     */
    @Override
    public int hashCode() {
        return Objects.hash(requisite);
    }
}