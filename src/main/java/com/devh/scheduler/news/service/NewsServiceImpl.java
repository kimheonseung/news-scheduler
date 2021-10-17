package com.devh.scheduler.news.service;

import com.devh.scheduler.news.entity.News;
import com.devh.scheduler.news.util.ElasticsearchCreator;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.elasticsearch.action.bulk.BulkRequest;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
@RequiredArgsConstructor
@Log4j2
public class NewsServiceImpl implements NewsService {

    /* DI */
    private final RestHighLevelClient restHighLevelClient;

    @Override
    public boolean indexAll(List<News> newsList) {
        boolean result = false;

        /* 다량 색인을 위해 RestHighLevelClient 사용 */
        BulkRequest bulkRequest = new BulkRequest();

        newsList.forEach(news -> {
            IndexRequest indexRequest = new IndexRequest(ElasticsearchCreator.createNewsIndexName(news));
            indexRequest.id(news.getArticleId()).source(entityToMap(news));
            bulkRequest.add(indexRequest);
        });

        try {
            restHighLevelClient.bulk(bulkRequest, RequestOptions.DEFAULT);
            result = true;
        } catch (IOException e) {log.error(e.getMessage());}

        if(result)
            log.info("bulk success. doc count = " + newsList.size());
        return result;
    }

}
