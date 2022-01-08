package ru.job4j.list;

import java.util.List;

public class ArProgression {
    public static int checkData(List<Integer> data) {
        int sum = data.get(0);
        boolean progression = true;
        for (int i = 1; i < data.size() - 1; i++) {
            if (data.get(i) == (data.get(i - 1) + data.get(i + 1)) / 2) {
                sum += data.get(i);
            } else {
                progression = false;
            }
        }
        sum += data.get(data.size() - 1);
        if (!progression) {
            return 0;
        } else {
            return sum;
        }
    }
}