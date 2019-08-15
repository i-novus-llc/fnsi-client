package ru.inovus.util.fnsi.client.service.api.dto.query;

import java.util.List;

public class DataQueryDto extends PageableQueryDto {

    private static final String QUERY_DTO_NAME = "data";

    /**
     * Версия справочника.
     * <p>
     * По умолчанию текущая.
     */
    private String version;

    /**
     * Наименования столбцов, которые необходимо отобразить в результирующем наборе.
     * <p>
     * По умолчанию — все.
     */
    private List<String> columns;

    /**
     * Наименование столбца, задающий порядок cортировки отображаемых данных.
     */
    private String sorting;

    /**
     * Направление сортировки:<br />
     * ASC - по возрастанию,<br />
     * DESC — по убыванию.
     */
    private SortingDirection sortingDirection;

    /**
     * Массив строк, задающий условия отбора данных, объединяемых по "И".
     * <p>
     * Каждая строка представляет собой значения нижеприведённых полей через разделитель «|»:<br />
     * FIELD – наименование поля справочника,<br />
     * VALUE – значение поля,<br />
     * TYPE – тип поиска.
     * <p>
     * TYPE может принимать следующие значения:<br />
     * EXACT — точное совпадение,<br />
     * LIKE — вхождение значения.<br />
     * По умолчанию EXACT.
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

    /**
     * {@inheritDoc}
     */
    @Override
    public String getQueryDtoName() {
        return QUERY_DTO_NAME;
    }
}
