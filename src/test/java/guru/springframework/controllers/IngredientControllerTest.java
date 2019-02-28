package guru.springframework.controllers;

import guru.springframework.services.RecipeService;
import org.mockito.Mock;
import org.springframework.test.web.servlet.MockMvc;

public class IngredientControllerTest {

    @Mock
    RecipeService recipeService;

    IngredientController controller;

    MockMvc mockMvc;


}
