package com.valiksk8.controller;

import com.valiksk8.model.Category;
import com.valiksk8.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @RequestMapping(path = "/categories", method = RequestMethod.GET)
    public ModelAndView getAllCategories(ModelAndView vm) {
        List<Category> categories = categoryService.getAll();
        vm.setViewName("categories");
        vm.addObject("categories", categories);
        return vm;
    }

//    @RequestMapping(value = "/category&c_id=?", method = RequestMethod.GET)
    @RequestMapping(value = "/category", method = RequestMethod.GET)
    public ModelAndView getCategoryById(@RequestParam("c_id") Long id, ModelAndView vm) {
        List<Category> category = categoryService.getById(id);
        vm.setViewName("category");
        vm.addObject("category", category);
        return vm;
    }
}
