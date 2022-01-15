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

import org.w3c.dom.Text;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void tog(View view) {
        ToggleButton t=findViewById(R.id.toggle);
        TextView tv=findViewById(R.id.txt);
        t.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    Toast.makeText(getApplicationContext(), "On", Toast.LENGTH_SHORT).show();
                    tv.setText("On");
                }else{
                    Toast.makeText(getApplicationContext(), "Off", Toast.LENGTH_SHORT).show();
                    tv.setText("Off");
                }
            }
        });
    }

    public void swicthinbetween(View view) {
        Switch s=findViewById(R.id.swi);
        TextView tv=findViewById(R.id.txt);
        s.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    Toast.makeText(getApplicationContext(), "Switch On", Toast.LENGTH_SHORT).show();
                    tv.setText("Swicth On");
                }else{
                    Toast.makeText(getApplicationContext(), "Swicth Off", Toast.LENGTH_SHORT).show();
                    tv.setText("Swicth Off");
                }
            }
        });
    }

    public void floating(View view) {
        FloatingActionButton v=findViewById(R.id.flow);
        TextView tv=findViewById(R.id.txt);
        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Floating button working", Toast.LENGTH_SHORT).show();
                tv.setText("Floating Button working!!!");
            }
        });
    }

    public void useSnack(View view) {
        CoordinatorLayout c=findViewById(R.id.cooo);
        Snackbar snackbar=Snackbar.make(c,"Text view up",Snackbar.LENGTH_SHORT);
        View.OnClickListener listener=new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView tv=findViewById(R.id.txt);

                tv.setText("You pressed the snackbar");
            }
        };snackbar.setAction("Undo",listener);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            snackbar.setActionTextColor(getColor(R.color.black));
        }
        snackbar.show();
    }
}