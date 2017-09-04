package ru.inovus.util.fnsi.client.service.api;

import ru.inovus.util.fnsi.client.service.api.dto.SettingDto;
import ru.inovus.util.fnsi.client.service.api.dto.exception.ValidationsException;
import ru.inovus.util.fnsi.client.service.api.dto.generated.passport.PassportResponseDto;
import ru.inovus.util.fnsi.client.service.api.dto.generated.versions.VersionsResponseDto;
import ru.inovus.util.fnsi.client.service.api.dto.query.DataQueryDto;
import ru.inovus.util.fnsi.client.service.api.dto.query.PassportQueryDto;
import ru.inovus.util.fnsi.client.service.api.dto.query.VersionsQueryDto;
import ru.inovus.util.fnsi.client.service.api.dto.generated.compare.CompareResponseDto;
import ru.inovus.util.fnsi.client.service.api.dto.generated.data.DataResponseDto;
import ru.inovus.util.fnsi.client.service.api.dto.query.CompareQueryDto;


/**
 * Клиент для ФНСИ https://nsi.rosminzdrav.ru/port/
 */
public interface FnsiClient {
    /**
     * Получение списка версий справочника.
     * Для актуальной версии возвращает дополнительно паспорт и структуру.
     *
     * @param query    Набор данных для формирования параметров запроса
     * @param settings Метаданные соединения
     * @return Список версий справочника
     * @throws ValidationsException Выбрасываются исключения, если аргументы
     * не были заполнены верно
     */
    VersionsResponseDto findVersions(VersionsQueryDto query, SettingDto settings) throws ValidationsException;

    /**
     * Получение паспорта и структуры справочника.
     * Функция получения структуры и паспорта справочника. Структура справочника описывает список полей, ключей, служебную информацию. В случае, если не задан номер версии, информация выводился для актуальной версии справочника.
     *
     * @param query    Набор данных для формирования параметров запроса
     * @param settings Метаданные соединения
     * @return Паспорт и структура справочника
     * @throws ValidationsException Выбрасываются исключения, если аргументы
     * не были заполнены верно
     */
    PassportResponseDto findPassport(PassportQueryDto query, SettingDto settings) throws ValidationsException;

    /**
     * Получение данных справочника.
     * Функция получения данных справочника. Обеспечивается работа с линейными и иерархическими справочниками. В случае, если не указана версия справочника, то возвращаются данные из актуальной версии.
     *
     * @param query    Набор данных для формирования параметров запроса
     * @param settings Метаданные соединения
     * @return Данные справочника
     * @throws ValidationsException Выбрасываются исключения, если аргументы
     * не были заполнены верно
     */
    DataResponseDto findData(DataQueryDto query, SettingDto settings) throws ValidationsException;

    /**
     * Сравнение двух версий справочника.
     *
     * @param query    Набор данных для формирования параметров запроса
     * @param settings Метаданные соединения
     * @return Разница между версиями справочника
     * @throws ValidationsException Выбрасываются исключения, если аргументы
     * не были заполнены верно
     */
    CompareResponseDto findCompares(CompareQueryDto query, SettingDto settings) throws ValidationsException;

}
