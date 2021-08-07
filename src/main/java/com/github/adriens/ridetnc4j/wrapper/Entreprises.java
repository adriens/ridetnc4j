/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.adriens.ridetnc4j.wrapper;

import com.github.adriens.ridetnc4j.entities.Entreprise;
import com.github.adriens.ridetnc4j.entities.ODSResponse;
import com.github.adriens.ridetnc4j.entities.Record;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kong.unirest.Unirest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author 3004SAL
 */
public class Entreprises {

    public static final String URL_ROOT = "https://data.gouv.nc/api/records/1.0/search/";
    public static final int PAGE_SIZE = 100;
    final static Logger logger = LoggerFactory.getLogger(Entreprises.class);
    
    public static Entreprise getEnterpriseFromRidet(String rid7) throws EntrepriseNotFoundException, Exception {
        Entreprise out = new Entreprise();
        ODSResponse reponse = Unirest.get(URL_ROOT)
                .header("accept", "application/json")
                .queryString("dataset", "entreprises-actives-au-ridet")
                .queryString("rows", "1")
                .queryString("refine.rid7", rid7)
                .asObject(ODSResponse.class)
                .getBody();
        int nbHits = reponse.records.size();
        if (nbHits == 0) {
            throw new EntrepriseNotFoundException("Unable to find the Enterprise with ride <" + rid7 + ">");
        } else if (nbHits == 1) {
            out = reponse.records.get(0).fields;
            System.out.println("Got a hit for ridet <" + rid7 + ">. Found <" + out + ">");
            return out;
        } else {
            throw new TooManyHitsException("Got " + nbHits + "hits. Cannot choose. Exiting with error");
        }
    }
    public static List<Entreprise> getEnterprisesFromQueryString(String query, int page) {
        ODSResponse reponse = Unirest.get(URL_ROOT)
                .header("accept", "application/json")
                .queryString("dataset", "entreprises-actives-au-ridet")
                .queryString("rows", PAGE_SIZE)
                .queryString("start", PAGE_SIZE*(page-1))
                .queryString("q", query)
                .asObject(ODSResponse.class)
                .getBody();
        ArrayList<Entreprise> out = new ArrayList<>();
        Iterator<Record> recordIterator = reponse.records.listIterator();
        int i = 1;
        while(recordIterator.hasNext()){
            Entreprise lEntreprise = recordIterator.next().fields;
            System.out.println(i + "- Got a new hit : " + lEntreprise);
            i++;
            out.add(lEntreprise);
        }
        return out;
    }
}
