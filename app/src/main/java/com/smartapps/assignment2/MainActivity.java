package com.smartapps.assignment2;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
    Button b1;
    Button b2;
    Button b3;
    EditText editText;
    EditText editText1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button) findViewById(R.id.Launch);
        b2 = (Button) findViewById(R.id.Ring);
        b3 =(Button) findViewById(R.id.CloseApp);
        editText=(EditText)findViewById(R.id.editText);
        editText1=(EditText)findViewById(R.id.phone);
        b1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse(editText.getText().toString()));
                startActivity(i);


            }
        });
        b2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent i=new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+editText1.getText().toString()));
                startActivity(i);


            }
        });
        b3.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                MainActivity.this.finish();


            }
        });
}
}
