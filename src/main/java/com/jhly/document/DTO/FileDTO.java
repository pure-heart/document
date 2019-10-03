package com.jhly.document.DTO;

import com.jhly.document.model.File;
import lombok.Data;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Auther:JHLY
 * @Date:2019/10/2
 * @Description:com.jhly.document.DTO
 * @Version:1.0
 */
@Repository
@Data
public class FileDTO {
    private List<File> files;
    private Integer totalPage;
    private Integer pageIndex;
}
