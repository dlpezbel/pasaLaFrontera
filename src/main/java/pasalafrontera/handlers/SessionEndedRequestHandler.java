package pasalafrontera.handlers;

import static com.amazon.ask.request.Predicates.requestType;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;
import com.amazon.ask.model.SessionEndedRequest;
import java.util.Optional;
import pasalafrontera.PasaLaFronteraStreamHandler;

public class SessionEndedRequestHandler implements RequestHandler {

  public boolean canHandle(HandlerInput input) {
    return input.matches(requestType(SessionEndedRequest.class));
  }

  public Optional<Response> handle(HandlerInput input) {
    return input.getResponseBuilder()
        .withSpeech("Adiós")
        .withSimpleCard(PasaLaFronteraStreamHandler.SKILL_TITLE, "Adiós")
        .withShouldEndSession(true)
        .build();
  }
}