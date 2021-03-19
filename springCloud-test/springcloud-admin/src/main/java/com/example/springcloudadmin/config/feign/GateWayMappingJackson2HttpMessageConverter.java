package com.example.springcloudadmin.config.feign;

import org.springframework.http.MediaType;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: levy
 * @Date: 2021/3/17 16:29
 */
public class GateWayMappingJackson2HttpMessageConverter extends MappingJackson2HttpMessageConverter {
    public GateWayMappingJackson2HttpMessageConverter() {
        List<MediaType> mediaTypes = new ArrayList<>();
        mediaTypes.add(MediaType.valueOf(MediaType.TEXT_HTML_VALUE + ";charset=UTF-8"));
        setSupportedMediaTypes(mediaTypes);
    }
}
