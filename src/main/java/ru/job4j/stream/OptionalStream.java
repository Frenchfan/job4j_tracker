package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;

public class OptionalStream {

    public static class PhoneNumber {

        private String phone;

        public PhoneNumber(String phone) {
            this.phone = phone;
        }

        public String getPhone() {
            return phone;
        }

    }

    public static class User {

        private int id;

        private List<PhoneNumber> numbers;

        public User(int id, List<PhoneNumber> numbers) {
            this.id = id;
            this.numbers = numbers;
        }

        public int getId() {
            return id;
        }

        public List<PhoneNumber> getNumbers() {
            return numbers;
        }
    }

    /**
     * Finding the phone numbers of a user with an id.
     * the numbers start with the region
     * @param users list of users
     * @param id users's id
     * @param region start the number
     * @return list of phone numbers
     */
    public static List<PhoneNumber> collectNumber(List<User> users, int id, String region) {
        return users.stream()
                .filter(x -> x.id == id)
                .map(User::getNumbers)
                .flatMap(x -> x.stream()
                        .filter(phone -> phone.getPhone().startsWith(region)))
                .collect(Collectors.toList());
    }

}
