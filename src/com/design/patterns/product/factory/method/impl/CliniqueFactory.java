package com.design.patterns.product.factory.method.impl;

import com.design.patterns.product.SkinCare;
import com.design.patterns.product.factory.method.MethodFactory;
import com.design.patterns.product.species.Clinique;

/**
 * Created by laiyunjie on 2018/4/25.
 */
public class CliniqueFactory implements MethodFactory {

    @Override
    public SkinCare getSkinCare() {
        return new Clinique();
    }
}
