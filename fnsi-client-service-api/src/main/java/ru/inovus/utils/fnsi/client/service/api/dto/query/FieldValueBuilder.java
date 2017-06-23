package ru.inovus.utils.fnsi.client.service.api.dto.query;

import java.util.Map;

/**
 * Построение ассоциативного массива
 */
public interface FieldValueBuilder {
    /**
     * Построение ассоциативного массива для последующего формирования параметров запроса
     * @return Параметры запроса в виде {@link Map}
     */
    Map<String, String> buildFieldValueMap();
}
