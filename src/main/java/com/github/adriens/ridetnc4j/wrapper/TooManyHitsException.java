/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.adriens.ridetnc4j.wrapper;

/**
 *
 * @author 3004SAL
 */
public class TooManyHitsException extends Exception {
    public TooManyHitsException(String errorMessage) {
        super(errorMessage);
    }
}
