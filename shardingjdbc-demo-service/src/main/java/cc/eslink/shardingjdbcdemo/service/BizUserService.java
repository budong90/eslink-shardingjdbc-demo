package cc.eslink.shardingjdbcdemo.service;

import cc.eslink.shardingjdbcdemo.dao.BizUserDao;
import cc.eslink.shardingjdbcdemo.domain.entity.BizUser;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 *@ClassName BizUserService
 *@Description
 *@Author zeng.yakun (0178)
 *@Date 2019/12/30 15:55
 *@Version 1.0
 **/
@Service("bizUserService")
public class BizUserService {

    @Resource
    private BizUserDao bizUserDao;

    public void insert(BizUser bizUser) {
        bizUserDao.insert(bizUser);
    }
}
