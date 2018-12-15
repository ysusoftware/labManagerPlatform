package org.software.ysu.service.achievements;

import org.software.ysu.dao.PhotographMapper;
import org.software.ysu.pojo.Photograph;
import org.software.ysu.pojo.PhotographExample;
import org.software.ysu.service.Interface.IPhotographService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service
public class PhotographServiceImpI implements IPhotographService {

    @Resource
    PhotographMapper photographMapper;
    @Override
    public int addPhoto(Photograph photograph) {
        return photographMapper.insert(photograph);

    }

    @Override
    public int modify(Photograph photograph) {
        return photographMapper.updateByPrimaryKey(photograph);
    }
}
