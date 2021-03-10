package org.wdxl.im_bird_sys.entity;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class PlatformAndTextConfig {

    List<Integer> platform;

    @JSONField(name = "text_config")
    Map<String, ContentAndBtnText> textConfig;
}
