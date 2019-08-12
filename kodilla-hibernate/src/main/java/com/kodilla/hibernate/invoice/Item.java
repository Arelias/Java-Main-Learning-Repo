package com.kodilla.hibernate.invoice;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Entity
@Table(name = "ITEMS")
public class Item {
    private int id;
    private int quantity;
    private BigDecimal price;
    private BigDecimal value;
    private Product product;
    private Invoice invoice;

    public Item() {
    }

    public Item(int quantity, BigDecimal price, BigDecimal value) {
        this.quantity = quantity;
        this.price = price;
        this.value = value;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID", unique = true)
    public int getId() {
        return id;
    }
    @NotNull
    @Column(name="QUANTITY")
    public int getQuantity() {
        return quantity;
    }
    @NotNull
    @Column(name="PRICE")
    public BigDecimal getPrice() {
        return price;
    }
    @NotNull
    @Column(name="VALUE")
    public BigDecimal getValue() {
        return value;
    }
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "PRODUCT_ID")
    public Product getProduct() {
        return product;
    }
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "INVOICE_ID")
    public Invoice getInvoice() {
        return invoice;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    private void setPrice(BigDecimal price) {
        this.price = price;
    }

    private void setValue(BigDecimal value) {
        this.value = value;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }
}
//@Entity
//@Table(name = "TASKS")
//public final class Task {
//    private int id;
//    private String description;
//    private Date created;
//    private int duration;
//    private TaskFinancialDetails taskFinancialDetails;
//    private TaskList taskList;
//
//    public Task() {
//    }
//
//    public Task(String description, int duration) {
//        this.description = description;
//        this.created = new Date();
//        this.duration = duration;
//    }
//
//    @Id
//    @GeneratedValue
//    @NotNull
//    @Column(name = "ID", unique = true)
//    public int getId() {
//        return id;
//    }
//
//    @Column(name = "DESCRIPTION")
//    public String getDescription() {
//        return description;
//    }
//
//    @NotNull
//    @Column(name="CREATED")
//    public Date getCreated() {
//        return created;
//    }
//
//    @Column(name="DURATION")
//    public int getDuration() {
//        return duration;
//    }
//
//    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//    @JoinColumn(name = "TASKS_FINANCIALS_ID")
//    public TaskFinancialDetails getTaskFinancialDetails() {
//        return taskFinancialDetails;
//    }
//
//    @ManyToOne
//    @JoinColumn(name = "TASKLIST_ID")
//    public TaskList getTaskList() {
//        return taskList;
//    }
//
//    private void setId(int id) {
//        this.id = id;
//    }
//
//    private void setDescription(String description) {
//        this.description = description;
//    }
//
//    private void setCreated(Date created) {
//        this.created = created;
//    }
//
//    private void setDuration(int duration) {
//        this.duration = duration;
//    }
//
//    public void setTaskFinancialDetails(TaskFinancialDetails taskFinancialDetails) {
//        this.taskFinancialDetails = taskFinancialDetails;
//    }
//
//    public void setTaskList(TaskList taskList) {
//        this.taskList = taskList;
//    }