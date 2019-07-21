package com.kodilla.spring.library;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

//Moge wstzyknac zaleznosc na 3 sposoby:
//1. Konstruktor
//2. Metode / Setter (Setter sprawia ze obiekt jest mutowalny, wiec slaby wybor)
//3. Bezposrednio do pola klasy (zmiennej)

@Service
public final class Library {
    private final List<String> books = new ArrayList<>();

    @Autowired
    private LibraryDbController libraryDbController;

    public void saveToDb() {
        libraryDbController.saveData();
    }

    public void loadFromDb() {
        libraryDbController.loadData();
    }
}