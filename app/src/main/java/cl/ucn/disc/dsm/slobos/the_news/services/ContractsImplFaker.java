package cl.ucn.disc.dsm.slobos.the_news.services;

import android.os.Build;

import androidx.annotation.RequiresApi;

import com.github.javafaker.Faker;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

import cl.ucn.disc.dsm.slobos.the_news.model.News;
import cl.ucn.disc.dsm.slobos.the_news.services.Contracts;

/**
 * Contract Implementation of news With Faker
 */

public class ContractsImplFaker implements Contracts {
    private int size;

    /**
     * @return all the News in the backend.
     */

    final List<News> newsList = new ArrayList<>();
    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public List<News> retrieveNews() {
        
      final Faker faker = new Faker();
      for(int i = 0; i<size; i++){

          News news = new News(
                  faker.superhero().name(),
                  faker.artist().name(),
                  faker.artist().name(),
                  faker.internet().url(),
                  faker.internet().url(),
                  faker.backToTheFuture().quote(),
                  faker.starTrek().villain().length(),
                  ZonedDateTime.now(ZoneId.of("-4"))
          );
          newsList.add(news);

      }
      return newsList;
    }

    @Override
    public List<News> retrieveNews(int i) {


        return null;
    }

}
