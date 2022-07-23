package pl.mz.winery_service.model;

import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * Created by mz on 23.07.22
 */
public class WinePagedList extends PageImpl<WineDto> {

    public WinePagedList(List<WineDto> content, Pageable pageable, long total) {
        super(content, pageable, total);
    }

    public WinePagedList(List<WineDto> content) {
        super(content);
    }
}
