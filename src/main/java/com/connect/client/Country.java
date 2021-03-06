/*
 * com.connect.client.Country
 *
 * Generated By LaravelConnect for Android on 2018-06-04 20:16:47
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




public class Country extends BaseModel {

    public final static String PRIMARY_KEY = "id";
    
    private  ModelProperty<String> _name;
    private  ModelProperty<String> _code;
    private  ModelProperty<Date> _created_at;
    private  ModelProperty<Date> _updated_at;
    private  ModelProperty<Integer> _continent_id;
        
    private  ModelManyRelation<Language> _languages;
    private  ModelManyRelation<City> _cities;
    private  ModelOneRelation<Continent> _continent;
    
    public Country() {
      super(PRIMARY_KEY);
      _name = (ModelProperty<String>)addProperty("name",String.class);
    _code = (ModelProperty<String>)addProperty("code",String.class);
    _created_at = (ModelProperty<Date>)addProperty("created_at",Date.class);
    _updated_at = (ModelProperty<Date>)addProperty("updated_at",Date.class);
    _continent_id = (ModelProperty<Integer>)addProperty("continent_id",Integer.class);
     
      
      _languages = (ModelManyRelation<Language>)addRelation("languages", Language.class);
    _cities = (ModelManyRelation<City>)addRelation("cities", City.class);
    _continent = (ModelOneRelation<Continent>)addRelation("continent","continent_id", Continent.class);
     
      }

    public ModelProperty<String> getName(){
        return this._name;
}

public void setName(String value){
    this._name.setValue(value);
}
public ModelProperty<String> getCode(){
        return this._code;
}

public void setCode(String value){
    this._code.setValue(value);
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
public ModelProperty<Integer> getContinentId(){
        return this._continent_id;
}

public void setContinentId(Integer value){
    this._continent_id.setValue(value);
}
    

    public ModelManyRelation<Language> getLanguages(){
        return this._languages;
}


public ModelManyRelation<City> getCities(){
        return this._cities;
}


public ModelOneRelation<Continent> getContinent(){
        return this._continent;
}


 
    
   public static ModelList list(){
        return ModelList.listForModel(Country.class);
    }

    public static ApiRequest get(int id, LaravelConnectClient.Observer observer){

        return BaseModel.get( Country.class, id, observer);
    }
    
       
    
    public static final String getModelPath(){
      return "country";
    }
}