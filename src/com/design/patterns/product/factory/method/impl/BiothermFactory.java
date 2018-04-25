package com.design.patterns.product.factory.method.impl;

import com.design.patterns.product.SkinCare;
import com.design.patterns.product.factory.method.MethodFactory;
import com.design.patterns.product.species.Biotherm;

/**
 * Created by laiyunjie on 2018/4/25.
 */
public class BiothermFactory implements MethodFactory {

    @Override
    public SkinCare getSkinCare() {
        return new Biotherm();
    }
}
