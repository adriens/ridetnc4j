/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.adriens.ridetnc4j.entities;

import java.util.List;

/**
 *
 * @author 3004SAL
 */
public class ODSResponse {
    public int nhits;
    public Parameters parameters;
    public List<Record> records;
    public List<FacetGroup> facet_groups;
}
