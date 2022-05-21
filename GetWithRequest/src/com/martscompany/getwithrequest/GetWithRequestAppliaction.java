/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.martscompany.getwithrequest;

import io.searchbox.client.http.apache.HttpGetWithEntity;
import java.io.InputStreamReader;
import java.io.Reader;
import org.apache.http.HttpEntity;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.json.JSONObject;

/**
 *
 * @author MartsCompany
 */
public class GetWithRequestAppliaction {

    public static void main(String[] args) {
        String URL ="http://localhost:8080/animals/whater";
        
        JSONObject body = new JSONObject();
        body.put("habitat", "Tierra");
        body.put("name", "Gato");
        try{
        StringEntity entityValue = new StringEntity(body.toString());

        CloseableHttpClient client = HttpClients.createDefault();
        
        HttpGetWithEntity httpGetWithEntity = new HttpGetWithEntity(URL);
        httpGetWithEntity.setEntity(entityValue);
        httpGetWithEntity.setHeader("Accept","application/json");
        httpGetWithEntity.setHeader("Content-type","application/json");
        
        CloseableHttpResponse responseClient = client.execute(httpGetWithEntity);
        
        HttpEntity entityResponse = responseClient.getEntity();
        
        String readResponse = "";
        
        if(entityResponse!=null){
           Reader reader = new InputStreamReader(entityResponse.getContent());
           while(true){
               int chr = reader.read();
               if(chr==-1){
                   break;
               }
              readResponse+=(char)chr;
           }
        }
        
        client.close();
        System.out.println("readResponse : " + readResponse);
        }catch(Exception ex){
            System.out.println(ex);
        }

    }

}
