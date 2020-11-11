package com.example.anika.eatandfit;

import java.util.jar.Attributes.Name;

public class VegRecipe {

    int _id;
    String _name;
    String _ingredients;
    String _method;


    public VegRecipe()
    {

    }
    public VegRecipe(int ID,String Name,String Ingredients, String Method)
    {

        this._id=ID;
        this._name=Name;
        this._ingredients=Ingredients;
        this._method=Method;

    }

    public VegRecipe(String Name,String Ingredients,String Method)
    {
        this._name=Name;
        this._ingredients=Ingredients;
        this._method=Method;

    }

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public String get_ingredients() {
        return _ingredients;
    }

    public void set_ingredients(String _ingredients) {
        this._ingredients = _ingredients;
    }

    public String get_method() {
        return _method;
    }

    public void set_method(String _method) {
        this._method = _method;
    }
}


