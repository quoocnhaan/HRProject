/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author PC
 */
public class DateRange {

    private LocalDate fromDate;
    private LocalDate toDate;

    public DateRange(LocalDate fromDate, LocalDate toDate) {
        this.fromDate = fromDate;
        this.toDate = toDate;
    }

    @Override
    public String toString() {
        // Khai báo formatter cho ngày (ngày/tháng/năm)
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM");

        // Kiểm tra xem từ ngày và đến ngày có cùng tháng và năm không
        if (fromDate.getMonth() == toDate.getMonth() && fromDate.getYear() == toDate.getYear()) {
            // Nếu cùng tháng và năm, chỉ in ngày và tháng
            return String.format("%d - %d tháng %d năm %d",
                    fromDate.getDayOfMonth(),
                    toDate.getDayOfMonth(),
                    fromDate.getMonthValue(),
                    toDate.getYear());
        } else {
            // Nếu khác tháng hoặc năm, in tháng và năm, không in ngày
            return String.format("%s - %s năm %d",
                    fromDate.format(formatter),
                    toDate.format(formatter),
                    toDate.getYear());
        }
    }

    public LocalDate getFromDate() {
        return fromDate;
    }

    public void setFromDate(LocalDate fromDate) {
        this.fromDate = fromDate;
    }

    public LocalDate getToDate() {
        return toDate;
    }

    public void setToDate(LocalDate toDate) {
        this.toDate = toDate;
    }
}
