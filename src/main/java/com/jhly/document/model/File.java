package com.jhly.document.model;

import lombok.Data;
import org.springframework.stereotype.Repository;

import java.util.Date;

/**
 * @Auther:JHLY
 * @Date:2019/10/2
 * @Description:com.jhly.document.model
 * @Version:1.0
 */
@Data
@Repository
public class File {
    private Integer fId;
    private String fName;
    private String fPath;
    private Integer creator;
    private Date createDate;
    private Integer modifier;
    private Date modifiedDate;
}
