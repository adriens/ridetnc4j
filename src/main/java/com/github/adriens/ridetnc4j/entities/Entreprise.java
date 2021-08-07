/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.adriens.ridetnc4j.entities;

/**
 *
 * @author 3004SAL
 */
public class Entreprise{
    private String province;
    private String libelle_section_naf;
    private String code_formjur;
    private String libelle_formjur;
    private String code_ape;
    private String code_commune;
    private String denomination;
    private String libelle_division_naf;
    private String libelle_commune;
    private String section_naf;
    private String employeuse;
    private String rid7;
    private String libelle_naf;
    private String division_naf;

    /**
     * @return the province
     */
    public String getProvince() {
        return province;
    }

    /**
     * @return the libelle_section_naf
     */
    public String getLibelleSectionNnaf() {
        return libelle_section_naf;
    }

    /**
     * @return the code_formjur
     */
    public String getCodeFormJur() {
        return code_formjur;
    }

    /**
     * @return the libelle_formjur
     */
    public String getLibelleFormJur() {
        return libelle_formjur;
    }

    /**
     * @return the code_ape
     */
    public String getCodeApe() {
        return code_ape;
    }

    /**
     * @return the code_commune
     */
    public String getCodeCommune() {
        return code_commune;
    }

    /**
     * @return the denomination
     */
    public String getDenomination() {
        return denomination;
    }

    /**
     * @return the libelle_division_naf
     */
    public String getLibelleDivisionNaf() {
        return libelle_division_naf;
    }

    /**
     * @return the libelle_commune
     */
    public String getLibelleCommune() {
        return libelle_commune;
    }

    /**
     * @return the section_naf
     */
    public String getSectionNaf() {
        return section_naf;
    }

    /**
     * @return the employeuse
     */
    public String getEmployeuse() {
        return employeuse;
    }

    /**
     * @return the rid7
     */
    public String getRid7() {
        return rid7;
    }

    /**
     * @return the libelle_naf
     */
    public String getLibelleNaf() {
        return libelle_naf;
    }

    /**
     * @return the division_naf
     */
    public String getDivisionNaf() {
        return division_naf;
    }
    
    public String toString(){
        return getDenomination() + " (rid7=" + getRid7() + ")" ;
    }
}

