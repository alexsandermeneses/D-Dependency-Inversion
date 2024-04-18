package org.example.model;

public class MongoDbProduct implements IDbProduct{
    public String getProductById(String productId){
        return "MongoDB: Exibindo dados do produto: " + productId;
    }
}