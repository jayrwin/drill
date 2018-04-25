package com.design.patterns.product.factory.abstractive;

import com.design.patterns.product.SkinCare;

/**
 * Created by laiyunjie on 2018/4/25.
 */
public abstract class AbstractFactory {
    /**
     * get a Biotherm skin care product.
     * @return
     */
    public abstract SkinCare getBiotherm();

    /**
     * get a Clinique skin care product.
     * @return
     */
    public abstract SkinCare getClinique();

    /**
     * get a Sulwhaso skin care product.
     * @return
     */
    public abstract SkinCare getSulwhaso();


}
