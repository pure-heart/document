package com.jhly.document.service;

import com.jhly.document.DTO.FileDTO;
import com.jhly.document.mapper.FileMapper;
import com.jhly.document.mapper.UserMapper;
import com.jhly.document.model.File;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther:JHLY
 * @Date:2019/10/2
 * @Description:com.jhly.document.service
 * @Version:1.0
 */
@Service
public class FileService {

    @Autowired
    private FileMapper fileMapper;

    @Autowired
    private FileDTO fileDTO;

    public FileDTO getAll(Integer pageIndex, Integer pageSize) {
        //取得总条数
        int totalCount = fileMapper.getCount();
        //计算总页数
        int totalPage = totalCount % pageSize == 0 ? totalCount / pageSize : totalCount / pageSize + 1;
        //取得当前页第一条条数
        int index = pageSize * (pageIndex - 1);
        //取得当前页内容
        List<File> files = fileMapper.getFile(index, pageSize);
        //限制页数范围
        if (pageIndex <= 1) {
            pageIndex = 1;
        }
        if ((pageIndex >= totalPage)) {
            pageIndex = totalPage;
        }
        fileDTO.setFiles(files);
        fileDTO.setPageIndex(pageIndex);
        fileDTO.setTotalPage(totalPage);
        return fileDTO;
    }
}
