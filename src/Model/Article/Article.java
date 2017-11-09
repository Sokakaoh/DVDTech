package Model.Article;

/**
 * Created by msif on 19/10/17.
 */
public abstract class Article {
    private float prixArticle;
    private boolean reserved;

   public Article(){

   }

    public float getPrix()
    {
        return prixArticle;
    }
    public abstract String getNomFilm();
}
