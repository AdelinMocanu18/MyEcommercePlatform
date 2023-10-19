package com.MyEcommercePlatform.service;

import com.MyEcommercePlatform.model.Cart;
import com.MyEcommercePlatform.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CartService {

    @Autowired
    private CartRepository cartRepository;

    public Cart addCart(Cart cart) {
        return cartRepository.save(cart);
    }

    public void removeCart(Integer cartId) {
        cartRepository.deleteById(cartId);
    }

    public Optional<Cart> getCart(Integer cartId) {
        return cartRepository.findById(cartId);
    }
}
