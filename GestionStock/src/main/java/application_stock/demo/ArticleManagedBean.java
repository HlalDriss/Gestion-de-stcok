package application_stock.demo;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import application_stock.dao.ArticleDao;
import application_stock.entities.Article;



@ViewScoped
@ManagedBean(name = "articleManagedBean")
public class ArticleManagedBean {

	private List<Article> listaArticles;
    private Article article;

    public ArticleManagedBean() {
        article = new Article();
    }

    public List<Article> getListaArticles() {
        ArticleDao ad = new ArticleDao();
        listaArticles = ad.listarArticles();
        return listaArticles;
    }

    public void setListaArticles(List<Article> listaArticles) {
        this.listaArticles = listaArticles;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    public void limpiarArticle() {
        article = new Article();
    }

    public void agregarArticle() {
        ArticleDao ad = new ArticleDao();
        ad.agregar(article);
    }

    public void modificarArticle() {
        ArticleDao ad = new ArticleDao();
        ad.modificar(article);;
        limpiarArticle();
    }

    public void eliminarArticle() {
        ArticleDao ad = new ArticleDao();
        ad.eliminar(article);
        limpiarArticle();
    }
}