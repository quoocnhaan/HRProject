/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package controller.DAO;

import model.PayPeriod;

/**
 *
 * @author PC
 */
public interface PayPeriodDAO extends InterfaceDAO<PayPeriod> {
    PayPeriod getByPayPeriodCode(String payPeriodCode);
}
