package com.example.slb.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Fruit> fruitList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       initFruits();
        FruitAdapter adapter = new FruitAdapter(MainActivity.this,R.layout.fruit_item,fruitList);
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);

    }

    private void initFruits() {
        Fruit apple = new Fruit ("Apple",R.drawable.apple_pic);
        Fruit banana = new Fruit ("Banana",R.drawable.banana_pic);
        Fruit orange = new Fruit ("Orange",R.drawable.orange_pic);
        Fruit watermelon = new Fruit ("Watermelon",R.drawable.watermelon_pic);
        Fruit pear= new Fruit ("Pear",R.drawable.pear_pic);
        Fruit grape = new Fruit ("Grape",R.drawable.grape_pic);
        Fruit pineapple = new Fruit ("Pineapple",R.drawable.pineapple_pic);
        Fruit strawberry = new Fruit ("Strawberry",R.drawable.strawberry_pic);
        Fruit cherry = new Fruit ("Cherry",R.drawable.cherry_pic);
        Fruit mango = new Fruit ("Mango",R.drawable.mango_pic);

    }
}
