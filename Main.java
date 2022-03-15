import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    double liczba1, liczba2;
    char znak;
    Scanner wpisz = new Scanner(System.in);
    System.out.println("Podaj pierwszą liczbę");
    liczba1 = wpisz.nextDouble();
    System.out.println("Podaj drugą liczbę");
    liczba2 = wpisz.nextDouble();

    System.out.println("Żeby zsumować liczby klknij 1");
    System.out.println("Żeby odjąć liczby klknij 2");
    System.out.println("Żeby pomnożyc liczby klknij 3");
    System.out.println("Żeby podzielić liczby klknij 4");

    znak = wpisz.next().charAt(0);
    switch(znak){
      case '1':
        {
        System.out.println("Otrzymana liczba to : " + (liczba1 + liczba2));
        break;  
        }
      case '2':
        {
        System.out.println("Otrzymana liczba to : " + (liczba1 - liczba2));
          break;
      }  
      case '3':{
        System.out.println("Otrzymana liczba to : " + (liczba1 * liczba2));
        break;
      }
      case '4':{
        if(liczba2 !=0){
          System.out.println("Otrzymana liczba to : " + (liczba1 / liczba2));
        }
        else{
          System.out.println("Nie dzielimy przez 0");
        }
      }
    }
  }
}