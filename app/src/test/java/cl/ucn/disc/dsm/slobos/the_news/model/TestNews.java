package cl.ucn.disc.dsm.slobos.the_news.model;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.ZoneId;
import java.time.ZonedDateTime;

import cl.ucn.disc.dsm.slobos.the_news.model.News;
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
                    "Autoridades UCN informan a las unidades los detalles del Plan Retorno y piden acelerar regreso",
                    "Noticias UCN",
                    "UCN",
                    "https://www.noticias.ucn.cl/destacado/autoridades-ucn-informan-a-las-unidades-los-detalles-del-plan-retorno-y-piden-acelerar-regreso/",
                    "https://www.noticias.ucn.cl/wp-content/uploads/2021/11/WhatsApp-Image-2021-11-05-at-13.26.53-1.jpeg",
                    "En reuniones presenciales realizadas en la Casa Central se expusieron las medidas adoptadas y se respondieron las dudas de los y las representantes de las distintas unidades de la Universidad.",
                    "Directores/as y representantes de las distintas unidades académicas de Antofagasta de la Universidad" +
                            " Católica del Norte (UCN), recibieron con aprobación los detalles del Plan Retorno que desarrolla nuestra Casa de Estudios. En dos reuniones presenciales realizadas en el auditorio Andrés Sabella de la Casa Central, el vicerrector académico, Nelson Fernández Vergara; la vicerrectora de Asuntos Económicos y Administrativos, Ingrid Álvarez Arzic; y la directora de la Dirección de Personas (ex Dirección de Recursos Humanos) Alejandra Pizarro Véliz, " +
                            "les explicaron los detalles del proceso, respondiendo también las dudas de los y las asistentes.",



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
