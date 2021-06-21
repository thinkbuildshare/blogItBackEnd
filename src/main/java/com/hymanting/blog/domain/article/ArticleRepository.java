package com.hymanting.blog.domain.article;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Repository;

import javax.inject.Inject;
import javax.persistence.EntityManager;

/**
 * @Author hxchen
 * @Date 2021/6/21
 */
@Repository
public class ArticleRepository extends SimpleJpaRepository<Article, Integer> {

    @Inject
    public ArticleRepository(EntityManager entityManager) {
        super(Article.class, entityManager);
    }
}
