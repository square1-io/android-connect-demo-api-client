/*
 * com.connect.client.User
 *
 * Generated By LaravelConnect for Android on 2018-06-01 19:20:11
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




public class User extends BaseModel {

    public final static String PRIMARY_KEY = "id";
    
    private  ModelProperty<String> _name;
    private  ModelProperty<String> _email;
    private  ModelProperty<String> _password;
    private  ModelProperty<String> _gender;
    private  ModelProperty<String> _remember_token;
    private  ModelProperty<Date> _created_at;
    private  ModelProperty<Date> _updated_at;
    private  ModelProperty<Integer> _city_id;
    private  ModelProperty<UploadedFile> _avatar;
    private  ModelProperty<Date> _date_of_birth;
        
    private  ModelOneRelation<Phone> _phone;
    private  ModelOneRelation<City> _city;
    private  ModelManyRelation<User> _friends;
    
    public User() {
      super(PRIMARY_KEY);
      _name = (ModelProperty<String>)addProperty("name",String.class);
    _email = (ModelProperty<String>)addProperty("email",String.class);
    _password = (ModelProperty<String>)addProperty("password",String.class);
    _gender = (ModelProperty<String>)addProperty("gender",String.class);
    _remember_token = (ModelProperty<String>)addProperty("remember_token",String.class);
    _created_at = (ModelProperty<Date>)addProperty("created_at",Date.class);
    _updated_at = (ModelProperty<Date>)addProperty("updated_at",Date.class);
    _city_id = (ModelProperty<Integer>)addProperty("city_id",Integer.class);
    _avatar = (ModelProperty<UploadedFile>)addProperty("avatar",UploadedFile.class);
    _date_of_birth = (ModelProperty<Date>)addProperty("date_of_birth",Date.class);
     
      
      _phone = (ModelOneRelation<Phone>)addRelation("phone","phones.user_id", Phone.class);
    _city = (ModelOneRelation<City>)addRelation("city","city_id", City.class);
    _friends = (ModelManyRelation<User>)addRelation("friends", User.class);
     
      }

    public ModelProperty<String> getName(){
        return this._name;
}

public void setName(String value){
    this._name.setValue(value);
}
public ModelProperty<String> getEmail(){
        return this._email;
}

public void setEmail(String value){
    this._email.setValue(value);
}
public ModelProperty<String> getPassword(){
        return this._password;
}

public void setPassword(String value){
    this._password.setValue(value);
}
public ModelProperty<String> getGender(){
        return this._gender;
}

public void setGender(String value){
    this._gender.setValue(value);
}
public ModelProperty<String> getRememberToken(){
        return this._remember_token;
}

public void setRememberToken(String value){
    this._remember_token.setValue(value);
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
public ModelProperty<Integer> getCityId(){
        return this._city_id;
}

public void setCityId(Integer value){
    this._city_id.setValue(value);
}
public ModelProperty<UploadedFile> getAvatar(){
        return this._avatar;
}

public void setAvatar(UploadedFile value){
    this._avatar.setValue(value);
}
public ModelProperty<Date> getDateOfBirth(){
        return this._date_of_birth;
}

public void setDateOfBirth(Date value){
    this._date_of_birth.setValue(value);
}
    

    public ModelOneRelation<Phone> getPhone(){
        return this._phone;
}


public ModelOneRelation<City> getCity(){
        return this._city;
}


public ModelManyRelation<User> getFriends(){
        return this._friends;
}


 
    
   public static ModelList list(){
        return ModelList.listForModel(User.class);
    }

    public static ApiRequest get(int id, LaravelConnectClient.Observer observer){

        return BaseModel.get( User.class, id, observer);
    }
    
       
    
    public static final String getModelPath(){
      return "user";
    }
}