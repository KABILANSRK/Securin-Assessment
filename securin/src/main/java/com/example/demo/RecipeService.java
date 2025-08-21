package com.example.demo;

@Service
public class RecipeService {

    @Autowired
    private RecipeRepository recipeRepository;

    public Page<Recipe> getAllRecipes(int page, int limit) {
        Pageable pageable = PageRequest.of(page - 1, limit, Sort.by("rating").descending());
        return recipeRepository.findAll(pageable);
    }
}
