package ru.job4j.stream;

import java.util.Objects;

public record Label(String name, double score) implements Comparable<Label> {

        public double getScore() {
                return score;
        }

        @Override
        public boolean equals(Object o) {
                if (this == o) {
                        return true;
                }
                if (o == null || getClass() != o.getClass()) {
                        return false;
                }
                Label label = (Label) o;
                return Double.compare(label.score, score) == 0
                        && Objects.equals(name, label.name);
        }

        @Override
        public int hashCode() {
                return Objects.hash(name, score);
        }

        @Override
public int compareTo(Label o) {
        return Double.compare(this.score, o.score);
        }
        }