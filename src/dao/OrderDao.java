package dao;

import domain.Order;

public interface OrderDao {
    void add(Order order);
    void delete(Order order);
    void update(Order order);
    void finds(Order order);
    public void getTotalRecord();
}
