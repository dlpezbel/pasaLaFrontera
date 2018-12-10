package pasalafrontera.handlers;

import static pasalafrontera.PasaLaFronteraHelper.getInitialWord;
import static pasalafrontera.PasaLaFronteraHelper.getRandomLetter;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;
import com.amazon.ask.request.Predicates;
import java.util.Optional;
import pasalafrontera.PasaLaFronteraStreamHandler;

public class PasaLaFronteraRequestHandler implements RequestHandler {

  @Override
  public boolean canHandle(HandlerInput input) {
    return input.matches(Predicates.intentName("PasaLaFronteraIntent"));
  }

  @Override
  public Optional<Response> handle(HandlerInput input) {
    String letra = getRandomLetter();
    String palabraInicial = getInitialWord(letra);
    String speechText = "Comenzamos el juego. La palabra " + palabraInicial + " pasa la frontera.";
    input.getAttributesManager().getSessionAttributes().clear();
    input.getAttributesManager().getSessionAttributes().put("letra", letra);
    return input.getResponseBuilder()
        .withSpeech(speechText)
        .withSimpleCard(PasaLaFronteraStreamHandler.SKILL_TITLE, speechText)
        .withReprompt(speechText)
        .build();
  }

}

