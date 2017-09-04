# fnsi-client
#### Клиент Федеральной НСИ МЗ РФ: https://nsi.rosminzdrav.ru/port/
# Описание
* Подключается как библиотека ```.jar``` после упаковывания 
* На вход требуется указать параметры запроса ```ru.inovus.util.fnsi.client.service.api.dto.query.*``` и настройки соединения ```ru.inovus.util.fnsi.client.service.api.dto.SettingDto```
* Скрипты для создания в базе данных настроек приложения хранятся в  ```fnsi-client-db```
* Генерация ```Data Transfer Object``` для API клиента происходит из примеров JSON-данных с помощью Gradle-плагина [```jsonSchema2Pojo```](https://github.com/joelittlejohn/jsonschema2pojo/tree/master/jsonschema2pojo-gradle-plugin): ```gradle :fnsi-client-service-api:generateJsonSchema2Pojo``` . Примеры JSON-данных доступны на https://nsi.rosminzdrav.ru/port/
* API клиента находится в ```fnsi-client-service-api```
* Реализация клиента находится в ```fnsi-client-service-impl```