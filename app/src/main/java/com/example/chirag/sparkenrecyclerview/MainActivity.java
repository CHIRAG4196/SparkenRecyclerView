package com.example.chirag.sparkenrecyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import com.example.chirag.sparkenrecyclerview.model.Image;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Image>  imageArrayList;
    private RecyclerView mRvImage;
    private final String android_image_urls[] = {
            "http://www.gettyimages.com/gi-resources/images/Embed/new/embed2.jpg",
            "http://2.bp.blogspot.com/-VzjWxhNbi0Y/UxiR0T8hb_I/AAAAAAAAAXA/NBtmpBKiH8I/s1600/British+cat.jpg",
            "http://www.laughspark.info/uploadfiles/funny-sqiuurel-talking-imags-i-5922.jpg",
            "https://crackberry.com/sites/crackberry.com/files/styles/large/public/topic_images/2013/ANDROID.png?itok=xhm7jaxS",
            "http://cdn1.techadvisor.co.uk/cmsdata/features/3613985/android_800_thumb800.jpg",
            "https://boygeniusreport.files.wordpress.com/2012/11/android-icon.jpg?quality=98&strip=all"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRvImage = (RecyclerView) findViewById(R.id.rv_image);
        RecyclerView.LayoutManager layoutManager = new StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.VERTICAL);
        mRvImage.setLayoutManager(layoutManager);
        dummyData();
        ImageAdapter imageAdapter = new ImageAdapter(this,imageArrayList);
        mRvImage.setAdapter(imageAdapter);
    }

    private ArrayList<Image> dummyData() {
        imageArrayList=new ArrayList<>();
        for (int i = 0; i <android_image_urls.length ; i++) {
            Image image = new Image();
            image.setImageURL(android_image_urls[i]);
            imageArrayList.add(image);

        }

        return imageArrayList;
    }
}
