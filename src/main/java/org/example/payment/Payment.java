package org.example.payment;

import org.example.factory.DbProductFactory;
import org.example.model.Db;
import org.example.model.IDbProduct;

public class Payment {
    public void pay(String productId){
        IDbProduct dbProduct = DbProductFactory.create(Db.MONGODB);
        String product = dbProduct.getProductById(productId);
        System.out.println(product);
    }
}