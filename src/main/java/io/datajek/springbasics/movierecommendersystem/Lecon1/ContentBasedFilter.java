package io.datajek.springbasics.movierecommendersystem.Lecon1;

import io.datajek.springbasics.movierecommendersystem.Lecon2.IFilter;

public class ContentBasedFilter implements IFilter{

    public String[] getRecommendations(String movie) {
        //logic of content based filter
        return new String[] {"Happy Feet", "Ice Age", "Shark Tale"};
    }
    
}
