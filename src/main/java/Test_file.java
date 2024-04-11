import static org.junit.Assert.assertEquals;
import org.junit.Test;

class Test_file {

  private final App app = new App();

  @Test
  void Formule_Standard_Assiette_withcofee() {
    int price = app.Compute("assiette", "couscous", "coca", "moyen", "baba", "normal", "yes");
    assertEquals(18, price);
  }

  @Test
  void Formule_Max_Assiette_withcofee() {
    int price = app.Compute("assiette", "couscous", "coca", "grand", "baba", "normal", "yes");
    assertEquals(22, price);
  }

  @Test
  void Formule_Standars_Sandwich_withcofee() {
    int price = app.Compute("sandwich", "couscous", "coca", "moyen", "baba", "normal", "yes");
    assertEquals(14, price);
  }

  @Test
  void Formule_Max_Sandwich_withcofee() {
    int price = app.Compute("sandwich", "couscous", "coca", "grand", "baba", "normal", "yes");
    assertEquals(17, price);
  }

  @Test
  void Formule_Standard_Assiette_withoutcoffee() {
    int price = app.Compute("assiette", "couscous", "coca", "moyen", "baba", "normal", "no");
    assertEquals(18, price);
  }

  @Test
  void Formule_Max_Assiette_withoutcoffee() {
    int price = app.Compute("assiette", "couscous", "coca", "grand", "baba", "normal", "no");
    assertEquals(22, price);
  }

  @Test
  void Formule_Standars_Sandwich_withoutcoffee() {
    int price = app.Compute("sandwich", "couscous", "coca", "moyen", "baba", "normal", "no");
    assertEquals(14, price);
  }

  @Test
  void Formule_Max_Sandwich_withoutcoffee() {
    int price = app.Compute("sandwich", "couscous", "coca", "grand", "baba", "normal", "no");
    assertEquals(17, price);
  }

}