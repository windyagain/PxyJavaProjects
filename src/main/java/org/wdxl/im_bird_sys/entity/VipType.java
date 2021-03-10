package org.wdxl.im_bird_sys.entity;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class VipType {

    @JSONField(name = "not_vip")
    private PlatformAndTextConfig notVip;

    @JSONField(name = "expired_vip")
    private PlatformAndTextConfig expiredVip;
}
