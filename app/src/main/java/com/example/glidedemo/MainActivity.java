package com.example.glidedemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

import butterknife.BindString;
import butterknife.BindView;
import butterknife.BindViews;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    // ButterKnife绑定组件
    @BindView(R.id.img)
    ImageView imageView;
    //private ImageView imageView = (ImageView) this.findViewById(R.id.img);
//    @BindView(R.id.btn1)
//    Button button1;
//    @BindView(R.id.btn2)
//    Button button2;
    @BindViews({R.id.btn1, R.id.btn2})
    public List<Button> buttonList;

    @BindView(R.id.txt)
    TextView textView;

    @BindString(R.string.app_name)
    String str;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // ButterKnife框架进行初始化
        ButterKnife.bind(this);

        textView.setText(str);

    }

    @OnClick({R.id.btn1, R.id.btn2})
    public void click(View view) {
        int id = view.getId();
        switch (id) {
            case R.id.btn1:
                Glide.with(this)
                        .load("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1606965877886&di=d5bdaca77f8e98319ae90af4cb538192&imgtype=0&src=http%3A%2F%2Fimgsrc.baidu.com%2Fforum%2Fw%3D580%2Fsign%3Ded6f9f98b1de9c82a665f9875c8080d2%2F0df3ddb44aed2e73f4e3fd8d8501a18b86d6fa96.jpg")
                        .into(imageView);
                break;
            case R.id.btn2:
                Glide.with(this)
                        .load("https://www.baidu.com/img/flexible/logo/pc/result.png")
                        .into(imageView);
                break;
        }
    }

    /*@OnClick(R.id.btn1)
    public void btn1_click() {
        Glide.with(this)
                .load("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1606965877886&di=d5bdaca77f8e98319ae90af4cb538192&imgtype=0&src=http%3A%2F%2Fimgsrc.baidu.com%2Fforum%2Fw%3D580%2Fsign%3Ded6f9f98b1de9c82a665f9875c8080d2%2F0df3ddb44aed2e73f4e3fd8d8501a18b86d6fa96.jpg")
                .into(imageView);
    }

    @OnClick(R.id.btn2)
    public void btn2_click() {
        Glide.with(this)
                .load("https://www.baidu.com/img/flexible/logo/pc/result.png")
                .into(imageView);
    }*/
}