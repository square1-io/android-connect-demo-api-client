/*
 * com.connect.client.City
 *
 * Generated By LaravelConnect for Android on 2018-04-12 21:35:56
 *
 */
 
 
package com.connect.client;

import java.util.*;
import io.square1.laravelConnect.*;
import android.content.Context;
import io.square1.laravelConnect.model.*;
import io.square1.laravelConnect.client.Sort;
import io.square1.laravelConnect.client.ApiRequest;
import io.square1.laravelConnect.requests.LaravelRequest;
import io.square1.laravelConnect.client.LaravelConnectClient;
import io.square1.laravelConnect.client.results.ResultObj;




public class City extends BaseModel {

    public final static String PRIMARY_KEY = "id";
    
    private  ModelProperty<String> _name;
    private  ModelProperty<String> _local_name;
    private  ModelProperty<Double> _lat;
    private  ModelProperty<Double> _lng;
    private  ModelProperty<Date> _created_at;
    private  ModelProperty<Date> _updated_at;
    private  ModelProperty<Integer> _country_id;
        
    private  ModelManyRelation<User> _users;
    private  ModelOneRelation<Country> _country;
    
    public City() {
      super(PRIMARY_KEY);
      _name = (ModelProperty<String>)addProperty("name",String.class);
    _local_name = (ModelProperty<String>)addProperty("local_name",String.class);
    _lat = (ModelProperty<Double>)addProperty("lat",Double.class);
    _lng = (ModelProperty<Double>)addProperty("lng",Double.class);
    _created_at = (ModelProperty<Date>)addProperty("created_at",Date.class);
    _updated_at = (ModelProperty<Date>)addProperty("updated_at",Date.class);
    _country_id = (ModelProperty<Integer>)addProperty("country_id",Integer.class);
     
      
      _users = (ModelManyRelation<User>)addRelation("users", User.class);
    _country = (ModelOneRelation<Country>)addRelation("country","country_id", Country.class);
     
      }

    public ModelProperty<String> getName(){
        return this._name;
}

public void setName(String value){
    this._name.setValue(value);
}
public ModelProperty<String> getLocalName(){
        return this._local_name;
}

public void setLocalName(String value){
    this._local_name.setValue(value);
}
public ModelProperty<Double> getLat(){
        return this._lat;
}

public void setLat(Double value){
    this._lat.setValue(value);
}
public ModelProperty<Double> getLng(){
        return this._lng;
}

public void setLng(Double value){
    this._lng.setValue(value);
}
public ModelProperty<Date> getCreatedAt(){
        return this._created_at;
}

public void setCreatedAt(Date value){
    this._created_at.setValue(value);
}
public ModelProperty<Date> getUpdatedAt(){
        return this._updated_at;
}

public void setUpdatedAt(Date value){
    this._updated_at.setValue(value);
}
public ModelProperty<Integer> getCountryId(){
        return this._country_id;
}

public void setCountryId(Integer value){
    this._country_id.setValue(value);
}
    

    public ModelManyRelation<User> getUsers(){
        return this._users;
}


public ModelOneRelation<Country> getCountry(){
        return this._country;
}


 
    
   public static ModelList list(){
        return ModelList.listForModel(City.class);
    }

    public static ApiRequest get(int id, LaravelConnectClient.Observer observer){

        return BaseModel.get( City.class, id, observer);
    }
    
       
    
    public static final String getModelPath(){
      return "city";
    }
}