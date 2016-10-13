package com.nightmare.jli.mydatabinding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.nightmare.jli.mydatabinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        ActivityMainBinding binding= DataBindingUtil.setContentView(this,R.layout.activity_main);
        MyViewModel vm=new MyViewModel("dasdas","isajd");
        binding.setVm(vm);
    }


}
