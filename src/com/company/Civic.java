package com.company;
import com.company.Car;

public class Civic extends Car{

    private boolean autoDrive;

    public Civic(boolean autoDrive ){
        super("civic","4WD",4,2,4,false);
        this.autoDrive=autoDrive;
    }
}
