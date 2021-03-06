package model;

import java.util.LinkedList;


public class Movies extends Viewable implements java.io.Serializable{
    /*Private Instance Variables */
    private LinkedList<Movie> movies;

    public Movies(){
        movies = new LinkedList<Movie>();
    }

    public void add(String name){
        movies.add(new Movie(name));
        notifyAllViews();
    }

    public void delete(String name){
        movies.remove(movie(name));
        notifyAllViews();
    }


    public Movie movie(String name){
        for(Movie movie: movies){
            if(movie.name().equals(name)){
                return movie;
            }
        }
        return null;
    }

    public LinkedList<Movie> list(){
        return movies; //return the linked list
    }


}
