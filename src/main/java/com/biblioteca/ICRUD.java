package com.biblioteca;

import java.util.List;

public interface ICRUD<T> {
    public void create(T object);

    public List<T> readAll();

    public List<T> readOthers(String column, String parameters);

    public T readId(int parameters);

    public void update(T object);

    public void delete(T object);

    public void print(List<T> object);

}
