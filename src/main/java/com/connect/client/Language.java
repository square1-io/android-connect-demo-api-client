/*
 * com.connect.client.Language
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




public class Language extends BaseModel {

    public final static String PRIMARY_KEY = "id";
    
    private  ModelProperty<String> _name;
    private  ModelProperty<Date> _created_at;
    private  ModelProperty<Date> _updated_at;
        
    private  ModelManyRelation<Country> _countries;
    
    public Language() {
      super(PRIMARY_KEY);
      _name = (ModelProperty<String>)addProperty("name",String.class);
    _created_at = (ModelProperty<Date>)addProperty("created_at",Date.class);
    _updated_at = (ModelProperty<Date>)addProperty("updated_at",Date.class);
     
      
      _countries = (ModelManyRelation<Country>)addRelation("countries", Country.class);
     
      }

    public ModelProperty<String> getName(){
        return this._name;
}

public void setName(String value){
    this._name.setValue(value);
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
    

    public ModelManyRelation<Country> getCountries(){
        return this._countries;
}


 
    
   public static ModelList list(){
        return ModelList.listForModel(Language.class);
    }

    public static ApiRequest get(int id, LaravelConnectClient.Observer observer){

        return BaseModel.get( Language.class, id, observer);
    }
    
       
    
    public static final String getModelPath(){
      return "language";
    }
}