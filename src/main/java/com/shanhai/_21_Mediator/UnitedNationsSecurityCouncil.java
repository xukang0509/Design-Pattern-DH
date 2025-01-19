package com.shanhai._21_Mediator;

import lombok.Data;

/**
 * @description: 联合国安理会
 * @author: xu
 * @date: 2025/1/19 16:52
 */
@Data
public class UnitedNationsSecurityCouncil extends UnitedNations {
    private USA countryUSA;
    private Iraq countryIraq;

    @Override
    public void declare(String message, Country country) {
        if (countryUSA == country) {
            countryIraq.getMessage(message);
        } else if (countryIraq == country) {
            countryUSA.getMessage(message);
        }
    }
}
