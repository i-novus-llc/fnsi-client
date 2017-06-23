package ru.inovus.utils.fnsi.client.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.inovus.utils.fnsi.client.service.api.FnsiClient;
import ru.inovus.utils.fnsi.client.service.api.dto.SettingDto;
import ru.inovus.utils.fnsi.client.service.api.dto.exception.ValidationsException;
import ru.inovus.utils.fnsi.client.service.api.dto.generated.compare.CompareResponseDto;
import ru.inovus.utils.fnsi.client.service.api.dto.generated.data.DataResponseDto;
import ru.inovus.utils.fnsi.client.service.api.dto.generated.passport.PassportResponseDto;
import ru.inovus.utils.fnsi.client.service.api.dto.generated.versions.VersionsResponseDto;
import ru.inovus.utils.fnsi.client.service.api.dto.query.CompareQueryDto;
import ru.inovus.utils.fnsi.client.service.api.dto.query.DataQueryDto;
import ru.inovus.utils.fnsi.client.service.api.dto.query.PassportQueryDto;
import ru.inovus.utils.fnsi.client.service.api.dto.query.VersionsQueryDto;

import java.io.IOException;

@Service
public class FnsiClientImpl implements FnsiClient {
    private static final Logger logger = LoggerFactory.getLogger(FnsiClientImpl.class);

    @Autowired
    private RestClient<VersionsQueryDto> versionsClient;
    @Autowired
    private RestClient<CompareQueryDto> compareClient;
    @Autowired
    private RestClient<DataQueryDto> dataClient;
    @Autowired
    private RestClient<PassportQueryDto> passportClient;

    @Autowired
    private CustomValidator<VersionsQueryDto> versionsValidator;
    @Autowired
    private CustomValidator<CompareQueryDto> compareValidator;
    @Autowired
    private CustomValidator<DataQueryDto> dataValidator;
    @Autowired
    private CustomValidator<PassportQueryDto> passportValidator;

    @Override
    public VersionsResponseDto findVersions(VersionsQueryDto query, SettingDto settings) throws ValidationsException {
        versionsValidator.doValidation(query, settings);
        String stringResponse = versionsClient.receiveResponse(query, settings);
        ObjectMapper mapper = new ObjectMapper();
        VersionsResponseDto versionsResponseDto = null;
        try {
            versionsResponseDto = mapper.readValue(stringResponse, VersionsResponseDto.class);
        } catch (IOException e) {
            logParseResponseException(settings.getServiceUrl(), stringResponse);
        }
        return versionsResponseDto;
    }

    @Override
    public PassportResponseDto findPassport(PassportQueryDto query, SettingDto settings) throws ValidationsException {
        passportValidator.doValidation(query, settings);

        String stringResponse = passportClient.receiveResponse(query, settings);
        ObjectMapper mapper = new ObjectMapper();
        PassportResponseDto passportResponseDto = null;
        try {
            passportResponseDto = mapper.readValue(stringResponse, PassportResponseDto.class);
        } catch (IOException e) {
            logParseResponseException(settings.getServiceUrl(), stringResponse);
        }
        return passportResponseDto;
    }

    @Override
    public DataResponseDto findData(DataQueryDto query, SettingDto settings) throws ValidationsException {
        dataValidator.doValidation(query, settings);

        String stringResponse = dataClient.receiveResponse(query, settings);
        ObjectMapper mapper = new ObjectMapper();
        DataResponseDto dataResponseDto = null;
        try {
            dataResponseDto = mapper.readValue(stringResponse, DataResponseDto.class);
        } catch (IOException e) {
            logParseResponseException(settings.getServiceUrl(), stringResponse);
        }
        return dataResponseDto;
    }

    @Override
    public CompareResponseDto findCompares(CompareQueryDto query, SettingDto settings) throws ValidationsException {
        compareValidator.doValidation(query, settings);

        String stringResponse = compareClient.receiveResponse(query, settings);
        ObjectMapper mapper = new ObjectMapper();
        CompareResponseDto compareResponseDto = null;
        try {
            compareResponseDto = mapper.readValue(stringResponse, CompareResponseDto.class);
        } catch (IOException e) {
            logParseResponseException(settings.getServiceUrl(), stringResponse);
        }
        return compareResponseDto;
    }


    private void logParseResponseException(String serviceUrl, String stringResponse) {
        logger.error("Could not parse response " + stringResponse + "from " + serviceUrl);
    }
}
