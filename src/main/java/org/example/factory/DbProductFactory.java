package org.example.factory;

import org.example.model.Db;
import org.example.model.IDbProduct;
import org.example.model.MongoDbProduct;
import org.example.model.MySQLProduct;

public class DbProductFactory {

    public static IDbProduct create(Db type){
        if (type ==Db.MYSQL){
        return new MySQLProduct();
        }else {
            return new MongoDbProduct();
        }
    }
}