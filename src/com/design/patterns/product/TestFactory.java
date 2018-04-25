package com.design.patterns.product;

import com.design.patterns.product.factory.abstractive.AbstractFactory;
import com.design.patterns.product.factory.abstractive.SkinCareFactory;
import com.design.patterns.product.factory.method.MethodFactory;
import com.design.patterns.product.factory.method.impl.BiothermFactory;
import com.design.patterns.product.factory.method.impl.CliniqueFactory;
import com.design.patterns.product.factory.simple.SimpleSkinCareFactory;

/**
 * Created by laiyunjie on 2018/4/24.
 */
public class TestFactory {


    public static void main(String[] args) {
        System.out.println("The following is a simple factory pattern.");
        SimpleSkinCareFactory scf = new SimpleSkinCareFactory();
        System.out.println("Simple factory : " + scf.getSkinCare("biotherm").toString());
        System.out.println("*****************************Dividing line****************************");
        System.out.println("The following is the method factory pattern.");
        MethodFactory methodFactory = new BiothermFactory();
        SkinCare skinCare = methodFactory.getSkinCare();
        System.out.println("Method factory one : " + skinCare.toString());
        MethodFactory mf = new CliniqueFactory();
        SkinCare sc = mf.getSkinCare();
        System.out.println("Method factory two : " + sc.toString());
        System.out.println("*****************************Dividing line****************************");
        System.out.println("The following is the abstract factory pattern.");
        AbstractFactory af = new SkinCareFactory();
        System.out.println("Abstract factory one : " + af.getBiotherm());
        System.out.println("Abstract factory one : " + af.getSulwhaso());

    }
}
