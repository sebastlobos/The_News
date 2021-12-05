package cl.ucn.disc.dsm.slobos.the_news;

import net.openhft.hashing.LongHashFunction;

import java.time.ZonedDateTime;

import lombok.Getter;

/**
 * The news class.
 *
 *
 * @author Sebastian Lobos.
 */


    public final class News{

    /**
     * UD unique.
     */
    @Getter
    private Long id;


    /**
     * The Tittle
     */
    @Getter
        private String title;


    /**
     * Source.
     */
    @Getter
        private String Source;

    /**
     * The Source.
     */

    /**
     * The Author.
     */
    @Getter
    private String Author;

    /**
     * The Url.
     */
    @Getter
    private String Url;

    /**
     * The Url Image.
     */
    @Getter
    private String UrlImage;

    /**
     * The Description.
     */
    @Getter
    private String description;

    /**
     * The Content.
     *
     */
    @Getter
    private String content;

    /**
     * The date of publish
     *
     */
    @Getter
    private ZonedDateTime publishedAt;

    /**
     *  @param title can't be null
     * @param source can't be null
     * @param author can't be null
     * @param url    can be null
     * @param urlImage  can be null
     * @param description can be null
     * @param content  can't be null
     * @param publishedAt can't be null
     * @param longHashFunction
     */
    public News(final String title, final String source, final String author,
                final String url, final String urlImage,
                final String description, final String content, final ZonedDateTime publishedAt, LongHashFunction longHashFunction) {
        //title
        if ( title == null  || title.length() < 2){
            throw new IllegalArgumentException("Title required");
        }
        this.title = title;

        //Source
        if ( source == null || source.length() < 2){
            throw new IllegalArgumentException("Source required");
        }
        this.Source = source;

        //Author
        if ( Author == null || Author.length() < 2){
            throw new IllegalArgumentException("Author required");
        }
        this.Author = author;

        // ID: Hashing(Title + |source+|author)
        this.id=longHashFunction.xx().hashChars(title+ "|"+ source + "|"+ author);
        Url = url;

        UrlImage = urlImage;

        //Description
        if ( description == null || description.length() < 4){
            throw new IllegalArgumentException("Description required");
        }
        this.description = description;

        //Content
        if ( content == null || content.length() < 2){
            throw new IllegalArgumentException("content required");
        }
        this.content = content;

        if ( publishedAt == null ){
            throw new IllegalArgumentException("PublishedAt required");
        }
        this.publishedAt = publishedAt;

    }
}



