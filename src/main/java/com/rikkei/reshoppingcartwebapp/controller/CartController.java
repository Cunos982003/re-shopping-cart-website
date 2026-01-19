package com.rikkei.reshoppingcartwebapp.controller;

import com.rikkei.reshoppingcartwebapp.service.CartService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/cart")
public class CartController {

    private final CartService cartService;

    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    // Thêm sản phẩm
    @PostMapping("/{cartId}/add/{productId}")
    public String addProductToCart(
            @PathVariable Integer cartId,
            @PathVariable Integer productId) {

        cartService.addProductToCart(cartId, productId);
        return "redirect:/";
    }

    @PostMapping("/item/{cartItemId}/increase")
    public String increaseQuantity(
            @PathVariable Integer cartItemId,
            @RequestParam Integer cartId) {

        cartService.increaseProductQuantity(cartItemId);
        return "redirect:/";
    }

    // Giảm số lượng
    @PostMapping("/item/{cartItemId}/decrease")
    public String decreaseQuantity(
            @PathVariable Integer cartItemId,
            @RequestParam Integer cartId) {

        cartService.decreaseProductQuantity(cartItemId);
        return "redirect:/";
    }

    // Xóa 1 sản phẩm
    @PostMapping("/item/{cartItemId}/remove")
    public String removeItem(
            @PathVariable Integer cartItemId,
            @RequestParam Integer cartId) {

        cartService.removeProductFromCart(cartItemId);
        return "redirect:/";
    }

    // Xóa toàn bộ giỏ
    @PostMapping("/{cartId}/clear")
    public String clearCart(@PathVariable Integer cartId) {

        cartService.clearCart(cartId);
        return "redirect:/";
    }
}
