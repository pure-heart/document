package com.jhly.document.controller;

import com.jhly.document.DTO.FileDTO;
import com.jhly.document.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Auther:JHLY
 * @Date:2019/10/2
 * @Description:com.jhly.document.controller
 * @Version:1.0
 */
@Controller
public class FileController {
    @Autowired
    private FileService fileService;

    @RequestMapping("/files")
    public String showFiles(@RequestParam(name = "pageIndex",defaultValue = "1") Integer pageIndex,
                            @RequestParam(name = "pageSize",defaultValue = "5") Integer pageSize,
                            Model model){
        FileDTO fileDTO = fileService.getAll(pageIndex,pageSize);
        model.addAttribute("fileDTO",fileDTO);
        System.out.println(fileDTO);
        return "index";
    }
}
