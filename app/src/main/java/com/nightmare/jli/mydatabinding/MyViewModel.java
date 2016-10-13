package com.nightmare.jli.mydatabinding;


import android.databinding.ObservableField;
import android.view.View;

import java.util.Random;

/**
 * Created by J.Li on 2016/6/14.
 */
public class MyViewModel {

    public ObservableField<String> firstName=new ObservableField<String>();
    public ObservableField<String> lastName=new ObservableField<String>();
    public ObservableField<String> btnText=new ObservableField<String>();

    public MyViewModel(String tempFirstName,String tempLastName){
        this.firstName.set(tempFirstName);
        this.lastName.set(tempLastName);
        this.btnText.set("Refrash");
    }

    public void refrashString(View view) {
        Random r=new Random();
        this.firstName.set(String.valueOf(r.nextInt(100000000)));
        this.lastName.set(String.valueOf(r.nextInt(100000000)));
        r=null;
    }

}
