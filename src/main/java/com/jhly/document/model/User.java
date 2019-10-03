package com.jhly.document.model;

import lombok.Data;
import org.springframework.stereotype.Repository;

/**
 * @Auther:JHLY
 * @Date:2019/10/2
 * @Description:com.jhly.document.model
 * @Version:1.0
 */
@Data
@Repository
public class User {
    private Integer uId;
    private Integer accountId;
    private String uName;
    private String uPassword;
    private String token;
    private String bio;
    private String avatarUrl;
}
