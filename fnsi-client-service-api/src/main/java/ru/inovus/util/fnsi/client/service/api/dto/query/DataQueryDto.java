package ru.inovus.util.fnsi.client.service.api.dto.query;

import org.hibernate.validator.constraints.NotBlank;

import java.util.List;

public class DataQueryDto extends PageableQueryDto {

    /**
     * Версия справочника. По умолчанию текущая
     */
    @NotBlank
    private String version;

    /**
     * Наименования столбцов, которые необходимо отобразить в результирующем наборе.
     * По умолчанию — все
     */
    private List<String> columns;

    /**
     * Наименование столбца, задающий порядок cортировки отображаемых данных
     */
    private String sorting;

    /**
     * Направление сортировки: ASC - по возрастанию, DESC — по убыванию
     */
    private SortingDirection sortingDirection;
    /**
     * Массив строк, задающий условия отбора данных, объединяемых по И.
     * Каждая строка представляет собой значения нижеприведенных полей через разделитель «|» FIELD – наименование поля справочника VALUE – значение поля TYPE – тип поиска.
     * TYPE может принимать следующие значения: EXACT — точное совпадение, LIKE — вхождение значения. По умолчанию EXACT
     */
    private List<String> filters;

    public String getVersion() {
        return version;
    }

    public void setVersion( String version ) {
        this.version = version;
    }

    public List<String> getColumns() {
        return columns;
    }

    public void setColumns( List<String> columns ) {
        this.columns = columns;
    }

    public String getSorting() {
        return sorting;
    }

    public void setSorting( String sorting ) {
        this.sorting = sorting;
    }

    public SortingDirection getSortingDirection() {
        return sortingDirection;
    }

    public void setSortingDirection( SortingDirection sortingDirection ) {
        this.sortingDirection = sortingDirection;
    }

    public List<String> getFilters() {
        return filters;
    }

    public void setFilters( List<String> filters ) {
        this.filters = filters;
    }
}
