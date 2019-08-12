package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;
    @Autowired
    ItemDao itemDao;
    @Autowired
    ProductDao productDao;
    String number = "1337";
    String description = "EXAMPLE DESCRIPTION";

    @Test
    public void testFindInvoiceByNumber() {
        //Given
        Invoice invoice = new Invoice(number);
        invoiceDao.save(invoice);
        String name = invoice.getNumber();

        //When
        List<Invoice> readInvoiceList = invoiceDao.findByNumber(number);


        //Then
        Assert.assertEquals(1, readInvoiceList.size());

        //CleanUp
        int id = readInvoiceList.get(0).getId();
        invoiceDao.deleteById(id);
    }

    @Test
    public void testSaveInvoice() {
        //Given
        Item item = new Item(5, new BigDecimal(20), new BigDecimal(100));
        Item item2 = new Item(1, new BigDecimal(1), new BigDecimal(1));
        Item item3 = new Item(2, new BigDecimal(2), new BigDecimal(4));
        Item item4 = new Item(3, new BigDecimal(3), new BigDecimal(9));

        Product product = new Product("Burning water");
        Product product2 = new Product("Salty sugar");

        item.setProduct(product);
        item2.setProduct(product);
        item3.setProduct(product2);
        item4.setProduct(product2);

        Invoice invoice = new Invoice(number);
        invoice.getItems().add(item);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);
        invoice.getItems().add(item4);

        item.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);
        item4.setInvoice(invoice);

        //When
        invoiceDao.save(invoice);
        int id = invoice.getId();

        //Then
        Assert.assertNotEquals(0, id);

        //CleanUp
        invoiceDao.deleteById(id);
    }
}
