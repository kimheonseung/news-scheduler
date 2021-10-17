package com.devh.scheduler.news.constant;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * <pre>
 * Description :
 *     News Entity 메인 카테고리 상수
 * ===============================================
 * Member fields :
 *
 * ===============================================
 *
 * Author : HeonSeung Kim
 * Date   : 2021-05-05
 * </pre>
 */
@Getter
@AllArgsConstructor
public enum MainCategory {
    POLITICS("politics","politics", "정치"),
    ECONOMY("economy","economy", "경제"),
    INDUSTRY("industry","industry", "산업"),
    SOCIETY("society","society", "사회"),
    LOCAL("local","local", "전국"),
    INTERNATIONAL("international","international", "세계"),
    CULTURE("culture","culture", "문화"),
    LIFESTYLE("lifestyle","lifestyle", "라이프"),
    ENTERTAINMENT("entertainment","entertainment", "연예"),
    SPORTS("sports","sports", "스포츠");

    private final String camelCase;
    private final String url;
    private final String korean;

    @JsonValue
    public String getCamelCase() {
        return this.camelCase;
    }

    public static MainCategory getMainCategory(String camelCase) {
        MainCategory result = null;
        for(MainCategory mainCategory : MainCategory.values()) {
            if(camelCase.equals(mainCategory.getCamelCase()))
                result = mainCategory;
        }
        return result;
    }
}