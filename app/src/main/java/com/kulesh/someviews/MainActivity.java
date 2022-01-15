package com.kulesh.someviews;

import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void pressSwitch(View view) {
        final Switch button=findViewById(R.id.swi);
        TextView tv=findViewById(R.id.txt);
        button.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    Toast.makeText(getApplicationContext(), "ON", Toast.LENGTH_SHORT).show();
                    tv.setText("On");
                }else{
                    Toast.makeText(getApplicationContext(), "OFF", Toast.LENGTH_SHORT).show();
                    tv.setText("Off");
                }
            }
        });
    }

    public void presstoggle(View view) {
        final ToggleButton button=findViewById(R.id.toggle);
        TextView tv=findViewById(R.id.txt);
        button.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    Toast.makeText(getApplicationContext(), "ON", Toast.LENGTH_SHORT).show();
                    tv.setText("On");
                }else{
                    Toast.makeText(getApplicationContext(), "OFF", Toast.LENGTH_SHORT).show();
                    tv.setText("Off");
                }
            }
        });
    }

    public void floating(View view) {
        FloatingActionButton fv=findViewById(R.id.floatingac);
        fv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Right", Toast.LENGTH_SHORT).show();
                TextView tv=findViewById(R.id.txt);
                tv.setText("float");
            }
        });
    }

    public void opensnack(View view) {
        CoordinatorLayout c=findViewById(R.id.coordinatorOne);
        Snackbar snackbar=Snackbar.make(c,"This view up",Snackbar.LENGTH_SHORT);
        View.OnClickListener listener=new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView tv=findViewById(R.id.txt);
                tv.setText("Empty");
            }
        };snackbar.setAction("Undo",listener);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            snackbar.setActionTextColor(getColor(R.color.black));
        }
        snackbar.show();
    }
}