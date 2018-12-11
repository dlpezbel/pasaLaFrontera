package pasalafrontera;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class PasaLaFronteraHelper {

  private final static List<String> WORDS_INITIAL_LIST = Arrays
      .asList("policia", "puerta", "pesar", "zona", "sabe", "calle", "interior", "tampoco",
          "musica", "ningun", "vista", "campo", "buen", "hubiera", "saber", "obras", "razon", "ex",
          "niños", "presencia", "tema", "dinero", "comision", "antonio", "servicio", "hijo",
          "ultima", "ciento", "estoy", "hablar", "dio", "minutos", "produccion", "camino", "seis",
          "quien", "fondo", "direccion", "papel", "demas", "barcelona", "idea", "especial",
          "diferentes", "dado", "base", "capital", "ambos", "europa", "libertad", "relaciones",
          "espacio", "medios", "ir", "actual", "poblacion", "empresas", "estudio", "salud",
          "servicios", "haya", "principio", "siendo", "cultura", "anterior", "alto", "media",
          "mediante", "primeros", "arte", "paz", "sector", "imagen", "medida", "deben", "datos",
          "consejo", "personal", "interes", "julio", "grupos", "miembros", "ninguna", "existe",
          "cara", "edad", "etc", "movimiento", "visto", "llego", "puntos", "actividad", "bueno",
          "uso", "niño", "dificil", "joven", "futuro", "aquellos", "mes", "pronto", "soy", "hacia",
          "nuevos", "nuestros", "estaban", "posibilidad", "sigue", "cerca", "resultados",
          "educacion", "atencion", "gonzalez", "capacidad", "efecto", "necesario", "valor", "aire",
          "investigacion", "siguiente", "figura", "central", "comunidad", "necesidad", "serie",
          "organizacion", "nuevas", "calidad");

  public static String getInitialWord(String letra) {
    Collections.shuffle(WORDS_INITIAL_LIST);
    String initialWord = String.valueOf(
        WORDS_INITIAL_LIST.stream().filter(str -> !wordContainsLeter(letra,str)).findFirst());
    return initialWord;
  }

  private static boolean wordContainsLeter(String letra, String word) {
    return word.indexOf(letra) >= 0;
  }

  public static String getRandomLetter() {
    Random r = new Random();
    String alphabet = "abcdefghijklmnopqrstuvxyz";
    return Character.toString(alphabet.charAt(r.nextInt(alphabet.length())));
  }
}
