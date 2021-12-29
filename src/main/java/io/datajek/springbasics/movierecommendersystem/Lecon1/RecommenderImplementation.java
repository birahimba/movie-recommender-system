package io.datajek.springbasics.movierecommendersystem.Lecon1;

import io.datajek.springbasics.movierecommendersystem.Lecon2.IFilter;


public class RecommenderImplementation {

    private IFilter filter;

    public RecommenderImplementation(IFilter filter){
        super();
        this.filter = filter;
    }

    public String[] recommendMovies (String movie) {
       //print the name of interface implementation being used
    System.out.println("Name of the filter in use: " + filter + "\n");

    String[] results = filter.getRecommendations("Finding Dory");
    
    return results;
    }
    
}
