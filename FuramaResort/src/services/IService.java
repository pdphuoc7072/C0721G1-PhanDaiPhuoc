package services;

import java.util.List;

public interface IService<E> {
    void add();
    void display();
    void edit();
    List<E> getList();
}
