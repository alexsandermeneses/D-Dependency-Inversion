package org.example.model;

public class MySQLProduct implements IDbProduct{
    public String getProductById(String productId){
        return "MySQL: Exibindo dados do produto: " + productId;
    }
}