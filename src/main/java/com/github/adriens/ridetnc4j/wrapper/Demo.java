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
public class Demo {

    public static void main(String[] args) {
        try {
            /*
            Entreprise ent = Entreprises.getEnterpriseFromRidet("0426049");
            System.out.println(ent);
            */
            int page = 1;
            Entreprises.getEnterprisesFromQueryString("jardin", page);            
            System.exit(0);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
