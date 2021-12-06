package ru.job4j.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

    public Error() {

    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println("Ошибка активна: " + active);
        System.out.println("Статус ошибки: " + status);
        System.out.println("Сообщение об ошибке " + message);
    }

    public static void main(String[] args) {
        Error defaultError = new Error();
        Error printError = new Error(true, 15, "Замените картридж");
        Error batteryError = new Error(true, 43, "Зарядите батарею");
        Error internetError = new Error(true, 12, "Нет подключения к сети интернет");
        defaultError.printInfo();
        printError.printInfo();
        batteryError.printInfo();
        internetError.printInfo();
    }
}
