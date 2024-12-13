package demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/shopowners")
public class ShopOwnerController {

    @Autowired
    private ShopOwnerService shopOwnerService;

    // Create new shop owner
    @PostMapping
    public ResponseEntity<ShopOwner> createShopOwner(@RequestBody ShopOwner shopOwner) {
        return ResponseEntity.ok(shopOwnerService.createShopOwner(shopOwner));
    }

    // Get all shop owners
    @GetMapping
    public List<ShopOwner> getAllShopOwners() {
        return shopOwnerService.getAllShopOwners();
    }

    // Get shop owner by ID
    @GetMapping("/{id}")
    public ResponseEntity<ShopOwner> getShopOwnerById(@PathVariable Long id) {
        try {
            ShopOwner shopOwner = shopOwnerService.getShopOwnerById(id);
            return ResponseEntity.ok(shopOwner);
        } catch (ShopOwnerNotFoundException e) {
            return ResponseEntity.notFound().build();
        }
    }

    // Update shop owner
    @PutMapping("/{id}")
    public ResponseEntity<ShopOwner> updateShopOwner(@PathVariable Long id, @RequestBody ShopOwner shopOwner) {
        try {
            ShopOwner updatedShopOwner = shopOwnerService.updateShopOwner(id, shopOwner);
            return ResponseEntity.ok(updatedShopOwner);
        } catch (ShopOwnerNotFoundException e) {
            return ResponseEntity.notFound().build();
        }
    }

    // Delete shop owner
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteShopOwner(@PathVariable Long id) {
        try {
            shopOwnerService.deleteShopOwner(id);
            return ResponseEntity.ok().build();
        } catch (ShopOwnerNotFoundException e) {
            return ResponseEntity.notFound().build();
        }
    }
}
