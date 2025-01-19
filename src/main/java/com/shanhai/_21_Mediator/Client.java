package com.shanhai._21_Mediator;

/**
 * @description:
 * @author: xu
 * @date: 2025/1/19 16:55
 */
public class Client {
    public static void main(String[] args) {
        UnitedNationsSecurityCouncil securityCouncil = new UnitedNationsSecurityCouncil();
        USA countryUSA = new USA(securityCouncil);
        Iraq countryIraq = new Iraq(securityCouncil);

        securityCouncil.setCountryUSA(countryUSA);
        securityCouncil.setCountryIraq(countryIraq);

        countryUSA.declare("不准研制核武器，否则要发动战争！");
        countryIraq.declare("我们没有核武器，也不怕侵略！");
    }
}
