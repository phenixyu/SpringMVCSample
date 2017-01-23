package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by asus on 2017/1/15.
 */
@Controller
@RequestMapping(value = "/index")
public class MainControllerClass {
    @RequestMapping(value ={"/*","/hello","/world"}, method = RequestMethod.GET)
    public String  index() {
        return "index";

//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.addObject("message", "Hello World!");
//        modelAndView.setViewName("index");
//        return modelAndView;
    }
    ///detail/123
    @RequestMapping(value="/{id}", method = {RequestMethod.GET})
    public ModelAndView getDetail(@PathVariable(value="id") Integer id){

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("id", id);
        modelAndView.setViewName("detail");
        return modelAndView;
    }

    @RequestMapping(value="/book", method = {RequestMethod.GET})
    public ModelAndView getBook(){

        ModelAndView mav = new ModelAndView();
        mav.setViewName("book"); //返回的文件名

        mav.addObject("message","hello kitty");

        //List
        List<String> list = new ArrayList<String>();
        list.add("java");
        list.add("c++");
        list.add("oracle");
        mav.addObject("bookList", list);

        //Map
        Map<String,String> map = new HashMap<String,String>();
        map.put("zhangsan", "北京");
        map.put("lisi", "上海");
        map.put("wangwu", "深圳");
        mav.addObject("map",map);

        return mav;
    }
}
