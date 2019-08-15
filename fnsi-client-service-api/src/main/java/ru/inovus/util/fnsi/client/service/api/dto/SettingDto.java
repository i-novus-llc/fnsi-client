package ru.inovus.util.fnsi.client.service.api.dto;

import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

/**
 * Класс для хранения настроек
 */
public class SettingDto {

    /**
     * Адрес удалённого сервиса.
     */
    @NotBlank
    @Pattern(regexp = "^(https?):\\/\\/[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*", message = "serviceUrl must be in URI format ")
    private String serviceUrl;

    /**
     * Максимальное время ожидания установки
     * первоначального соединения с удалённым сервиcом.
     */
    @Min(value = 1L, message = "connectionTimeOut number must be greater than zero")
    private long connectionTimeOut;

    /**
     * Максимальное время ожидания очередного пакета данных
     * из удалённого сервиса после установления первоначального соединения.
     */
    @Min(value = 1L, message = "socketTimeOut number must be greater than zero")
    private long socketTimeOut;

    public String getServiceUrl() {
        return serviceUrl;
    }

    public void setServiceUrl(String serviceUrl) {
        this.serviceUrl = serviceUrl;
    }

    public long getConnectionTimeOut() {
        return connectionTimeOut;
    }

    public void setConnectionTimeOut(long connectionTimeOut) {
        this.connectionTimeOut = connectionTimeOut;
    }

    public long getSocketTimeOut() {
        return socketTimeOut;
    }

    public void setSocketTimeOut(long socketTimeOut) {
        this.socketTimeOut = socketTimeOut;
    }
}
