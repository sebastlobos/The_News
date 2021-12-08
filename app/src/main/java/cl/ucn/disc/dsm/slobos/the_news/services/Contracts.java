package cl.ucn.disc.dsm.slobos.the_news.services;

import java.util.List;

import cl.ucn.disc.dsm.slobos.the_news.model.News;

/**
 * The contracts of the News Project
 * @author Sebastian Lobos
 */


public interface Contracts {
    /**
     *
     * @return all the News in the backend.
     */



List<News> retrieveNews();


    List<News> retrieveNews(int i);
}
