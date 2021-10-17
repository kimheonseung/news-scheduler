package com.devh.scheduler.news.constant;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * <pre>
 * Description
 *     News Entity 언론사 상수
 * ===============================================
 * Parameters
 *
 * Returns
 *
 * Throws
 *
 * ===============================================
 *
 * Author : HeonSeung Kim
 * Date   : 2021-05-05
 * </pre>
 */
@AllArgsConstructor
public enum Press {
    YONHAP("yonhap");
    private final String lowercase;

    @JsonValue
    public String getLowercase() {
        return this.lowercase;
    }

    public static Press getPress(String lowercase) {
        Press result = null;
        Press[] values = Press.values();

        for(Press press : values) {
            if(press.getLowercase().equals(lowercase))
                result = press;
        }
        return result;
    }
}