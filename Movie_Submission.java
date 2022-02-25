public class Movies_Submission{
  public static int get_max_index(double[] arr){
    //returns the index for the largest element in an array of doubles
    int index = 0;
    for (int i=1; i<arr.length; i++){
      if (arr[i]>arr[index]){
        index = i;
      }
    }
    return index;
  }
  public static String biggest_budget(String[] titles, double[] budget){
    //returns title of file with biggest budget
    int index = get_max_index(budget);
    return titles[index];
  }
  public static String biggest_gross(String[] titles, double[] grosses){
    //returns title of film with highest gross;
    int gross_index = get_max_index(grosses);
    return titles[gross_index];
  }
  public static String most_profitable(String[] titles,double[] budget, double[] grosses){
    //calculates profitability as a proportion of budget, then returns title of film with highest profitability
    double[] profitability = new double[titles.length];
    for (int i = 0; i<titles.length; i++){
      double profit = (grosses[i] - budget[i]) / budget[i];
      profitability[i] = profit;
    }
    int max_profit = get_max_index(profitability);

    return titles[max_profit];
  }

  public static void main(String[] args){
    //The title budget and grosses for five movies, matched by index.
    String[] titles = { "Barry Lyndon", "Zodiac", "The Big Lebowski", "Burn After Reading", "Alien"};
    double[] budget = {11, 65, 15,37, 11}; //in millions
    double[] grosses ={20.2, 84.8, 46.8,163.7, 106.2}; //in millions

    System.out.println(biggest_budget(titles,budget));
    System.out.println(biggest_gross(titles,grosses));
    System.out.println(most_profitable(titles,budget,grosses));



  }
}
