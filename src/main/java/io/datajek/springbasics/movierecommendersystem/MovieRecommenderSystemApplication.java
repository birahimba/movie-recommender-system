package io.datajek.springbasics.movierecommendersystem;

import java.util.Arrays;

//import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//import io.datajek.springbasics.movierecommendersystem.Lecon1.ContentBasedFilter;
import io.datajek.springbasics.movierecommendersystem.Lecon1.RecommenderImplementation;
import io.datajek.springbasics.movierecommendersystem.Lecon2.CollaborativeFilter;

@SpringBootApplication
public class MovieRecommenderSystemApplication {

	public static void main(String[] args) {
		//SpringApplication.run(MovieRecommenderSystemApplication.class, args);
		RecommenderImplementation recommender = new RecommenderImplementation(new CollaborativeFilter());
		String[] result = recommender.recommendMovies("Finding Dory");
        System.out.println(Arrays.toString(result));
	}

}
