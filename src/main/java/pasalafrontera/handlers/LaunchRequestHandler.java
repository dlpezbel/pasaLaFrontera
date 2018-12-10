package pasalafrontera.handlers;

import java.util.Optional;
import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.LaunchRequest;
import com.amazon.ask.model.Response;
import pasalafrontera.PasaLaFronteraStreamHandler;

import static com.amazon.ask.request.Predicates.requestType;
public class LaunchRequestHandler implements RequestHandler  {

  public boolean canHandle(HandlerInput input) {
    return input.matches(requestType(LaunchRequest.class));
  }
  public Optional<Response> handle(HandlerInput input) {
    String speechText = "Bienvenido al juego de \"Pasa la frontera\". Puedes empezar diciendo pasa la frontera.";
    return input.getResponseBuilder()
        .withSpeech(speechText)
        .withSimpleCard(PasaLaFronteraStreamHandler.SKILL_TITLE, speechText)
        .withReprompt(speechText)
        .build();
  }
}
