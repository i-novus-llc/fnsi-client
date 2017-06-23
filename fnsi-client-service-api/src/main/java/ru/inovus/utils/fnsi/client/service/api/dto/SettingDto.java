package ru.inovus.utils.fnsi.client.service.api.dto;

import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

/**
 * Класс для хранения настроек
 */
public class SettingDto {

    /**
     * Адрес удаленного сервиса
     */
    @NotBlank
    @Pattern(regexp = "^(https?):\\/\\/[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*", message = "date1 must be in URI format ")
    private String serviceUrl;

    /**
     * Максимальное время ожидания установки
     * первоначального соединения с удаленным сервсиом
     */
    @Min(value = 1L, message = "connectionTimeOut number must be greater than zero")
    private long connectionTimeOut;

    /**
     * Максимальное время ожидания очередного пакета данных
     * из удаленного сервиса после установления первоначального соединения
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
