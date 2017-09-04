package ru.inovus.util.fnsi.client.service.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import ru.inovus.util.fnsi.client.service.api.FnsiClient;
import ru.inovus.util.fnsi.client.service.api.dto.SettingDto;
import ru.inovus.util.fnsi.client.service.api.dto.exception.ValidationsException;
import ru.inovus.util.fnsi.client.service.api.dto.generated.compare.CompareResponseDto;
import ru.inovus.util.fnsi.client.service.api.dto.generated.data.DataResponseDto;
import ru.inovus.util.fnsi.client.service.api.dto.generated.passport.PassportResponseDto;
import ru.inovus.util.fnsi.client.service.api.dto.generated.versions.VersionsResponseDto;
import ru.inovus.util.fnsi.client.service.api.dto.query.CompareQueryDto;
import ru.inovus.util.fnsi.client.service.api.dto.query.DataQueryDto;
import ru.inovus.util.fnsi.client.service.api.dto.query.PassportQueryDto;
import ru.inovus.util.fnsi.client.service.api.dto.query.VersionsQueryDto;

import java.util.Calendar;

import static org.junit.Assert.*;

@ContextConfiguration(locations = {"classpath:ru/inovus/util/fnsi/client/service/impl/fnsi-client-service-impl.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class FnsiClientImplTest {

    private final String RESULT_OK = "OK";
    private final String IDENTIFIER = "1.2.643.5.1.13.13.11.1080";
    private final int PAGE = 1;
    private final int SIZE = Integer.MAX_VALUE;
    private final int CONNECTION_TIME_OUT = 5000;
    private final int SOCKET_TIME_OUT = 5000;
    private final String VERSION = "1.0";

    @Autowired
    private FnsiClient fnsiClient;

    @Test
    public void findVersions() throws Exception {
        VersionsQueryDto query = new VersionsQueryDto();
        query.setIdentifier(IDENTIFIER);
        query.setPage(PAGE);
        query.setSize(SIZE);

        SettingDto settings = new SettingDto();
        settings.setServiceUrl("https://nsi.rosminzdrav.ru:443/port/rest/versions");
        settings.setConnectionTimeOut(CONNECTION_TIME_OUT);
        settings.setSocketTimeOut(SOCKET_TIME_OUT);

        VersionsResponseDto versions = fnsiClient.findVersions(query, settings);
        assertEquals(RESULT_OK, versions.getResult());
    }

    @Test
    public void findPassport() throws Exception {
        PassportQueryDto query = new PassportQueryDto();
        query.setIdentifier(IDENTIFIER);
        query.setVersion(VERSION);
        SettingDto settings = new SettingDto();
        settings.setServiceUrl("https://nsi.rosminzdrav.ru:443/port/rest/passport");
        settings.setConnectionTimeOut(CONNECTION_TIME_OUT);
        settings.setSocketTimeOut(SOCKET_TIME_OUT);

        PassportResponseDto passport = fnsiClient.findPassport(query, settings);
        assertEquals(RESULT_OK, passport.getResult());
    }

    @Test
    public void findData() throws Exception {
        DataQueryDto query = new DataQueryDto();
        query.setIdentifier(IDENTIFIER);
        query.setVersion(VERSION);
        query.setPage(PAGE);
        query.setSize(SIZE);

        SettingDto settings = new SettingDto();
        settings.setServiceUrl("https://nsi.rosminzdrav.ru:443/port/rest/data");
        settings.setConnectionTimeOut(CONNECTION_TIME_OUT);
        settings.setSocketTimeOut(SOCKET_TIME_OUT);

        DataResponseDto data = fnsiClient.findData(query, settings);
        assertEquals(RESULT_OK, data.getResult());
    }

    @Test
    public void findCompares() throws Exception {
        CompareQueryDto query = new CompareQueryDto();
        query.setIdentifier(IDENTIFIER);
        query.setPage(PAGE);
        query.setDate1(Calendar.getInstance().getTime());
        query.setSize(SIZE);

        SettingDto settings = new SettingDto();
        settings.setServiceUrl("https://nsi.rosminzdrav.ru:443/port/rest/data");
        settings.setConnectionTimeOut(CONNECTION_TIME_OUT);
        settings.setSocketTimeOut(SOCKET_TIME_OUT);

        CompareResponseDto data = fnsiClient.findCompares(query, settings);
        assertEquals(RESULT_OK, data.getResult());
    }

    @Test(expected = ValidationsException.class)
    public void findComparesNegative() throws Exception {
        CompareQueryDto query = new CompareQueryDto();
//        query.setIdentifier(IDENTIFIER);
        query.setPage(PAGE);
        query.setDate1(Calendar.getInstance().getTime());
        query.setSize(SIZE);

        SettingDto settings = new SettingDto();
        settings.setServiceUrl("https://nsi.rosminzdrav.ru:443/port/rest/data");
        settings.setConnectionTimeOut(CONNECTION_TIME_OUT);
        settings.setSocketTimeOut(SOCKET_TIME_OUT);

        CompareResponseDto data = fnsiClient.findCompares(query, settings);
    }

}