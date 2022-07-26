package pl.mz.winery_service.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.Positive;
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

    @Null
    private UUID id;
    @Null
    private Integer version;

    @Null
    private OffsetDateTime createdDate;
    @Null
    private OffsetDateTime lastModifiedDate;

    @NotBlank
    private String wineName;
    @NotNull
    private WineStyleEnum wineType;

    @Positive
    @NotNull
    private BigDecimal price;
    private Integer quantity;
}
