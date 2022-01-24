package ru.job4j.bank;

import java.util.*;

/**
 * Класс описывает модель банковского сервиса
 * @author PETR SUMKIN
 * @version 1.0
 */
public class BankService {
    /**
     * Все пользователи с привязанными к ним счетами
     * хранятся в map типа {@link User} и {@link Account}
     */
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод позволяет добавить пользователя
     * @param user пользователь, т.е. объект класса {@link User}
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    /**
     * Метод позволяет добавить новый счет пользователю,
     * первоначально пользователя нужно найти по паспорту.
     * Для этого нужно использовать метод findByPassport.
     * @param passport номер паспорта пользователя
     * @param account номер счета пользователя
     */
    public void addAccount(String passport, Account account) {
        Optional<User> user = findByPassport(passport);
        if (user.isPresent()) {
            List<Account> accounts = users.get(user.get());
            if (!accounts.contains(account)) {
                accounts.add(account);
            }
        }
    }

    /**
     * Метод позволяет найти пользователя по паспорту
     * @param passport номер паспорта пользователя
     * @return возвращает пользователя, т.е. объект класса {@link User}
     */
    public Optional<User> findByPassport(String passport) {
        return users.keySet()
                .stream()
                .filter(s -> s.getPassport().equals(passport))
                .findFirst();
    }

    /**
     * Метод позволяет найти счет пользователя по реквизитам
     * @param passport номер паспорта
     * @param requisite реквизиты
     * @return возвращает счет пользователя
     */
    public Optional<Account> findByRequisite(String passport, String requisite) {
       /* User user = findByPassport(passport);
        if (user != null) {
            for (Account account : users.get(user)) {
                if (account.getRequisite().equals(requisite)) {
                    return account;
                }
            }
        }
        return null;*/
        Optional<User> user = findByPassport(passport);
        return user.flatMap(value -> users.get(value)
                .stream()
                .filter(s -> s.getRequisite().equals(requisite))
                .findFirst());
    }

    /**
     * Метод позволяет перечислять деньги с одного счета на другой
     * @param srcPassport номер паспорта отправителя
     * @param srcRequisite реквизиты счета отправителя
     * @param destPassport номер паспорта получателя
     * @param destRequisite реквизиты счета получателя
     * @param amount сумма перевода
     * @return возвращает true, если перевод удался
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Optional<Account> srcAccount = findByRequisite(srcPassport, srcRequisite);
        Optional<Account> destAccount = findByRequisite(destPassport, destRequisite);
        if ((srcAccount.isPresent()) && (destAccount.isPresent()) && (srcAccount.get().getBalance() >= amount)) {
            destAccount.get().setBalance(destAccount.get().getBalance() + amount);
            srcAccount.get().setBalance(srcAccount.get().getBalance() - amount);
            rsl = true;
        }
        return rsl;
    }
}