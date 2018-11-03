package com.valiksk8.controller;

import com.valiksk8.model.Category;
import com.valiksk8.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class CategoriesController {

    @Autowired
    private CategoryService categoryService;

    @RequestMapping(path = "/categories", method = RequestMethod.GET)
    public ModelAndView categories() {
        ModelAndView vm = new ModelAndView();
        List<Category> categories = categoryService.findAll();

        vm.setViewName("categories");
        vm.addObject("categories", categories);
        return vm;
    }
}
