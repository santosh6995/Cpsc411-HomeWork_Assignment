package com.example.assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.security.cert.Certificate;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView tv;
        LinearLayout layout1, layout2;
        LinearLayout.LayoutParams lp;


        HorizontalScrollView sv = new HorizontalScrollView(this);
        sv.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT));


        LinearLayout mainlayout = new LinearLayout(this);
        mainlayout.setOrientation(LinearLayout.VERTICAL);
        mainlayout.setBackgroundColor(Color.BLACK);
        mainlayout.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));


        // Row 1
        layout1= new LinearLayout(this);
        layout1.setOrientation(LinearLayout.HORIZONTAL);
        lp = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 75);
        lp.setMargins(1, 1, 1, 1);
        layout1.setLayoutParams(lp);

        tv = new TextView(this);
        lp = new LinearLayout.LayoutParams(100, ViewGroup.LayoutParams.MATCH_PARENT);
        lp.setMargins(1, 1, 1, 1);
        tv.setLayoutParams(lp);
        tv.setText("1");
        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(Color.GRAY);
        tv.setGravity(Gravity.CENTER);
        tv.setTextSize(18);
        layout1.addView(tv);

        tv = new TextView(this);
        lp = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        lp.setMargins(1, 1, 1, 1);
        tv.setLayoutParams(lp);
        tv.setText("Rules void hello1(int hour)");

        tv.setTextColor(Color.WHITE);

        tv.setGravity(Gravity.CENTER);
        tv.setTextSize(18);
        layout1.addView(tv);

        mainlayout.addView(layout1);

        layout2 = new LinearLayout(this);
        layout2.setOrientation(LinearLayout.HORIZONTAL);
        lp = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 150);
        lp.setMargins(1, 1, 1, 1);
        layout2.setLayoutParams(lp);

        layout1= new LinearLayout(this);

        layout1.setOrientation(LinearLayout.VERTICAL);
        layout1.setLayoutParams(new ViewGroup.LayoutParams(100, ViewGroup.LayoutParams.MATCH_PARENT));

        tv = new TextView(this);
        lp = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 75);
        lp.setMargins(1, 1, 1, 1);
        tv.setLayoutParams(lp);
        tv.setText("2");
        tv.setBackgroundColor(Color.GRAY);

        tv.setTextColor(Color.BLACK);
        tv.setGravity(Gravity.CENTER);
        tv.setTextSize(18);
        layout1.addView(tv);

        tv = new TextView(this);
        lp = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 75);
        lp.setMargins(1, 1, 1, 1);
        tv.setLayoutParams(lp);
        tv.setText("3");
        tv.setBackgroundColor(Color.GRAY);

        tv.setTextColor(Color.BLACK);
        tv.setGravity(Gravity.CENTER);
        layout1.addView(tv);
        tv.setTextSize(18);
        layout2.addView(layout1);


        tv = new TextView(this);
        lp = new LinearLayout.LayoutParams(300, 150);
        lp.setMargins(1, 1, 1, 1);
        tv.setLayoutParams(lp);
        tv.setText("properties");
        tv.setBackgroundColor(Color.WHITE);

        tv.setTextColor(Color.BLACK);
        tv.setGravity(Gravity.CENTER);
        tv.setTextSize(18);
        layout2.addView(tv);


        layout1= new LinearLayout(this);
        layout1.setOrientation(LinearLayout.VERTICAL);
        lp = new LinearLayout.LayoutParams(800, 150);
        lp.setMargins(1, 1, 1, 1);
        layout1.setLayoutParams(lp);

        tv = new TextView(this);
        lp = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 75);
        lp.setMargins(1, 1, 1, 1);
        tv.setLayoutParams(lp);
        tv.setText("name");

        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(Color.WHITE);
        tv.setGravity(Gravity.CENTER);
        tv.setTextSize(18);
        layout1.addView(tv);

        tv = new TextView(this);
        lp = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 75);
        lp.setMargins(1, 1, 1, 1);
        tv.setLayoutParams(lp);

        tv.setTextColor(Color.BLACK);
        tv.setText("category");
        tv.setBackgroundColor(Color.WHITE);
        tv.setGravity(Gravity.CENTER);
        tv.setTextSize(18);
        layout1.addView(tv);

        layout2.addView(layout1);

        layout1= new LinearLayout(this);
        layout1.setOrientation(LinearLayout.VERTICAL);
        lp = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 150);
        layout1.setLayoutParams(lp);

        tv = new TextView(this);
        lp = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 75);
        lp.setMargins(1, 1, 1, 1);
        tv.setLayoutParams(lp);
        tv.setText("Day Hour Classification");

        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(Color.WHITE);
        tv.setGravity(Gravity.CENTER);
        tv.setTextSize(18);
        tv.setSingleLine(true);
        layout1.addView(tv);

        tv = new TextView(this);
        lp = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 75);
        lp.setMargins(1, 1, 1, 1);
        tv.setLayoutParams(lp);
        tv.setText("Day and Time");

        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(Color.WHITE);
        tv.setGravity(Gravity.CENTER);
        tv.setTextSize(18);
        tv.setSingleLine(true);
        layout1.addView(tv);

        layout2.addView(layout1);
        mainlayout.addView(layout2);

        layout1= new LinearLayout(this);
        layout1.setOrientation(LinearLayout.HORIZONTAL);
        lp = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 75);
        lp.setMargins(1, 1, 1, 1);
        layout1.setLayoutParams(lp);

        tv = new TextView(this);
        lp = new LinearLayout.LayoutParams(100, ViewGroup.LayoutParams.MATCH_PARENT);
        lp.setMargins(1, 1, 1, 1);
        tv.setLayoutParams(lp);

        tv.setTextColor(Color.BLACK);
        tv.setText("4");
        tv.setBackgroundColor(Color.GRAY);
        tv.setGravity(Gravity.CENTER);
        tv.setTextSize(18);
        layout1.addView(tv);

        tv = new TextView(this);
        lp = new LinearLayout.LayoutParams(300, ViewGroup.LayoutParams.MATCH_PARENT);
        lp.setMargins(1, 1, 1, 1);
        tv.setLayoutParams(lp);
        tv.setText("Rule");
        tv.setBackgroundColor(Color.parseColor("#33ECFF"));
        tv.setTypeface(null, Typeface.BOLD);

        tv.setTextColor(Color.BLACK);
        tv.setGravity(Gravity.CENTER);
        tv.setTextSize(18);
        layout1.addView(tv);

        tv = new TextView(this);
        lp = new LinearLayout.LayoutParams(800, ViewGroup.LayoutParams.MATCH_PARENT);
        lp.setMargins(1, 1, 1, 1);
        tv.setLayoutParams(lp);

        tv.setTextColor(Color.BLACK);
        tv.setText("C1");
        tv.setBackgroundColor(Color.parseColor("#33ECFF"));
        tv.setTypeface(null, Typeface.BOLD);
        tv.setGravity(Gravity.CENTER);
        tv.setTextSize(18);
        layout1.addView(tv);

        tv = new TextView(this);
        lp = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        lp.setMargins(1, 1, 1, 1);
        tv.setLayoutParams(lp);

        tv.setTextColor(Color.BLACK);
        tv.setText("A1");
        tv.setBackgroundColor(Color.parseColor("#33ECFF"));
        tv.setTypeface(null, Typeface.BOLD);
        tv.setGravity(Gravity.CENTER);
        tv.setTextSize(18);
        layout1.addView(tv);

        mainlayout.addView(layout1);

        layout1= new LinearLayout(this);
        layout1.setOrientation(LinearLayout.HORIZONTAL);
        lp = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 75);
        lp.setMargins(1, 1, 1, 1);
        layout1.setLayoutParams(lp);

        tv = new TextView(this);
        lp = new LinearLayout.LayoutParams(100, ViewGroup.LayoutParams.MATCH_PARENT);
        lp.setMargins(1, 1, 1, 1);
        tv.setLayoutParams(lp);
        tv.setText("5");

        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(Color.GRAY);
        tv.setGravity(Gravity.CENTER);
        tv.setTextSize(18);
        layout1.addView(tv);

        tv = new TextView(this);
        lp = new LinearLayout.LayoutParams(300, ViewGroup.LayoutParams.MATCH_PARENT);
        lp.setMargins(1, 1, 1, 1);
        tv.setLayoutParams(lp);
        tv.setBackgroundColor(Color.parseColor("#33ECFF"));
        tv.setGravity(Gravity.CENTER);

        tv.setTextColor(Color.BLACK);
        tv.setTextSize(18);
        layout1.addView(tv);

        tv = new TextView(this);
        lp = new LinearLayout.LayoutParams(800, ViewGroup.LayoutParams.MATCH_PARENT);
        lp.setMargins(1, 1, 1, 1);
        tv.setLayoutParams(lp);

        tv.setTextColor(Color.BLACK);
        tv.setText(getResources().getString(R.string.min));
        tv.setBackgroundColor(Color.parseColor("#33ECFF"));
        tv.setGravity(Gravity.CENTER);
        tv.setTextSize(18);
        layout1.addView(tv);


        tv = new TextView(this);
        lp = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        lp.setMargins(1, 1, 1, 1);

        tv.setTextColor(Color.BLACK);
        tv.setLayoutParams(lp);
        tv.setText(getResources().getString(R.string.system));
        tv.setBackgroundColor(Color.parseColor("#33ECFF"));
        tv.setGravity(Gravity.CENTER);
        tv.setTextSize(18);
        layout1.addView(tv);

        mainlayout.addView(layout1);


        layout1= new LinearLayout(this);
        layout1.setOrientation(LinearLayout.HORIZONTAL);
        lp = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 75);
        lp.setMargins(1, 1, 1, 1);
        layout1.setLayoutParams(lp);

        tv = new TextView(this);
        lp = new LinearLayout.LayoutParams(100, ViewGroup.LayoutParams.MATCH_PARENT);
        lp.setMargins(1, 1, 1, 1);
        tv.setLayoutParams(lp);
        tv.setText("6");

        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(Color.GRAY);
        tv.setGravity(Gravity.CENTER);
        tv.setTextSize(18);
        layout1.addView(tv);

        tv = new TextView(this);
        lp = new LinearLayout.LayoutParams(300, ViewGroup.LayoutParams.MATCH_PARENT);
        lp.setMargins(1, 1, 1, 1);
        tv.setLayoutParams(lp);
        tv.setBackgroundColor(Color.parseColor("#33ECFF"));
        tv.setGravity(Gravity.CENTER);
        tv.setTextSize(18);

        tv.setTextColor(Color.BLACK);
        tv.setTextColor(Color.BLACK);
        layout1.addView(tv);

        tv = new TextView(this);
        lp = new LinearLayout.LayoutParams(400, ViewGroup.LayoutParams.MATCH_PARENT);
        lp.setMargins(1, 1, 1, 1);
        tv.setLayoutParams(lp);

        tv.setTextColor(Color.BLACK);
        tv.setText("int min");
        tv.setBackgroundColor(Color.parseColor("#33ECFF"));
        tv.setGravity(Gravity.CENTER);
        tv.setTextSize(18);
        layout1.addView(tv);

        tv = new TextView(this);
        lp = new LinearLayout.LayoutParams(400, ViewGroup.LayoutParams.MATCH_PARENT);
        lp.setMargins(1, 1, 1, 1);
        tv.setLayoutParams(lp);

        tv.setTextColor(Color.BLACK);
        tv.setText("int max");
        tv.setBackgroundColor(Color.parseColor("#33ECFF"));
        tv.setGravity(Gravity.CENTER);
        tv.setTextSize(18);
        layout1.addView(tv);


        tv = new TextView(this);
        lp = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        lp.setMargins(1, 1, 1, 1);
        tv.setLayoutParams(lp);

        tv.setTextColor(Color.BLACK);
        tv.setText("String greeting");
        tv.setBackgroundColor(Color.parseColor("#33ECFF"));
        tv.setGravity(Gravity.CENTER);
        tv.setTextSize(18);
        layout1.addView(tv);

        mainlayout.addView(layout1);



        layout1= new LinearLayout(this);
        layout1.setOrientation(LinearLayout.HORIZONTAL);
        lp = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 75);
        lp.setMargins(1, 1, 1, 1);
        layout1.setLayoutParams(lp);

        tv = new TextView(this);
        lp = new LinearLayout.LayoutParams(100, ViewGroup.LayoutParams.MATCH_PARENT);
        lp.setMargins(1, 1, 1, 1);
        lp.gravity = Gravity.CENTER;
        tv.setLayoutParams(lp);
        tv.setLayoutParams(lp);

        tv.setTextColor(Color.BLACK);
        tv.setText("7");
        tv.setBackgroundColor(Color.GRAY);
        tv.setGravity(Gravity.CENTER);
        tv.setTextSize(18);
        layout1.addView(tv);

        tv = new TextView(this);
        lp= new LinearLayout.LayoutParams(300, ViewGroup.LayoutParams.MATCH_PARENT);
        lp.setMargins(1, 1, 1, 1);
        lp.gravity = Gravity.CENTER;
        tv.setLayoutParams(lp);
        tv.setText("Rule");

        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(Color.WHITE);
        tv.setTypeface(null, Typeface.BOLD);
        tv.setTextSize(18);
        layout1.addView(tv);

        tv = new TextView(this);
        lp = new LinearLayout.LayoutParams(400, ViewGroup.LayoutParams.MATCH_PARENT);
        lp.setMargins(1, 1, 1, 1);
        lp.gravity = Gravity.CENTER;
        tv.setLayoutParams(lp);

        tv.setTextColor(Color.BLACK);
        tv.setText("From");
        tv.setBackgroundColor(Color.parseColor("#F2F5A9"));
        tv.setTypeface(null, Typeface.BOLD);
        tv.setTextSize(18);
        layout1.addView(tv);

        tv = new TextView(this);
        lp = new LinearLayout.LayoutParams(400, ViewGroup.LayoutParams.MATCH_PARENT);
        lp.setMargins(1, 1, 1, 1);
        lp.gravity = Gravity.CENTER;
        tv.setLayoutParams(lp);
        tv.setTextColor(Color.BLACK);

        tv.setText("To");
        tv.setBackgroundColor(Color.parseColor("#F2F5A9"));
        tv.setTypeface(null, Typeface.BOLD);
        tv.setTextSize(18);
        layout1.addView(tv);


        tv = new TextView(this);
        lp = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        lp.setMargins(1, 1, 1, 1);
        tv.setLayoutParams(lp);

        tv.setTextColor(Color.BLACK);
        tv.setText("Greeting");
        tv.setBackgroundColor(Color.parseColor("#F7BE81"));
        tv.setTypeface(null, Typeface.BOLD);
        tv.setTextSize(18);
        layout1.addView(tv);

        mainlayout.addView(layout1);


        layout1= new LinearLayout(this);
        layout1.setOrientation(LinearLayout.HORIZONTAL);
        lp = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        lp.setMargins(1, 1, 1, 1);
        layout1.setLayoutParams(lp);


        tv = new TextView(this);
        lp= new LinearLayout.LayoutParams(100, ViewGroup.LayoutParams.MATCH_PARENT);
        lp.gravity = Gravity.CENTER;
        lp.setMargins(1, 1, 1, 1);
        tv.setLayoutParams(lp);
        tv.setText("8");

        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(Color.GRAY);
        tv.setGravity(Gravity.CENTER);
        tv.setTextSize(18);
        layout1.addView(tv);

        tv = new TextView(this);
        lp = new LinearLayout.LayoutParams(300, ViewGroup.LayoutParams.MATCH_PARENT);
        lp.setMargins(1, 1, 1, 1);
        tv.setLayoutParams(lp);

        tv.setTextColor(Color.BLACK);
        tv.setText("R10");
        tv.setBackgroundColor(Color.WHITE);
        tv.setTextSize(18);
        layout1.addView(tv);

        tv = new TextView(this);
        lp = new LinearLayout.LayoutParams(400, ViewGroup.LayoutParams.MATCH_PARENT);
        lp.setMargins(1, 1, 1, 1);
        tv.setGravity(Gravity.RIGHT);
        tv.setLayoutParams(lp);

        tv.setTextColor(Color.BLACK);
        tv.setText("0");
        tv.setBackgroundColor(Color.parseColor("#F2F5A9"));
        tv.setTextSize(18);
        layout1.addView(tv);

        tv = new TextView(this);
        lp = new LinearLayout.LayoutParams(400, ViewGroup.LayoutParams.MATCH_PARENT);
        lp.setMargins(1, 1, 1, 1);
        tv.setGravity(Gravity.RIGHT);
        tv.setLayoutParams(lp);

        tv.setTextColor(Color.BLACK);
        tv.setText("11");
        tv.setBackgroundColor(Color.parseColor("#F2F5A9"));
        tv.setTextSize(18);
        tv.setPadding(1, 1, 1, 1);
        layout1.addView(tv);


        tv = new TextView(this);
        lp = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        lp.setMargins(1, 1, 1, 1);
        tv.setLayoutParams(lp);

        tv.setTextColor(Color.BLACK);
        tv.setText("Good Morning");
        tv.setBackgroundColor(Color.parseColor("#F7BE81"));
        tv.setTextSize(18);
        tv.setPadding(1, 1, 1, 1);
        layout1.addView(tv);

        mainlayout.addView(layout1);


        layout1= new LinearLayout(this);
        layout1.setOrientation(LinearLayout.HORIZONTAL);
        layout1.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));

        tv = new TextView(this);
        lp = new LinearLayout.LayoutParams(100, ViewGroup.LayoutParams.MATCH_PARENT);
        lp.gravity = Gravity.CENTER;
        lp.setMargins(1, 1, 1, 1);

        tv.setTextColor(Color.BLACK);
        tv.setLayoutParams(lp);
        tv.setText("9");
        tv.setBackgroundColor(Color.GRAY);
        tv.setGravity(Gravity.CENTER);
        tv.setTextSize(18);
        layout1.addView(tv);

        tv = new TextView(this);
        lp = new LinearLayout.LayoutParams(300, ViewGroup.LayoutParams.MATCH_PARENT);
        lp.setMargins(1, 1, 1, 1);
        tv.setLayoutParams(lp);

        tv.setTextColor(Color.BLACK);
        tv.setText("R20");
        tv.setBackgroundColor(Color.WHITE);
        tv.setTextSize(18);
        layout1.addView(tv);

        tv = new TextView(this);
        lp = new LinearLayout.LayoutParams(400, ViewGroup.LayoutParams.MATCH_PARENT);
        lp.setMargins(1, 1, 1, 1);
        tv.setGravity(Gravity.RIGHT);
        tv.setLayoutParams(lp);

        tv.setTextColor(Color.BLACK);
        tv.setText("12");
        tv.setBackgroundColor(Color.parseColor("#F2F5A9"));
        tv.setTextSize(18);
        layout1.addView(tv);

        tv = new TextView(this);
        lp = new LinearLayout.LayoutParams(400, ViewGroup.LayoutParams.MATCH_PARENT);
        lp.setMargins(1, 1, 1, 1);
        tv.setGravity(Gravity.RIGHT);
        tv.setLayoutParams(lp);

        tv.setTextColor(Color.BLACK);
        tv.setText("17");
        tv.setBackgroundColor(Color.parseColor("#F2F5A9"));
        tv.setTextSize(18);
        layout1.addView(tv);


        tv = new TextView(this);
        lp = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        lp.setMargins(1, 1, 1, 1);
        tv.setLayoutParams(lp);

        tv.setTextColor(Color.BLACK);
        tv.setText("Good Afternoon");
        tv.setBackgroundColor(Color.parseColor("#F7BE81"));
        tv.setTextSize(18);
        layout1.addView(tv);

        mainlayout.addView(layout1);

        layout1= new LinearLayout(this);
        layout1.setOrientation(LinearLayout.HORIZONTAL);
        layout1.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));

        tv = new TextView(this);
        lp= new LinearLayout.LayoutParams(100, ViewGroup.LayoutParams.MATCH_PARENT);
        lp.gravity = Gravity.CENTER;
        lp.setMargins(1, 1, 1, 1);
        tv.setLayoutParams(lp);
        tv.setText("10");

        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(Color.GRAY);
        tv.setGravity(Gravity.CENTER);
        tv.setTextSize(18);
        layout1.addView(tv);

        tv = new TextView(this);
        lp= new LinearLayout.LayoutParams(300, ViewGroup.LayoutParams.MATCH_PARENT);
        lp.setMargins(1, 1, 1, 1);
        tv.setLayoutParams(lp);
        tv.setText("R30");

        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(Color.WHITE);
        tv.setTextSize(18);
        layout1.addView(tv);

        tv = new TextView(this);
        lp = new LinearLayout.LayoutParams(400, ViewGroup.LayoutParams.MATCH_PARENT);
        lp.setMargins(1, 1, 1, 1);
        tv.setGravity(Gravity.RIGHT);
        tv.setLayoutParams(lp);
        tv.setText("18");

        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(Color.parseColor("#F2F5A9"));
        tv.setTextSize(18);
        layout1.addView(tv);

        tv = new TextView(this);
        lp = new LinearLayout.LayoutParams(400, ViewGroup.LayoutParams.MATCH_PARENT);
        lp.setMargins(1, 1, 1, 1);
        tv.setGravity(Gravity.RIGHT);
        tv.setLayoutParams(lp);
        tv.setText("21");

        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(Color.parseColor("#F2F5A9"));
        tv.setTextSize(18);
        layout1.addView(tv);


        tv = new TextView(this);
        lp = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);

        lp.setMargins(1, 1, 1, 1);
        tv.setLayoutParams(lp);
        tv.setText("Good Evening");

        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(Color.parseColor("#F7BE81"));
        tv.setTextSize(18);
        layout1.addView(tv);

        mainlayout.addView(layout1);

        layout1= new LinearLayout(this);
        layout1.setOrientation(LinearLayout.HORIZONTAL);
        layout1.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));

        tv = new TextView(this);
        lp = new LinearLayout.LayoutParams(100, ViewGroup.LayoutParams.MATCH_PARENT);
        lp.gravity = Gravity.CENTER;
        lp.setMargins(1, 1, 1, 1);
        tv.setLayoutParams(lp);
        tv.setText("11");

        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(Color.GRAY);
        tv.setGravity(Gravity.CENTER);
        tv.setTextSize(18);
        layout1.addView(tv);

        tv = new TextView(this);
        lp = new LinearLayout.LayoutParams(300, ViewGroup.LayoutParams.MATCH_PARENT);
        lp.setMargins(1, 1, 1, 1);
        tv.setLayoutParams(lp);
        tv.setText("R40");

        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(Color.WHITE);
        tv.setTextSize(18);
        layout1.addView(tv);

        tv = new TextView(this);
        lp = new LinearLayout.LayoutParams(400, ViewGroup.LayoutParams.MATCH_PARENT);
        lp.setMargins(1, 1, 1, 1);
        tv.setGravity(Gravity.RIGHT);
        tv.setLayoutParams(lp);
        tv.setText("22");

        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(Color.parseColor("#F2F5A9"));
        tv.setTextSize(18);
        layout1.addView(tv);

        tv = new TextView(this);
        lp = new LinearLayout.LayoutParams(400, ViewGroup.LayoutParams.MATCH_PARENT);
        lp.setMargins(1, 1, 1, 1);
        tv.setGravity(Gravity.RIGHT);
        tv.setLayoutParams(lp);

        tv.setTextColor(Color.BLACK);
        tv.setText("23");
        tv.setBackgroundColor(Color.parseColor("#F2F5A9"));
        tv.setTextSize(18);
        layout1.addView(tv);

        tv = new TextView(this);
        lp = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        lp.setMargins(1, 1, 1, 1);
        tv.setLayoutParams(lp);
        tv.setText("Good Night");
        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(Color.parseColor("#F7BE81"));
        tv.setTextSize(18);
        layout1.addView(tv);
        mainlayout.addView(layout1);

        sv.addView(mainlayout);
        setContentView(R.layout.activity_main_assignment);
    }
}
