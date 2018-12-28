package org.software.ysu.controller;

import org.software.ysu.pojo.Assort;
import org.software.ysu.service.Interface.IAssortService;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("assort")
public class assortController {
    @Resource
    IAssortService assortService;

    @RequestMapping(value="getAssorts.do",method = RequestMethod.GET)
    public List<Assort>  getAssorts(){
        List<Assort> list1s=assortService.getAssort1s();
        for(Assort assort : list1s){
            List<Assort> list2s=assortService.getAssort2s(assort.getId());
            assort.setAssortList(list2s);
        }
        return list1s;
    }
    @RequestMapping(value="getAssort1s.do",method = RequestMethod.GET)
    public List<Assort>  getAssort1s(){
        List<Assort> lists=assortService.getAssort1s();
        return lists;
    }
    @RequestMapping(value="getAssort2s.do",method = RequestMethod.GET)
    public List<Assort>  getAssort2s(){
        return null;
    }

    @RequestMapping(value="getAssortList.do",method = RequestMethod.GET)
    public List<Assort> getAssortList(){
        return assortService.getAssortList();
    }

    @RequestMapping(value="addAssort.do",method = RequestMethod.POST)
    public int addAssort(Assort assort){
        return assortService.addAssort(assort);
    }
    @RequestMapping(value="editAssort.do",method=RequestMethod.POST)
    public int editAssort(Assort assort){
        System.out.println(assort);
        return assortService.editAssort(assort);
    }
}
