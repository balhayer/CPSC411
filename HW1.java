package com.example.assignments_cpsc411;

// bshayer88
import android.app.Activity;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class HW1 extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        HorizontalScrollView newClass = new HorizontalScrollView(this);
        setContentView(newClass);

        LinearLayout layoutScreen = new LinearLayout(this);
        LinearLayout.LayoutParams linearPoint = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );
        layoutScreen.setLayoutParams(linearPoint);
        layoutScreen.setOrientation(LinearLayout.VERTICAL);
        layoutScreen.setBackgroundColor(Color.BLACK);
        newClass.addView(layoutScreen);

        // it covers row # 1
        LinearLayout linearClass = new LinearLayout(this);
        linearPoint = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );
        linearClass.setLayoutParams(linearPoint);

        TextView newView = new TextView(this);
        linearPoint = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );
        linearPoint.setMargins(2,0,2,2);
        newView.setLayoutParams(linearPoint);
        newView.setText("1");
        newView.setTextSize(20);
        newView.setPadding(30,0,30,0);
        newView.setTextColor(Color.BLACK);
        newView.setBackgroundColor(Color.LTGRAY);
        linearClass.addView(newView);

        newView = new TextView(this);
        linearPoint = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );
        linearPoint.setMargins(2,0,2,2);
        newView.setLayoutParams(linearPoint);
        newView.setText("Rules void hello1(int hour)");
        newView.setTextSize(20);
        newView.setTextColor(Color.WHITE);
        newView.setBackgroundColor(Color.BLACK);
        newView.setGravity(Gravity.CENTER);
        linearClass.addView(newView);

        layoutScreen.addView(linearClass);

        // it covers row # 2 and 3
        LinearLayout colRow_linearClass = new LinearLayout(this);
        colRow_linearClass.setOrientation(LinearLayout.HORIZONTAL);

        //vertical linear layout for text views "2" and "3"
        linearClass = new LinearLayout(this);
        linearClass.setOrientation(LinearLayout.VERTICAL);
        newView = new TextView(this);
        linearPoint = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );
        linearPoint.setMargins(2,0,2,2);
        newView.setLayoutParams(linearPoint);
        newView.setText("2");
        newView.setTextSize(20);
        newView.setPadding(30,0,30,0);
        newView.setTextColor(Color.BLACK);
        newView.setBackgroundColor(Color.LTGRAY);
        linearClass.addView(newView);
        newView = new TextView(this);
        linearPoint = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );
        linearPoint.setMargins(2,0,2,2);
        newView.setLayoutParams(linearPoint);
        newView.setText("3");
        newView.setTextSize(20);
        newView.setPadding(30,0,30,0);
        newView.setTextColor(Color.BLACK);
        newView.setBackgroundColor(Color.LTGRAY);
        linearClass.addView(newView);
        colRow_linearClass.addView(linearClass);

        //it controls text view for the properties section
        linearClass = new LinearLayout(this);
        linearPoint = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );
        linearPoint.setMargins(2,0,6,2);
        linearClass.setLayoutParams(linearPoint);
        linearClass.setPadding(81,35,82,33);
        linearClass.setBackgroundColor(Color.WHITE);
        linearClass.setGravity(Gravity.CENTER);
        newView = new TextView(this);
        newView.setText("properties");
        newView.setTextSize(20);
        newView.setTextColor(Color.BLACK);
        linearClass.addView(newView);
        colRow_linearClass.addView(linearClass);

        // it sets up vertical linear layout
        // controls text views for name and category section
        linearClass = new LinearLayout(this);
        linearPoint = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );
        linearPoint.weight = 1;
        linearPoint.setMargins(2,0,6,2);
        linearClass.setLayoutParams(linearPoint);
        linearClass.setOrientation(LinearLayout.VERTICAL);
        newView = new TextView(this);
        linearPoint = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );
        linearPoint.setMargins(0,0,0,2);
        newView.setLayoutParams(linearPoint);
        newView.setText("name");
        newView.setTextSize(20);
        newView.setPadding(80,0,80,0);
        newView.setTextColor(Color.BLACK);
        newView.setBackgroundColor(Color.WHITE);
        newView.setGravity(Gravity.CENTER);
        linearClass.addView(newView);

        newView = new TextView(this);
        linearPoint = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );
        linearPoint.setMargins(0,0,0,-5);
        newView.setLayoutParams(linearPoint);
        newView.setText("category");
        newView.setTextSize(20);
        newView.setTextColor(Color.BLACK);
        newView.setBackgroundColor(Color.WHITE);
        newView.setGravity(Gravity.CENTER);
        linearClass.addView(newView);
        colRow_linearClass.addView(linearClass);

        // it sets up vertical linear layout
        // it controls text views for Day, Hour, Day and Time
        linearClass = new LinearLayout(this);
        linearPoint = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );
        linearPoint.weight = 1;
        linearPoint.setMargins(2,0,2,2);
        linearClass.setLayoutParams(linearPoint);
        linearClass.setOrientation(LinearLayout.VERTICAL);
        newView = new TextView(this);
        linearPoint = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );
        linearPoint.setMargins(0,0,0,2);
        newView.setLayoutParams(linearPoint);
        newView.setText("Day Hour Classification");
        newView.setTextSize(20);
        newView.setPadding(10,0,0,0);
        newView.setTextColor(Color.BLACK);
        newView.setBackgroundColor(Color.WHITE);
        linearClass.addView(newView);

        newView = new TextView(this);
        linearPoint = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );
        linearPoint.setMargins(0,0,0,-5);
        newView.setLayoutParams(linearPoint);
        newView.setText("Day and Time");
        newView.setTextSize(20);
        newView.setPadding(10,0,0,0);
        newView.setTextColor(Color.BLACK);
        newView.setBackgroundColor(Color.WHITE);
        linearClass.addView(newView);
        colRow_linearClass.addView(linearClass);

        layoutScreen.addView(colRow_linearClass);

        // it covers row # 4
        linearClass = new LinearLayout(this);

        newView = new TextView(this);
        linearPoint = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );
        linearPoint.setMargins(2,0,2,2);
        newView.setLayoutParams(linearPoint);
        newView.setText("4");
        newView.setTextSize(20);
        newView.setPadding(30,0,30,0);
        newView.setTextColor(Color.BLACK);
        newView.setBackgroundColor(Color.LTGRAY);
        linearClass.addView(newView);

        newView = new TextView(this);
        linearPoint = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );
        linearPoint.setMargins(2,0,6,2);
        newView.setLayoutParams(linearPoint);
        newView.setText("Rule");
        newView.setTextSize(20);
        newView.setPadding(148,0,148,-4);
        newView.setTextColor(Color.BLACK);
        newView.setBackgroundColor(Color.parseColor("#A7FFFA"));
        newView.setGravity(Gravity.CENTER);
        newView.setTypeface(null, Typeface.BOLD);
        linearClass.addView(newView);

        newView = new TextView(this);
        linearPoint = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );
        linearPoint.weight = 2;
        linearPoint.setMargins(2,0,6,2);
        newView.setLayoutParams(linearPoint);
        newView.setText("C1");
        newView.setTextSize(20);
        newView.setPadding(15,0,15,-4);
        newView.setTextColor(Color.BLACK);
        newView.setBackgroundColor(Color.parseColor("#A7FFFA"));
        newView.setGravity(Gravity.CENTER);
        newView.setTypeface(null, Typeface.BOLD);
        linearClass.addView(newView);

        newView = new TextView(this);
        linearPoint = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );
        linearPoint.weight = 3;
        linearPoint.setMargins(2,0,2,2);
        newView.setLayoutParams(linearPoint);
        newView.setText("A1");
        newView.setTextSize(20);
        newView.setPadding(0,0,0,-4);
        newView.setTextColor(Color.BLACK);
        newView.setBackgroundColor(Color.parseColor("#A7FFFA"));
        newView.setGravity(Gravity.CENTER);
        newView.setTypeface(null, Typeface.BOLD);
        linearClass.addView(newView);

        layoutScreen.addView(linearClass);

        // it covers row # 5
        linearClass = new LinearLayout(this);

        newView = new TextView(this);
        linearPoint = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );
        linearPoint.setMargins(2,0,2,2);
        newView.setLayoutParams(linearPoint);
        newView.setText("5");
        newView.setTextSize(20);
        newView.setPadding(30,0,30,0);
        newView.setTextColor(Color.BLACK);
        newView.setBackgroundColor(Color.LTGRAY);
        linearClass.addView(newView);

        newView = new TextView(this);
        linearPoint = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );
        linearPoint.setMargins(2,0,6,2);
        newView.setLayoutParams(linearPoint);
        newView.setText("");
        newView.setTextSize(20);
        newView.setPadding(200,0,200,0);
        newView.setTextColor(Color.parseColor("#A7FFFA"));
        newView.setBackgroundColor(Color.parseColor("#A7FFFA"));
        newView.setGravity(Gravity.CENTER);
        linearClass.addView(newView);

        newView = new TextView(this);
        linearPoint = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );
        linearPoint.setMargins(2,0,6,2);
        newView.setLayoutParams(linearPoint);
        newView.setText("min <= hour && hour <= max");
        newView.setTextSize(20);
        newView.setPadding(10,0,10,0);
        newView.setTextColor(Color.BLACK);
        newView.setBackgroundColor(Color.parseColor("#A7FFFA"));
        newView.setGravity(Gravity.CENTER);
        linearClass.addView(newView);

        newView = new TextView(this);
        linearPoint = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );
        linearPoint.setMargins(2,0,2,2);
        newView.setLayoutParams(linearPoint);
        newView.setText("System.out.println(greeting + \", World!\")");
        newView.setTextSize(20);
        newView.setPadding(10,0,10,0);
        newView.setTextColor(Color.BLACK);
        newView.setBackgroundColor(Color.parseColor("#A7FFFA"));
        newView.setGravity(Gravity.CENTER);
        linearClass.addView(newView);

        layoutScreen.addView(linearClass);

        // it covers row # 6
        linearClass = new LinearLayout(this);

        newView = new TextView(this);
        linearPoint = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );
        linearPoint.setMargins(2,0,2,2);
        newView.setLayoutParams(linearPoint);
        newView.setText("6");
        newView.setTextSize(20);
        newView.setPadding(30,0,30,0);
        newView.setTextColor(Color.BLACK);
        newView.setBackgroundColor(Color.LTGRAY);
        linearClass.addView(newView);

        newView = new TextView(this);
        linearPoint = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );
        linearPoint.setMargins(2,0,6,2);
        newView.setLayoutParams(linearPoint);
        newView.setText("");
        newView.setTextSize(20);
        newView.setPadding(200,0,200,-4);
        newView.setTextColor(Color.parseColor("#A7FFFA"));
        newView.setBackgroundColor(Color.parseColor("#A7FFFA"));
        newView.setGravity(Gravity.CENTER);
        linearClass.addView(newView);

        newView = new TextView(this);
        linearPoint = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );
        linearPoint.weight = 1;
        linearPoint.setMargins(2,0,2,2);
        newView.setLayoutParams(linearPoint);
        newView.setText("int min");
        newView.setTextSize(20);
        newView.setPadding(10,0,10,-4);
        newView.setTextColor(Color.BLACK);
        newView.setBackgroundColor(Color.parseColor("#A7FFFA"));
        newView.setGravity(Gravity.CENTER);
        linearClass.addView(newView);

        newView = new TextView(this);
        linearPoint = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );
        linearPoint.weight = 1;
        linearPoint.setMargins(2,0,6,2);
        newView.setLayoutParams(linearPoint);
        newView.setText("int max");
        newView.setTextSize(20);
        newView.setPadding(10,0,10,-4);
        newView.setTextColor(Color.BLACK);
        newView.setBackgroundColor(Color.parseColor("#A7FFFA"));
        newView.setGravity(Gravity.CENTER);
        linearClass.addView(newView);

        newView = new TextView(this);
        linearPoint = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );
        linearPoint.weight = 4;
        linearPoint.setMargins(2,0,2,2);
        newView.setLayoutParams(linearPoint);
        newView.setText("String greeting");
        newView.setTextSize(20);
        newView.setPadding(0,0,0,-4);
        newView.setTextColor(Color.BLACK);
        newView.setBackgroundColor(Color.parseColor("#A7FFFA"));
        newView.setGravity(Gravity.CENTER);
        linearClass.addView(newView);

        layoutScreen.addView(linearClass);

        // it covers row # 7
        linearClass = new LinearLayout(this);

        newView = new TextView(this);
        linearPoint = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );
        linearPoint.setMargins(2,0,2,2);
        newView.setLayoutParams(linearPoint);
        newView.setText("7");
        newView.setTextSize(20);
        newView.setPadding(30,0,30,0);
        newView.setTextColor(Color.BLACK);
        newView.setBackgroundColor(Color.LTGRAY);
        linearClass.addView(newView);

        newView = new TextView(this);
        linearPoint = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );
        linearPoint.setMargins(2,0,6,2);
        newView.setLayoutParams(linearPoint);
        newView.setText("Rule");
        newView.setTextSize(20);
        newView.setPadding(10,0,286,-4);
        newView.setTypeface(null, Typeface.BOLD);
        newView.setTextColor(Color.BLACK);
        newView.setBackgroundColor(Color.WHITE);
        linearClass.addView(newView);

        newView = new TextView(this);
        linearPoint = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );
        linearPoint.weight = 1;
        linearPoint.setMargins(2,0,2,2);
        newView.setLayoutParams(linearPoint);
        newView.setText("From");
        newView.setTextSize(20);
        newView.setPadding(10,0,18,-4);
        newView.setTypeface(null, Typeface.BOLD);
        newView.setTextColor(Color.BLACK);
        newView.setBackgroundColor(Color.parseColor("#FFF78C"));
        linearClass.addView(newView);

        newView = new TextView(this);
        linearPoint = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );
        linearPoint.weight = 1;
        linearPoint.setMargins(2,0,6,2);
        newView.setLayoutParams(linearPoint);
        newView.setText("To");
        newView.setTextSize(20);
        newView.setPadding(10,0,94,-4);
        newView.setTypeface(null, Typeface.BOLD);
        newView.setTextColor(Color.BLACK);
        newView.setBackgroundColor(Color.parseColor("#FFF78C"));
        linearClass.addView(newView);

        newView = new TextView(this);
        linearPoint = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );
        linearPoint.weight = 4;
        linearPoint.setMargins(2,0,2,2);
        newView.setLayoutParams(linearPoint);
        newView.setText("Greeting");
        newView.setTextSize(20);
        newView.setPadding(10,0,0,-4);
        newView.setTypeface(null, Typeface.BOLD);
        newView.setTextColor(Color.BLACK);
        newView.setBackgroundColor(Color.parseColor("#FFCD7E"));
        linearClass.addView(newView);

        layoutScreen.addView(linearClass);

        // it covers row # 8
        linearClass = new LinearLayout(this);

        newView = new TextView(this);
        linearPoint = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );
        linearPoint.setMargins(2,0,2,2);
        newView.setLayoutParams(linearPoint);
        newView.setText("8");
        newView.setTextSize(20);
        newView.setPadding(30,0,30,0);
        newView.setTextColor(Color.BLACK);
        newView.setBackgroundColor(Color.LTGRAY);
        linearClass.addView(newView);

        newView = new TextView(this);
        linearPoint = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );
        linearPoint.setMargins(2,0,6,2);
        newView.setLayoutParams(linearPoint);
        newView.setText("R10");
        newView.setTextSize(20);
        newView.setPadding(10,0,300,0);
        newView.setTextColor(Color.BLACK);
        newView.setBackgroundColor(Color.WHITE);
        newView.setGravity(Gravity.CENTER);
        linearClass.addView(newView);

        newView = new TextView(this);
        linearPoint = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );
        linearPoint.weight = 1;
        linearPoint.setMargins(2,0,2,2);
        newView.setLayoutParams(linearPoint);
        newView.setText("0");
        newView.setTextSize(20);
        newView.setPadding(92,0,10,0);
        newView.setTextColor(Color.BLACK);
        newView.setBackgroundColor(Color.parseColor("#FFF78C"));
        newView.setGravity(Gravity.RIGHT);
        linearClass.addView(newView);

        newView = new TextView(this);
        linearPoint = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );
        linearPoint.weight = 1;
        linearPoint.setMargins(2,0,6,2);
        newView.setLayoutParams(linearPoint);
        newView.setText("11");
        newView.setTextSize(20);
        newView.setPadding(75,0,10,0);
        newView.setTextColor(Color.BLACK);
        newView.setBackgroundColor(Color.parseColor("#FFF78C"));
        newView.setGravity(Gravity.RIGHT);
        linearClass.addView(newView);

        newView = new TextView(this);
        linearPoint = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );
        linearPoint.weight = 3;
        linearPoint.setMargins(2,0,2,2);
        newView.setLayoutParams(linearPoint);
        newView.setText("Good Morning");
        newView.setTextSize(20);
        newView.setPadding(10,0,0,0);
        newView.setTextColor(Color.BLACK);
        newView.setBackgroundColor(Color.parseColor("#FFCD7E"));
        linearClass.addView(newView);

        layoutScreen.addView(linearClass);

        // it covers row # 9
        linearClass = new LinearLayout(this);

        newView = new TextView(this);
        linearPoint = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );
        linearPoint.setMargins(2,0,2,2);
        newView.setLayoutParams(linearPoint);
        newView.setText("9");
        newView.setTextSize(20);
        newView.setPadding(30,0,30,0);
        newView.setTextColor(Color.BLACK);
        newView.setBackgroundColor(Color.LTGRAY);
        linearClass.addView(newView);

        newView = new TextView(this);
        linearPoint = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );
        linearPoint.setMargins(2,0,6,2);
        newView.setLayoutParams(linearPoint);
        newView.setText("R20");
        newView.setTextSize(20);
        newView.setPadding(10,0,300,0);
        newView.setTextColor(Color.BLACK);
        newView.setBackgroundColor(Color.WHITE);
        newView.setGravity(Gravity.CENTER);
        linearClass.addView(newView);

        newView = new TextView(this);
        linearPoint = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );
        linearPoint.weight = 1;
        linearPoint.setMargins(2,0,2,2);
        newView.setLayoutParams(linearPoint);
        newView.setText("12");
        newView.setTextSize(20);
        newView.setPadding(76,0,10,0);
        newView.setTextColor(Color.BLACK);
        newView.setBackgroundColor(Color.parseColor("#FFF78C"));
        newView.setGravity(Gravity.RIGHT);
        linearClass.addView(newView);

        newView = new TextView(this);
        linearPoint = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );
        linearPoint.weight = 1;
        linearPoint.setMargins(2,0,6,2);
        newView.setLayoutParams(linearPoint);
        newView.setText("17");
        newView.setTextSize(20);
        newView.setPadding(88,0,10,0);
        newView.setTextColor(Color.BLACK);
        newView.setBackgroundColor(Color.parseColor("#FFF78C"));
        newView.setGravity(Gravity.RIGHT);
        linearClass.addView(newView);

        newView = new TextView(this);
        linearPoint = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );
        linearPoint.weight = 3;
        linearPoint.setMargins(2,0,2,2);
        newView.setLayoutParams(linearPoint);
        newView.setText("Good Afternoon");
        newView.setTextSize(20);
        newView.setPadding(10,0,0,0);
        newView.setTextColor(Color.BLACK);
        newView.setBackgroundColor(Color.parseColor("#FFCD7E"));
        linearClass.addView(newView);

        layoutScreen.addView(linearClass);

        // it covers row # 10
        linearClass = new LinearLayout(this);

        newView = new TextView(this);
        linearPoint = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );
        linearPoint.setMargins(2,0,2,2);
        newView.setLayoutParams(linearPoint);
        newView.setText("10");
        newView.setTextSize(20);
        newView.setPadding(15,0,16,0);
        newView.setTextColor(Color.BLACK);
        newView.setBackgroundColor(Color.LTGRAY);
        linearClass.addView(newView);

        newView = new TextView(this);
        linearPoint = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );
        linearPoint.setMargins(2,0,6,2);
        newView.setLayoutParams(linearPoint);
        newView.setText("R30");
        newView.setTextSize(20);
        newView.setPadding(10,0,300,0);
        newView.setTextColor(Color.BLACK);
        newView.setBackgroundColor(Color.WHITE);
        newView.setGravity(Gravity.CENTER);
        linearClass.addView(newView);

        newView = new TextView(this);
        linearPoint = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );
        linearPoint.weight = 1;
        linearPoint.setMargins(2,0,2,2);
        newView.setLayoutParams(linearPoint);
        newView.setText("18");
        newView.setTextSize(20);
        newView.setPadding(59,0,10,0);
        newView.setTextColor(Color.BLACK);
        newView.setBackgroundColor(Color.parseColor("#FFF78C"));
        newView.setGravity(Gravity.RIGHT);
        linearClass.addView(newView);

        newView = new TextView(this);
        linearPoint = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );
        linearPoint.weight = 1;
        linearPoint.setMargins(2,0,6,2);
        newView.setLayoutParams(linearPoint);
        newView.setText("21");
        newView.setTextSize(20);
        newView.setPadding(71,0,10,0);
        newView.setTextColor(Color.BLACK);
        newView.setBackgroundColor(Color.parseColor("#FFF78C"));
        newView.setGravity(Gravity.RIGHT);
        linearClass.addView(newView);

        newView = new TextView(this);
        linearPoint = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );
        linearPoint.weight = 3;
        linearPoint.setMargins(2,0,2,2);
        newView.setLayoutParams(linearPoint);
        newView.setText("Good Evening");
        newView.setTextSize(20);
        newView.setPadding(10,0,0,0);
        newView.setTextColor(Color.BLACK);
        newView.setBackgroundColor(Color.parseColor("#FFCD7E"));
        linearClass.addView(newView);

        layoutScreen.addView(linearClass);

        // it covers row # 11
        linearClass = new LinearLayout(this);

        newView = new TextView(this);
        linearPoint = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );
        linearPoint.setMargins(2,0,2,2);
        newView.setLayoutParams(linearPoint);
        newView.setText("11");
        newView.setTextSize(20);
        newView.setPadding(15,0,16,0);
        newView.setTextColor(Color.BLACK);
        newView.setBackgroundColor(Color.LTGRAY);
        linearClass.addView(newView);

        newView = new TextView(this);
        linearPoint = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );
        linearPoint.setMargins(2,0,6,2);
        newView.setLayoutParams(linearPoint);
        newView.setText("R40");
        newView.setTextSize(20);
        newView.setPadding(10,0,300,-6);
        newView.setTextColor(Color.BLACK);
        newView.setBackgroundColor(Color.WHITE);
        newView.setGravity(Gravity.CENTER);
        linearClass.addView(newView);

        newView = new TextView(this);
        linearPoint = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );
        linearPoint.weight = 1;
        linearPoint.setMargins(2,0,2,2);
        newView.setLayoutParams(linearPoint);
        newView.setText("22");
        newView.setTextSize(20);
        newView.setPadding(40,0,10,-6);
        newView.setTextColor(Color.BLACK);
        newView.setBackgroundColor(Color.parseColor("#FFF78C"));
        newView.setGravity(Gravity.RIGHT);
        linearClass.addView(newView);

        newView = new TextView(this);
        linearPoint = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );
        linearPoint.weight = 1;
        linearPoint.setMargins(2,0,6,2);
        newView.setLayoutParams(linearPoint);
        newView.setText("23");
        newView.setTextSize(20);
        newView.setPadding(52,0,10,-6);
        newView.setTextColor(Color.BLACK);
        newView.setBackgroundColor(Color.parseColor("#FFF78C"));
        newView.setGravity(Gravity.RIGHT);
        linearClass.addView(newView);

        newView = new TextView(this);
        linearPoint = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );
        linearPoint.weight = 3;
        linearPoint.setMargins(2,0,2,2);
        newView.setLayoutParams(linearPoint);
        newView.setText("Good Night");
        newView.setTextSize(20);
        newView.setPadding(10,0,0,-6);
        newView.setTextColor(Color.BLACK);
        newView.setBackgroundColor(Color.parseColor("#FFCD7E"));
        linearClass.addView(newView);

        layoutScreen.addView(linearClass);
    }
}
