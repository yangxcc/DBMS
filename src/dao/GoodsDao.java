package dao;

import domain.Goods;

public interface GoodsDao {
    void add(Goods goods);
    void delete(Goods goods);
    void update(Goods goods);
    Goods finds(Goods goods);      //查找特定id的货物信息
    public void getTotalRecord();  //得到全部的货物信息
}
