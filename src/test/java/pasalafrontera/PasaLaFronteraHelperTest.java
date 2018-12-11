package pasalafrontera;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class PasaLaFronteraHelperTest {

  @Test
  public void getRandomLetter() {
    String randomLetter = PasaLaFronteraHelper.getRandomLetter();
    assertNotNull(randomLetter);
    assertTrue(randomLetter.length()==1);
  }
  @Test
  public void getInitialWord() {
    String randomLetter = PasaLaFronteraHelper.getRandomLetter();
    String word = PasaLaFronteraHelper.getInitialWord(randomLetter);
    assertNotNull(word);
    assertTrue(word.indexOf(randomLetter)==-1);
  }

}
