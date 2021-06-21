package com.hymanting.blog.application;

import com.hymanting.blog.domain.article.Article;
import com.hymanting.blog.domain.article.ArticleRepository;

import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;
import java.util.List;

/**
 * @Author hxchen
 * @Date 2021/6/20
 */
@Named
@Transactional
public class ArticleApplicationService {

    @Inject
    private ArticleRepository repository;

    public Article findArticleByArticleId(Integer articleId) {
        return repository.findById(articleId).orElse(null);
    }

    public List<Article> findPagedArticlesByAuthorId(String authorId) {
        return null;
    }

    public List<Article> getPagedArticles() {
        List<Article> articles = repository.findAll();
        return articles;
    }
}
