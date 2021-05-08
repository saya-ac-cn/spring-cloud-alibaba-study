package ac.cn.saya.sentinel.service.handle;

import ac.cn.saya.alibaba.cloud.api.entity.Result;
import com.alibaba.csp.sentinel.slots.block.BlockException;

/**
 * @Title: CustomerBlockHandler
 * @ProjectName spring-cloud-alibaba-study
 * @Description: TODO
 * @Author liunengkai
 * @Date: 4/30/21 20:40
 * @Description:
 */

public class CustomerBlockHandler {

    public static Result handleException(BlockException exception){
        return new Result(500,"自定义的限流处理信息......CustomerBlockHandler");
    }

}
