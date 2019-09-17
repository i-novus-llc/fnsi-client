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

import java.text.SimpleDateFormat;
import java.util.Calendar;

import static org.junit.Assert.assertEquals;

@ContextConfiguration(locations = {"classpath:ru/inovus/util/fnsi/client/service/impl/fnsi-client-service-impl.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class FnsiClientImplTest {

    private static final String SERVICE_BASE_URL = "http://nsi.rosminzdrav.ru:80/port/rest/";

    private final String RESULT_OK = "OK";
    private final String IDENTIFIER = "1.2.643.5.1.13.13.99.2.114";
    private final int PAGE = 1;
    private final int SIZE = 200;
    private final int CONNECTION_TIME_OUT = 5000;
    private final int SOCKET_TIME_OUT = 5000;
    private final String VERSION = "2.165";
    private final String USER_KEY = "TAKE YOURS FROM FNSI PROFILE";

    @Autowired
    private FnsiClient fnsiClient;

    @Test
    public void findVersions() throws Exception {
        VersionsQueryDto query = new VersionsQueryDto();
        query.setIdentifier(IDENTIFIER);
        query.setPage(PAGE);
        query.setSize(SIZE);
        query.setUserKey(USER_KEY);

        SettingDto settings = new SettingDto();
        settings.setServiceUrl(SERVICE_BASE_URL + "versions");
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
        query.setUserKey(USER_KEY);
        SettingDto settings = new SettingDto();
        settings.setServiceUrl(SERVICE_BASE_URL + "passport");
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
        query.setUserKey(USER_KEY);

        SettingDto settings = new SettingDto();
        settings.setServiceUrl(SERVICE_BASE_URL + "data");
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
        query.setDate1(new SimpleDateFormat(CompareQueryDto.DATE_FORMAT_PATTERN).format(Calendar.getInstance().getTime()));
        query.setSize(SIZE);
        query.setUserKey(USER_KEY);

        SettingDto settings = new SettingDto();
        settings.setServiceUrl(SERVICE_BASE_URL + "data");
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
        query.setDate1(new SimpleDateFormat(CompareQueryDto.DATE_FORMAT_PATTERN).format(Calendar.getInstance().getTime()));
        query.setSize(SIZE);
        query.setUserKey(USER_KEY);

        SettingDto settings = new SettingDto();
        settings.setServiceUrl(SERVICE_BASE_URL + "data");
        settings.setConnectionTimeOut(CONNECTION_TIME_OUT);
        settings.setSocketTimeOut(SOCKET_TIME_OUT);

        CompareResponseDto data = fnsiClient.findCompares(query, settings);
    }

}