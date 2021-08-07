/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.adriens.ridetnc4j.wrapper;

import com.github.adriens.ridetnc4j.entities.Entreprise;
import com.github.adriens.ridetnc4j.entities.ODSResponse;
import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;

/**
 *
 * @author 3004SAL
 */
public class Main {
    public static void main(String[] args){
        HttpResponse<JsonNode> response = Unirest.get("https://data.gouv.nc/api/records/1.0/search/")
        .header("accept", "application/json")
        .queryString("dataset", "entreprises-actives-au-ridet")
        .queryString("rows", "10")
        .queryString("q", "042")
        //.queryString("apiKey", "123")
        //.queryString("apiKey", "123")//.field("parameter", "value")
      //.field("firstname", "Gary")
      .asJson();
        Unirest.config().cacheResponses(true);
        ODSResponse reponse = Unirest.get("https://data.gouv.nc/api/records/1.0/search/")
        .header("accept", "application/json")
        .queryString("dataset", "entreprises-actives-au-ridet")
        .queryString("rows", "10")
        .queryString("q", "042")
         .asObject(ODSResponse.class)
                .getBody();
        System.out.println("Nb records : " + reponse.records.size());
        Entreprise lEntreprise = reponse.records.get(1).fields;
        System.out.println(lEntreprise);
        //System.out.println("Fields : " + reponse.records.get(1).entreprise.toString());
        //System.out.println(response.getBody().toString());
    }
}
