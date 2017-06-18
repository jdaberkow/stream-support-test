package com.test.streamsupporttest;

import android.app.Activity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import java8.util.stream.StreamSupport;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        testMethod();
    }

    private void testMethod() {
        List<String> list = new ArrayList<>();

        list.add("3");
        list.add("100");
        list.add("00000");
        list.add("20");

        boolean test = StreamSupport.stream(list).anyMatch(s -> s.length() == 2);

    }
}
