package ra.demo.serviceImp;

import org.springframework.stereotype.Service;
import ra.demo.model.Categories;
import ra.demo.repository.CategoriesRepository;
import ra.demo.repositoryImp.CategoriesRepositoryImp;
import ra.demo.service.CategoriesService;

import java.util.List;

@Service
public class CategoriesServiceImp implements CategoriesService {
    private final CategoriesRepository categoriesRepository;

    public CategoriesServiceImp(CategoriesRepositoryImp categoriesRepositoryImp) {
        this.categoriesRepository = categoriesRepositoryImp;
    }

    @Override
    public List<Categories> findAll() {
        return categoriesRepository.findAll();
    }
}
