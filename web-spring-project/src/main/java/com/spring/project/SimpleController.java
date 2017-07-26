package com.spring.project;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Created by flori on 04/03/2017.
 */
@Controller
public class SimpleController {

    //TODO read more about http verbs
    @RequestMapping(value="/try",method = RequestMethod.GET)
    public String getView(@RequestParam int no, Map<String,Object> model){
        model.put("testMe","TEEEEE");
        List<Coffee> coffeeList = new LinkedList<>();
        coffeeList.add(new Coffee("black"));
        coffeeList.add(new Coffee("white"));
        model.put("cofeeList",coffeeList);
        model.put("no",no);
        CoffeeForm coffeeForm = new CoffeeForm();
        coffeeForm.setCoffee(new Coffee(""));
        model.put("coffeeForm",coffeeForm);
        return "index";
    }
    @RequestMapping(value="/maps",method = RequestMethod.GET)
    public String getMapsView(Map<String,Object> model){
        return "maps";
    }
    @RequestMapping(value="/test",method = RequestMethod.GET)
    public String getTestView(Map<String,Object> model){
        model.put("testMe","TEEEEE");
        List<Coffee> coffeeList = new LinkedList<>();
        coffeeList.add(new Coffee("black"));
        coffeeList.add(new Coffee("white"));
        model.put("cofeeList",coffeeList);
        return "index";
    }
    @RequestMapping(value="/test",method = RequestMethod.POST)
    public String submitForm (Map<String,Object> model, @ModelAttribute CoffeeForm coffeeForm){
        System.out.println(coffeeForm.getCoffee().getColor());
        return "index";
    }
}
