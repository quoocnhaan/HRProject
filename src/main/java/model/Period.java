/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author LENOVO
 */
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Period {

    private LocalDate startDate;
    private LocalDate endDate;

    public Period(String monthYear) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/yyyy");
        
        LocalDate parsedDate = LocalDate.parse("15/" + monthYear, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        this.startDate = parsedDate;

        this.endDate = parsedDate.plusMonths(1);
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return "Period{"
                + "startDate=" + startDate.format(formatter)
                + ", endDate=" + endDate.format(formatter)
                + '}';
    }
}
