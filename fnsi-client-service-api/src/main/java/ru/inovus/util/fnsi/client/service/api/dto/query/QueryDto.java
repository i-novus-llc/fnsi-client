package ru.inovus.util.fnsi.client.service.api.dto.query;

import java.util.Map;

/**
 * Параметры запроса в ФНСИ.
 *
 */
public interface QueryDto {

    /**
     * Получение имени запроса для формирования вызова.
     *
     * @return Имя запроса
     */
    String getQueryDtoName();

    /**
     * Построение ассоциативного массива для последующего формирования параметров запроса.
     *
     * @return Параметры запроса в виде {@link Map}
     */
    Map<String, String> buildParameterMap();
}
