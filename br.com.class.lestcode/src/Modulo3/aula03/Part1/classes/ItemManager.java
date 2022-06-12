package Modulo3.aula03.Part1.classes;

import Modulo3.aula03.Part1.interfaces.IItemManager;

import java.util.ArrayList;
import java.util.List;

public class ItemManager implements IItemManager {

    private static List<Item> registeredItems = new ArrayList<>();

    @Override
    public void addItem(Item item) {
        registeredItems.add(item);
    }

    @Override
    public void addItem(List<Item> itemList) {
        for (Item item: itemList) {
            if (!isItemRegistered(item.getId())){
                registeredItems.add(item);
            }
        }
    }

    @Override
    public void showItem(Long id) {
        if(isItemRegistered(id)){
            for (Item item: registeredItems) {
                if (item.getId() == id){
                    System.out.println(item.productInfo());
                    break;
                }
            }
        } else {
            System.out.println("Item not registered.");
        }
    }

    @Override
    public void updateItem(Long id, Item item) {
        if(isItemRegistered(id)){
            Item itemToUpdate = getRegisteredItem(id);
                itemToUpdate.update(item);
        }
    }

    @Override
    public void deleteItem(Long id) {
        if (isItemRegistered(id)){
            for (Item item: registeredItems) {
                if (item.getId() == id){
                    registeredItems.remove(item);
                    break;
                }
            }
        }
    }

    @Override
    public void listAllRegisteredItems() {
        registeredItems.forEach(x-> System.out.println(x.productFullDescription()));
    }

    @Override
    public boolean isItemRegistered(Long id) {
        for (Item item: registeredItems) {
            if (item.getId() == id){
                return true;
            }
        }
        return false;
    }

    @Override
    public Item getRegisteredItem(Long id) {
        if (isItemRegistered(id)){
            for (Item item: registeredItems) {
                if (item.getId() == id){
                    return item;
                }
            }
        }
        return null;
    }

    @Override
    public List<Item> getListOfRegisteredItems() {
        return registeredItems;
    }

}
