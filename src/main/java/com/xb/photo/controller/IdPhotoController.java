package com.xb.photo.controller;

import com.xb.photo.api.ApiResult;
import com.xb.photo.biz.IdPhotoBiz;
import com.xb.photo.dto.IdPhotoDto;
import com.xb.photo.param.IdPhotoParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 证件照
 *
 * @author 莫问
 * @date 2020/9/18
 */
@RestController
@RequestMapping(value = "/id/photo")
public class IdPhotoController {

    /**
     * 业务层: 证件照
     */
    @Resource
    private IdPhotoBiz idPhotoBiz;

    /**
     * 上传制作证件照
     */
    @PostMapping(value = "/upload/make")
    public ApiResult<IdPhotoDto> uploadMake(IdPhotoParam idPhotoParam) {
        return ApiResult.success(idPhotoBiz.uploadMake(idPhotoParam));
    }

    /**
     * 证件照改变背景
     */
    @PostMapping(value = "/change/background")
    public ApiResult<IdPhotoDto> changeBackground(IdPhotoParam idPhotoParam) {
        return ApiResult.success(idPhotoBiz.changeBackground(idPhotoParam));
    }
}
