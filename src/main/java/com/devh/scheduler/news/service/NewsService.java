package com.devh.scheduler.news.service;

import com.devh.scheduler.news.constant.NewsField;
import com.devh.scheduler.news.entity.News;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface NewsService {
    boolean indexAll(List<News> newsList);

    /* 검색엔진 벌크 색인을 위해 각 엔티티를 맵으로 변환하기 위한 메소드 */
    default Map<String, Object> entityToMap(News news) {
        Map<String, Object> map = new HashMap<>();
        map.put(NewsField.ARTICLE_ID.getField(), news.getArticleId());
        map.put(NewsField.PRESS.getField(), news.getPress().getLowercase());
        map.put(NewsField.MAIN_CATEGORY.getField(), news.getMainCategory().getCamelCase());
        map.put(NewsField.SUB_CATEGORY.getField(), news.getSubCategory().getCamelCase());
        map.put(NewsField.ORIGINAL_LINK.getField(), news.getOriginalLink());
        map.put(NewsField.PUB_MILLIS.getField(), news.getPubMillis());
        map.put(NewsField.TITLE.getField(), news.getTitle());
        map.put(NewsField.SUMMARY.getField(), news.getSummary());
        return map;
    }
}
