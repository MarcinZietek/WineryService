package pl.mz.winery_service.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

/**
 * Created by mz on 23.07.22
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class WineDto {

    private UUID id;
    private Integer version;

    private OffsetDateTime createdDate;
    private OffsetDateTime lastModifiedDate;

    private String wineName;
    private WineStyleEnum wineType;

    private BigDecimal price;
    private Integer quantity;
}
