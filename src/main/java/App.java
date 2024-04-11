public class App {

  // calcule le prix payé par l'utilisateur dans le restaurant, en fonction de
  // type de
  // repas qu'il prend (assiette ou sandwich), de la taille de la boisson (petit,
  // moyen, grand), du dessert et
  // de son type (normal ou special) et si il prend un café ou pas (yes ou no).
  // les prix sont fixes pour chaque type de chose mais des réductions peuvent
  // s'appliquer
  // si cela rentre dans une formule!
  public int Compute(String type, String name, String beverage, String size, String dessert, String dsize,
      String coffee) {
    // prix total à payer pour le client
    int total = 0;

    // le type ne peut être vide car le client doit déclarer au moins un repas
    if (type == null || name == null || type.isEmpty() || name.isEmpty())
      return -1;

    if (type.equals("assiette") && size.equals("moyen") && dsize.equals("normal")) {
      System.out.print("Prix Formule Standard appliquée ");
      total = 18;

    } else if (type.equals("assiette") && size.equals("grand") && !dsize.equals("normal")) {
      System.out.print("Prix Formule Max appliquée ");
      total = 21;

    } else if (type.equals("sandwich") && size.equals("moyen") && dsize.equals("normal")) {
      System.out.print("Prix Formule Standard appliquée ");
      total = 13;

    } else if (type.equals("sandwich") && size.equals("grand") && !dsize.equals("normal")) {
      System.out.print("Prix Formule Max appliquée ");
      total = 16;

    } else {
      if (type.equals("assiette")) {
        total += 15;
      } else if (type.equals("sandwich")) {
        total += 10;
      } else {
        return -1;
      }
      // ainsi qu'une boisson de taille:
      if (!dsize.equals("normal")) {
        total += 4;
      } else {
        total += 2;
      }
      if (size == "petit") {
        total += 2;
      } else if (size == "moyen") {
        total += 3;
      } else if (size == "grand") {
        total += 4;
      }
    }
    if (type.equals("assiette") && size.equals("moyen") && dsize.equals("normal") && coffee.equals("yes")) {
      System.out.println(" avec café offert!");
    } else if (coffee.equals("yes")) {
        total += 1;
    }
    return total;
  }

}