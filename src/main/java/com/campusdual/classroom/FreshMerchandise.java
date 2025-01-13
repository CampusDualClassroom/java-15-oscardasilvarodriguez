package com.campusdual.classroom;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class FreshMerchandise extends Merchandise {


    private SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

    public FreshMerchandise(String name, String uniqueId, String responsibleId, int zone, String area, String shelf, int quantity, Date expirationDate) {
        super(name, uniqueId, responsibleId, zone, area, shelf, quantity, expirationDate);
    }

    public Date getExpirationDate() {
        return this.expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getFormattedDate(Date date) {
        return this.sdf.format(this.expirationDate);
    }

    @Override
    public String getSpecificData() {
        StringBuilder builder = new StringBuilder();
        builder.append("Localización: ").append(getLocation()).append("\n");
        builder.append("Caducidad: ").append(sdf.format(this.getExpirationDate()));
        return builder.toString();
    }

    public void printSpecificData() {
        System.out.println("Datos mercancía:");
        System.out.println(this.getSpecificData());
    }
}
