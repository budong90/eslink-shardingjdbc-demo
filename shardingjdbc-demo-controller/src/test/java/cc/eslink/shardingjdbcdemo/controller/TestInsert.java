package cc.eslink.shardingjdbcdemo.controller;

import cc.eslink.shardingjdbcdemo.domain.entity.BizUser;
import cc.eslink.shardingjdbcdemo.service.BizUserService;
import cc.eslink.utilv1.IDUtil;
import org.junit.Test;

import javax.annotation.Resource;

/**
 *@ClassName TestInsert
 *@Description 插入测试
 *@Author zeng.yakun (0178)
 *@Date 2019/12/30 15:06
 *@Version 1.0
 **/
public class TestInsert extends BaseTest {

    @Resource
    BizUserService bizUserService;

    @Test
    public void test() {
        BizUser bizUser = new BizUser();
        bizUser.setTenantId("1P01");
        bizUser.setUserId(IDUtil.getUniqueId());
        bizUser.setUserNo("000001");
        bizUser.setUserName("test1");
        bizUserService.insert(bizUser);
    }
}
