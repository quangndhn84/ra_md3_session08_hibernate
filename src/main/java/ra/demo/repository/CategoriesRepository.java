package ra.demo.repository;

import ra.demo.model.Categories;

import java.util.List;

public interface CategoriesRepository {
    List<Categories> findAll();
}
