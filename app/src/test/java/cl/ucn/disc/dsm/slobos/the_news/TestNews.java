package cl.ucn.disc.dsm.slobos.the_news;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.ZoneId;
import java.time.ZonedDateTime;

import lombok.extern.slf4j.Slf4j;

/**
 * Test of the News Project
 * @author Sebastian Lobos
 */
@Slf4j
public  final class TestNews {

    private String author;
    private String title;
    private String source;
    private String urlImage;
    private Object description;
    private String content;

    /**
     * test the Constructor
     */
    @Test
    public void testConstructor(){

        log.debug("Testing Constructor .. ");

        //The constructor
        {

            News news = new News(
                    title"UCN hace pilotaje de instrumentos de evaluación diagnóstica de matemática y lenguaje",
                source"https://www.noticias.ucn.cl/",
                author"Sebastian Lobos",
                urlImage"https://www.noticias.ucn.cl/destacado/ucn-hace-pilotaje-de-instrumentos-de-evaluacion-diagnostica-de-matematica-y-lenguaje/")
                    description"Se busca medir conocimientos y habilidades elementales adquiridos por los estudiantes del Programa Propedéutico y PACE del plantel durante su formación escolar."
                    content"Estudiantes del Programa Propedéutico y PACE de la Universidad Católica del Norte (UCN) entre el 18 y el 22 de noviembre,  "

                    ZonedDateTime.now(ZoneId.of("-4"))
            );
            Assertions.assertNotNull( null, "The news was null");
            Assertions.assertNotNull(news.getId(), "The id Was null");
            Assertions.assertNotNull(news.getTitle(), "The title was null");
            Assertions.assertNotNull(news.getSource(), "The source was null");
            Assertions.assertNotNull(news.getDescription(), "The description was null ");
            Assertions.assertNotNull(news.getContent(), "The content was null");
            Assertions.assertNotNull(news.getUrl(), "The URL was null");
            Assertions.assertNotNull(news.getUrlImage(),"The Image was null");
            Assertions.assertNotNull(news.getDescription(), "The Description was null ");
            Assertions.assertNotNull(news.getContent(),"The content was null");
            Assertions.assertNotNull(news.getPublishedAt(), "The puglishedAt was null");

        }


    }
}
