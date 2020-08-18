package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openactivity_second();
            }
        });

        public void openactivity_second(){
            Intent intent = new Intent(this, SecondActivity.class);
            startActivity(intent);
        }

        @Override
        protected void onCreate(Bundle savedInstanceState)
        { super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);//Creating the LayoutInflater instance

            LayoutInflater li = getLayoutInflater();//Getting the View object as defined in the customtoast.xml file

            View layout = li.inflate(R.layout.customtoast, (ViewGroup)
                    findViewById(R.id.custom_toast_layout));//Creating the Toast object
            Toast toast = new Toast(getApplicationContext());

            toast.setDuration(Toast.LENGTH_SHORT);

            toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);

            toast.setView(layout);//setting the view of custom toast layout

            toast.show();
        }

        Context context = getApplicationContext(); //The context to
        use. Usually your Application or Activity object
        CharSequence message = "You just clicked the OK button";
//Display string
        int duration = Toast.LENGTH_SHORT; //How long the toast
        message will lasts
        Toast toast = Toast.makeText(context, message, duration);
        toast.show();



    }


}