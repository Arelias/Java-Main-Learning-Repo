package com.kodilla.good.patterns.challenges.two.listings;
import com.kodilla.good.patterns.challenges.two.listings.elements.Item;
import com.kodilla.good.patterns.challenges.two.listings.elements.user.User;
import java.time.LocalDateTime;

public abstract class Listing {

    private User seller;
    private Item item;
    private int quantity;
    private LocalDateTime startDate;
    private LocalDateTime endDate;

    public Listing(User seller, Item item, int quantity, LocalDateTime startDate, LocalDateTime endDate) {

        this.seller = seller;
        this.item = item;
        this.quantity = quantity;
        this.startDate = startDate;
        this.endDate = endDate;

    }

    public User getSeller() {
        return seller;
    }

    public void setSeller(User seller) {
        this.seller = seller;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Listing{" +
                "seller=" + seller +
                ", item=" + item +
                ", quantity=" + quantity +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}
