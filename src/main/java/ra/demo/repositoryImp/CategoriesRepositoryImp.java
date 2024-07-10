package ra.demo.repositoryImp;

import org.springframework.stereotype.Repository;
import ra.demo.model.Categories;
import ra.demo.repository.CategoriesRepository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class CategoriesRepositoryImp implements CategoriesRepository {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Categories> findAll() {
        return entityManager.createQuery("from Categories c", Categories.class).getResultList();
    }
}
