package com.design.patterns.product.factory.abstractive;

import com.design.patterns.product.SkinCare;
import com.design.patterns.product.factory.method.impl.BiothermFactory;
import com.design.patterns.product.factory.method.impl.CliniqueFactory;
import com.design.patterns.product.factory.method.impl.SulwhasoFactory;
import com.design.patterns.product.species.Biotherm;
import com.design.patterns.product.species.Sulwhaso;

/**
 * Created by laiyunjie on 2018/4/25.
 */
public class SkinCareFactory extends AbstractFactory {
    @Override
    public SkinCare getBiotherm() {
        return new BiothermFactory().getSkinCare();
    }

    @Override
    public SkinCare getClinique() {
        return new CliniqueFactory().getSkinCare();
    }

    @Override
    public SkinCare getSulwhaso() {
        return new SulwhasoFactory().getSkinCare();
    }
}
