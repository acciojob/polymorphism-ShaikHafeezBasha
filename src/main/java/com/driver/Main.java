package com.driver;

public class Main {
    public class Product{
        public void product(int x,int y){
            System.out.println(x*y);
        }
        public void product(int x,int y,int z){
            System.out.println(x*y*z);
        }

        public void product(double x,double y){
            System.out.println(x*y);
        }

    }
    public void main(String[] args) {
        Product p=new Product();
        p.product(5,6);
        p.product(5,6,7);
        p.product(5.1,6.2);
    }
}
