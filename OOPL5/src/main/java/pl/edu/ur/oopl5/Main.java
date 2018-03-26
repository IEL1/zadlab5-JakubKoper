package pl.edu.ur.oopl5;

public class Main {

    public static void main(String[] args) {
         Dane_Ksiazki k1 = new Dane_Ksiazki("Bastion", "Stephen King", 623, 1978, 36.70);
         Dane_Ksiazki k2 = new Dane_Ksiazki("Man in the High Castle", "Philip K. Dick", 272, 2001, 46.42);
         Dane_Ksiazki k3 = new Dane_Ksiazki("Gra o tron", "George R.R. Martin", 844, 2011, 32.02);
         
         k1.setCena(20.39);
         System.out.println(k1.getCena());
        // TODO zad 3, 5, 6
    }
          
}
