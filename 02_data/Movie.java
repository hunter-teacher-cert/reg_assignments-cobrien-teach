import java.io.*;
import java.util.*;

public class Movie{
  private String title;
  private double budget;
  private double gross;
  private double profitability;
  private static ArrayList<Movie> film_list = new ArrayList<>();

  public Movie(String title, double budget, double gross){
    this.title = title;
    this.budget = budget;
    this.gross = gross;
    //profitability calcualted as profits as a proportion of budget
    profitability = (gross - budget) / budget;
    film_list.add(this);
  }
  private static Movie null_movie(){
    Movie null_movie = new Movie("N/a", -1.0, -1.0);
    return null_movie;
  }
  public String get_title(){
    return title;
  }

  public double get_budget(){
    return budget;
  }

  public double get_gross(){
    return gross;
  }
  public double get_profit(){
    return profitability;
  }
  public String toString(){
    return  "title: " + title + "\nbudget: " + budget + "\nworldwide gross: " + gross + "\n";
  }
  public static void list_films(){
    for (Movie film : film_list){
      System.out.println(film);
    }

  }

  public static String get_biggest_budget(){
    Movie biggest = null_movie();
    for (Movie film : film_list){
      if (film.get_budget() > biggest.get_budget()){
        biggest = film;
      }
    }
    return(biggest.get_title());
  }

  public static String get_biggest_gross(){
    Movie biggest = null_movie();
    for (Movie film : film_list){
      if (film.get_gross() > biggest.get_gross()){
        biggest = film;
      }
    }
    return biggest.get_title();
  }

  public static String get_most_profitable(){
    Movie biggest = null_movie();
    for (Movie film : film_list){
      if (film.get_profit() > biggest.get_profit()){
        biggest = film;
      }
    }
    return biggest.get_title();
  }
}
