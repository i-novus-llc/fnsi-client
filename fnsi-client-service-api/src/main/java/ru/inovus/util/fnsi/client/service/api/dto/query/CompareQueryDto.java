package ru.inovus.util.fnsi.client.service.api.dto.query;

import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Pattern;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

public class CompareQueryDto extends PageableQueryDto implements FieldValueBuilder {
    private final String pattern = "yyyy-MM-dd";
    @NotBlank
    @Pattern(regexp = "\\d{4}-\\d{2}-\\d{2}", message = "date1 must be in format yyyy-MM-dd")
    private String date1;
    @Pattern(regexp = "\\d{4}-\\d{2}-\\d{2}", message = "date2 date must be in format yyyy-MM-dd")
    private String date2;

    public String getDate1() {
        return date1;
    }

    public void setDate1(Date date1) {
        this.date1 = new SimpleDateFormat(pattern).format(date1);
    }

    public void setDate1(String date1) {
        this.date1 = date1;
    }

    public void setDate2(Date date2) {
        this.date2 = new SimpleDateFormat(pattern).format(date2);
    }

    public String getDate2() {
        return date2;
    }

    public void setDate2(String date2) {
        this.date2 = date2;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Map<String, String> buildFieldValueMap() {

        Map<String, String> built = super.buildFieldValueMap();
        if (date1 != null) {
            built.put("date1", date1);
        }
        if (date2 != null) {
            built.put("date2", date2);

        }
        return built;
    }

}
