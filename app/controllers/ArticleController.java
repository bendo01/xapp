package controllers;

import play.mvc.*;
import models.Article;
import play.data.Form;
import java.util.List;
import views.html.article.*;
import com.avaje.ebean.Model;
import scala.collection.JavaConverters;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class ArticleController extends Controller {

    public Result index () {
        List<Article> articles = new Model.Finder(String.class, Article.class).all();
        return ok(index.render(articles));
    }

    public Result create () {
        return ok(create.render("Tambah Artikel"));
    }

    public Result store () {
        Article article = Form.form(Article.class).bindFromRequest().get();
        article.save();
        return redirect(routes.ArticleController.index());
    }

    public Result show (String id) {
        return ok(create.render("Detail Artikel"));
    }

    public Result edit (String id) {
        return ok(create.render("Ubah Artikel"));
    }

    public Result update (String id) {
        return redirect(routes.ArticleController.show(id));
    }

    public Result destroy (String id) {
        return redirect(routes.ArticleController.index());
    }
}
