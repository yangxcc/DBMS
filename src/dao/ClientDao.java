package dao;

import domain.Client;

public interface ClientDao {
    void add(Client client);
    void delete(Client client);
    void update(Client client);
    void finds(Client client);
    public void getTotalRecord();
}
