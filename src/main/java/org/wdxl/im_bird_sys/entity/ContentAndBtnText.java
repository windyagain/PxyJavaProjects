package org.wdxl.im_bird_sys.entity;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class ContentAndBtnText {

    private String content;
    @JSONField(
            name = "button_text"
    )
    private String buttonText;
}
