package com.design.patterns.factory.product.species;

import com.design.patterns.factory.product.SkinCare;

/**
 * Created by laiyunjie on 2018/4/25.
 */
public class Sulwhaso implements SkinCare {

    @Override
    public String getName(String name) {
        return name;
    }

    @Override
    public String toString() {
        return "Sulwhaso";
    }
}
