package com.hymanting.blog.resource;

import com.hymanting.blog.application.ArticleApplicationService;
import com.hymanting.blog.domain.article.Article;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * @Author hxchen
 * @Date 2021/6/20
 */
@Path("/articles")
@Component
//@CacheConfig(cacheNames = "resource.account")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ArticleResource {

    @Inject
    private ArticleApplicationService service;

    /**
     * 根据文章Id获取文章详情
     */
    @GET
    @Path("/{articleId}")
//    @Cacheable(key = "#articleid")
    public Article getArticle(@PathParam("articleId") Integer articleId) {
        Article article = service.findArticleByArticleId(articleId);
        return article;
    }

    public List<Article> getAuthorPublishedArticlePagedList(@QueryParam("authorId") String authorId) {
        return service.findPagedArticlesByAuthorId(authorId);
    }

    @GET
    @Path("/")
    public List<Article> getRecentPublishedArticlePagedList() {
        return service.getPagedArticles();
    }
}
