package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;

public class UserMap {

    public static class User {

        private int age;

        public User(int age) {
            this.age = age;
        }

        public int getAge() {
            return age;
        }
    }

    /**
     * make a list of users of the given ages
     * @param ages list of ages
     * @return list of users
     */
    public static List<User> map(List<Integer> ages) {
        return ages.stream()
                .map(User::new)
                .collect(Collectors.toList());
    }
}
