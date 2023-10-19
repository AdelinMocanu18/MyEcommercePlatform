package com.MyEcommercePlatform.controller;

import com.MyEcommercePlatform.model.Cart;
import com.MyEcommercePlatform.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/cart")
public class CartController {

    @Autowired
    private CartService cartService;

    @PostMapping("/add")
    public Cart addCart(@RequestBody Cart cart) {
        return cartService.addCart(cart);
    }

    @DeleteMapping("/delete/{cartId}")
    public void removeCart(@PathVariable Integer cartId) {
        cartService.removeCart(cartId);
    }

    @GetMapping("/list/{id}")
    public Optional<Cart> getCart(@PathVariable Integer cartId) {
        return cartService.getCart(cartId);
    }
}
