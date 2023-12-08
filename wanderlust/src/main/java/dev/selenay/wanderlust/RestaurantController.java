package dev.selenay.wanderlust;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

// RESTAURANT CONTROLLER WILL HAVE ENDPOINTS FOR
// SHOW ALL RESTAURANTS
// GET HOW MANY LIKES DOES THE RESTAURANTS HAVE
// GET HOW MANY COMMENTS DOES THE RESTAURANTS HAVE
// POST LIKE TO A RESTAURANTS
// POST COMMENT TO A RESTAURANTS

@RestController
@RequestMapping("/api/v1/restaurants")
public class RestaurantController {
    @Autowired
    private RestaurantService restaurantService;
    @GetMapping
    public ResponseEntity<List<Restaurants>> getAllRestaurants(){ // SHOW ALL RESTAURANTS
        return new ResponseEntity<List<Restaurants>>(restaurantService.allRestaurants(), HttpStatus.OK) ;
    }

}