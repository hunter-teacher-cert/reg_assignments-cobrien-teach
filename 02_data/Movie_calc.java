public class Movie_calc{

  public static void main(String[] args){
    //The title budget and grosses (both in millions) for five movies
    Movie f1 = new Movie("Barry Lyndon", 11, 20.2);
    Movie f2 = new Movie("Zodiac", 65, 84.8);
    Movie f3 = new Movie("The Big Lebowski", 15, 46.8);
    Movie f4 = new Movie("Burn After Reading", 37,163.7);
    Movie f5 = new Movie("Alien", 11, 106.2);
    Movie.list_films();

    System.out.println("Biggst budget: " + Movie.get_biggest_budget());
    System.out.println("Biggest worldwide gross: " +  Movie.get_biggest_gross());
    System.out.println("Most profitable: " + Movie.get_most_profitable());

  }
}
