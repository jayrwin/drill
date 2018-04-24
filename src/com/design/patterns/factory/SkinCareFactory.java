package com.design.patterns.factory;

import com.design.patterns.factory.product.SkinCare;
import com.design.patterns.factory.product.species.Biotherm;
import com.design.patterns.factory.product.species.Clinique;
import com.design.patterns.factory.product.species.Sulwhaso;

/**
 * Created by laiyunjie on 2018/4/24.
 */
public class SkinCareFactory {

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
