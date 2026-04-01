package com.example.viratkohliwallpapers;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private WallpaperAdapter adapter;
    private List<String> imageUrlList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));

        imageUrlList = new ArrayList<>();

        // Hardcoded Virat Kohli image URLs
        imageUrlList.add("https://upload.wikimedia.org/wikipedia/commons/thumb/9/9b/Virat_Kohli_in_2024.jpg/440px-Virat_Kohli_in_2024.jpg");
        imageUrlList.add("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d5/Virat_Kohli_2023.jpg/440px-Virat_Kohli_2023.jpg");
        imageUrlList.add("https://upload.wikimedia.org/wikipedia/commons/thumb/7/71/Virat_Kohli_at_the_2019_Cricket_World_Cup.jpg/440px-Virat_Kohli_at_the_2019_Cricket_World_Cup.jpg");
        imageUrlList.add("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e6/Virat_Kohli_2019_ICC_World_Cup.jpg/440px-Virat_Kohli_2019_ICC_World_Cup.jpg");
        imageUrlList.add("https://upload.wikimedia.org/wikipedia/commons/thumb/3/31/Virat_Kohli_2020.jpg/440px-Virat_Kohli_2020.jpg");
        imageUrlList.add("https://upload.wikimedia.org/wikipedia/commons/thumb/b/b9/Virat_Kohli_2022.jpg/440px-Virat_Kohli_2022.jpg");
        imageUrlList.add("https://upload.wikimedia.org/wikipedia/commons/thumb/c/c2/Virat_Kohli_at_TOISA_2017.jpg/440px-Virat_Kohli_at_TOISA_2017.jpg");
        imageUrlList.add("https://upload.wikimedia.org/wikipedia/commons/thumb/4/4a/Virat_Kohli_bowling_2014.jpg/440px-Virat_Kohli_bowling_2014.jpg");
        imageUrlList.add("https://upload.wikimedia.org/wikipedia/commons/thumb/f/f3/Virat_Kohli_2016.jpg/440px-Virat_Kohli_2016.jpg");
        imageUrlList.add("https://upload.wikimedia.org/wikipedia/commons/thumb/5/5d/Virat_Kohli_2018.jpg/440px-Virat_Kohli_2018.jpg");
        imageUrlList.add("https://upload.wikimedia.org/wikipedia/commons/thumb/0/04/Virat_Kohli_-_ICC_World_Test_Championship_Final_2023.jpg/440px-Virat_Kohli_-_ICC_World_Test_Championship_Final_2023.jpg");
        imageUrlList.add("https://upload.wikimedia.org/wikipedia/commons/thumb/8/8a/Virat_Kohli_2013.jpg/440px-Virat_Kohli_2013.jpg");

        adapter = new WallpaperAdapter(this, imageUrlList);
        recyclerView.setAdapter(adapter);
    }
}
