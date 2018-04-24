package com.design.patterns.factory;

/**
 * Created by laiyunjie on 2018/4/24.
 */
public class TestFactory {


    public static void main(String[] args) {
        SkinCareFactory scf = new SkinCareFactory();
        System.out.printf(scf.getSkinCare("biotherm").toString());
    }
}
