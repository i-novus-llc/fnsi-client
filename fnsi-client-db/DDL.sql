CREATE SCHEMA IF NOT EXISTS fnsiclientsm;

CREATE TABLE IF NOT EXISTS fnsiclientsm.config
(
  id           UUID PRIMARY KEY,
  code         VARCHAR(40) NOT NULL,
  config_name  TEXT,
  config_value TEXT
);
CREATE INDEX ix_setting__id
  ON fnsiclientsm.config (id);
CREATE UNIQUE INDEX ix_setting__code
  ON fnsiclientsm.config (code);
COMMENT ON COLUMN fnsiclientsm.config.code IS 'Код настройки';
COMMENT ON COLUMN fnsiclientsm.config.config_name IS 'Описание настройки';
COMMENT ON COLUMN fnsiclientsm.config.config_value IS 'Значение настройки';
COMMENT ON TABLE fnsiclientsm.config IS 'Настройки приложения';


INSERT INTO fnsiclientsm.config (id, code, config_name, config_value) VALUES ('b45a3803-26a4-432d-9033-a17d9e8fb221', 'сonnection.url.versions', 'URL сервиса для получения списка версий справочника', 'https://nsi.rosminzdrav.ru:443/port/rest/versions');
INSERT INTO fnsiclientsm.config (id, code, config_name, config_value) VALUES ('85e12753-c98e-44f3-b168-47e6d0dd4b65','сonnection.url.compare','URL сервиса для сравнения двух версий справочника','https://nsi.rosminzdrav.ru:443/port/rest/compare');
INSERT INTO fnsiclientsm.config (id, code, config_name, config_value) VALUES ('facc836e-e522-454a-9258-7f1410b63446','сonnection.url.data','URL сервиса для получения данных справочника','https://nsi.rosminzdrav.ru:443/port/rest/data');
INSERT INTO fnsiclientsm.config (id, code, config_name, config_value) VALUES ('9b27df2f-e417-4d08-8896-3a1c0f3cc16e','сonnection.url.passport','URL сервиса для получения паспорта и структуры справочника','https://nsi.rosminzdrav.ru:443/port/rest/passport');
INSERT INTO fnsiclientsm.config (id, code, config_name, config_value) VALUES ('d9c5cb0b-c303-46c9-b421-e85ebb3d79de','connection.general.timeout','Общее время ожидания соединения в миллисекундах',5000);
INSERT INTO fnsiclientsm.config (id, code, config_name, config_value) VALUES ('71055d7a-3b44-4046-9437-941934c61e62','connection.socket.timeout','Общее время ожидания ответа после соединения в миллисекундах',5000);