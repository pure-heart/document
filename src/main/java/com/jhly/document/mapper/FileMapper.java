package com.jhly.document.mapper;

import com.jhly.document.model.File;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Auther:JHLY
 * @Date:2019/10/2
 * @Description:com.jhly.document.mapper
 * @Version:1.0
 */
@Mapper
public interface FileMapper {
    @Select("select count(1) from file")
    int getCount();

    @Select("select * from file limit #{index},#{pageSize}")
    List<File> getFile(@Param("index") int index,@Param("pageSize") int pageSize);
}
