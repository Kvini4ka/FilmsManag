package org.example;

public class FilmsManager {
    private String[] films = new String[0];
    private int limit;

    public FilmsManager() {
        this.limit = 5;

    }

    public FilmsManager(int limit) {
        this.limit = limit;
    }


    public void add(String film) {
        String[] tmp = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        this.films = tmp;


    }

    public String[] findAll() {
        return films;


    }

    public String[] findLast() {
        int result;

        if (films.length < limit) {
            result = films.length;
        } else {
            result = limit;
        }
        String[] tmp = new String[result];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = films[films.length - 1 - i];
        }
        return tmp;

    }
}
