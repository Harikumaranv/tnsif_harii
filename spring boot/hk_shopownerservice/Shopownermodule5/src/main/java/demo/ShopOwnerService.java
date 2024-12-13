package demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ShopOwnerService {

    @Autowired
    private ShopOwnerRepository shopOwnerRepository;

    // Create a new shop owner
    public ShopOwner createShopOwner(ShopOwner shopOwner) {
        return shopOwnerRepository.save(shopOwner);
    }

    // Get all shop owners
    public List<ShopOwner> getAllShopOwners() {
        return shopOwnerRepository.findAll();
    }

    // Get shop owner by ID
    public ShopOwner getShopOwnerById(Long id) throws ShopOwnerNotFoundException {
        Optional<ShopOwner> shopOwner = shopOwnerRepository.findById(id);
        if (shopOwner.isPresent()) {
            return shopOwner.get();
        } else {
            throw new ShopOwnerNotFoundException("Shop owner not found with id: " + id);
        }
    }

    // Update shop owner details
    public ShopOwner updateShopOwner(Long id, ShopOwner updatedShopOwner) throws ShopOwnerNotFoundException {
        return shopOwnerRepository.findById(id).map(shopOwner -> {
            shopOwner.setName(updatedShopOwner.getName());
            shopOwner.setShopName(updatedShopOwner.getShopName());
            shopOwner.setContactDetails(updatedShopOwner.getContactDetails());
            return shopOwnerRepository.save(shopOwner);
        }).orElseThrow(() -> new ShopOwnerNotFoundException("Shop owner not found with id: " + id));
    }

    // Delete shop owner by ID
    public void deleteShopOwner(Long id) throws ShopOwnerNotFoundException {
        if (shopOwnerRepository.existsById(id)) {
            shopOwnerRepository.deleteById(id);
        } else {
            throw new ShopOwnerNotFoundException("Shop owner not found with id: " + id);
        }
    }
}
