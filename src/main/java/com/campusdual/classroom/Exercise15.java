package com.campusdual.classroom;

import java.util.Date;

public class Exercise15 {

	public static void main(String[] args) {
        FreshMerchandise freshItem = new FreshMerchandise(
                "Manzanas",
                "12345",
                "resp123",
                1,
                "A",
                "B2",
                50,
                new Date(1683194400000L)
        );

        freshItem.printSpecificData();
    }

}


