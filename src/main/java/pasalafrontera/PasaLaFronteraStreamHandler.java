package pasalafrontera;

import com.amazon.ask.Skill;
import com.amazon.ask.SkillStreamHandler;
import com.amazon.ask.Skills;
import pasalafrontera.handlers.CancelandStopIntentHandler;
import pasalafrontera.handlers.EsLaLetraRequestHandler;
import pasalafrontera.handlers.HelpIntentHandler;
import pasalafrontera.handlers.LaunchRequestHandler;
import pasalafrontera.handlers.PalabraPasaLaFronteraRequestHandler;
import pasalafrontera.handlers.PasaLaFronteraRequestHandler;
import pasalafrontera.handlers.SessionEndedRequestHandler;

public class PasaLaFronteraStreamHandler extends SkillStreamHandler {
  public static final String SKILL_TITLE = "Pasa la frontera";

  private static Skill getSkill() {
    return Skills
        .standard()
        .addRequestHandlers(
            new LaunchRequestHandler(),
            new CancelandStopIntentHandler(),
            new SessionEndedRequestHandler(),
            new HelpIntentHandler(),
            new PasaLaFronteraRequestHandler(),
            new EsLaLetraRequestHandler(),
            new PalabraPasaLaFronteraRequestHandler()
        )
        .withSkillId("amzn1.ask.skill.963d7e4d-33d6-4a7b-b007-5ded85a7297a")
        .build();
  }

  public PasaLaFronteraStreamHandler() {
    super(getSkill());
  }

}