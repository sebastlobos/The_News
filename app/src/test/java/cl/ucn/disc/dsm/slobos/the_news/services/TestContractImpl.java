package cl.ucn.disc.dsm.slobos.the_news.services;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import cl.ucn.disc.dsm.slobos.the_news.model.News;
import cl.ucn.disc.dsm.slobos.the_news.services.Contracts;
import cl.ucn.disc.dsm.slobos.the_news.services.ContractsImplFaker;

/**
 * Test of the News Project
 * @author Sebastian Lobos
 */
public class TestContractImpl {

    @Test
    public void testConstructor() {

    }
    @Test
    public void testRetrevewNes(){
        final Contracts contracts = new ContractsImplFaker();
        Assertions.assertNotNull(contracts,"Contracts was null");

        final List<News> listNews = contracts.retrieveNews(10);
        Assertions.assertNotNull(listNews, "ListNews was null");
        Assertions.assertEquals(10, listNews.size(), "Wrong number of elements");
    }
}
