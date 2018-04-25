package com.design.patterns.product.factory.simple;

import com.design.patterns.product.SkinCare;
import com.design.patterns.product.species.Biotherm;
import com.design.patterns.product.species.Clinique;
import com.design.patterns.product.species.Sulwhaso;

/**
 * Created by laiyunjie on 2018/4/24.
 */
public class SimpleSkinCareFactory {

    public SkinCare getSkinCare(String name){
        if("biotherm".equalsIgnoreCase(name)){
            return new Biotherm();
        }else if ("clinique".equalsIgnoreCase(name)){
            return new Clinique();
        }else if ("sulwhaso".equalsIgnoreCase(name)){
            return new Sulwhaso();
        }else {
            return null;
        }

    }
}
