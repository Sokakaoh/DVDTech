package Model.Article;

import java.util.ArrayList;

/**
 * Created by msif on 09/11/17.
 */
public class ListArticles {
    ArrayList<Article> listArticle = new ArrayList<Article>();


    public ListArticles()
    {

    }

    public ListArticles(ArrayList<Article> a)
    {
        this.listArticle = a;
    }

    public void addArticle(Article article)
    {
        listArticle.add(article);
    }

    public ArrayList<Film> getListFilm()
    {

        ArrayList<Film> listFilms = new ArrayList<Film>();
        for(Article article: listArticle)
        {
            if(article instanceof Film)
            {
                listFilms.add((Film) article);
            }
        }

        return listFilms;
    }
}
