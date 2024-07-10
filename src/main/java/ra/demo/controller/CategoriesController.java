package ra.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ra.demo.service.CategoriesService;
import ra.demo.serviceImp.CategoriesServiceImp;

@Controller
@RequestMapping("/categoriesController")
public class CategoriesController {
    private final CategoriesService categoriesService;

    public CategoriesController(CategoriesServiceImp categoriesServiceImp) {
        this.categoriesService = categoriesServiceImp;
    }
    @GetMapping("/findAll")
    public String findAllCategories(Model model) {
        model.addAttribute("listCategories", categoriesService.findAll());
        return "categories";
    }
}
