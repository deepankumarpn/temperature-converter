package dev.spooke.tempcon;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText temp_f;
    TextView temp_c;
    Button btn_convert;

    String str;
    int x,temp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        temp_f = (EditText) findViewById(R.id.temp_f);
        btn_convert = (Button) findViewById(R.id.btn_convert);
        temp_c = (TextView) findViewById(R.id.temp_c);



        btn_convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (temp_f.getText().length() == 0){
                    Toast.makeText(MainActivity.this, "Please enter the value", Toast.LENGTH_SHORT).show();
                    temp_c.setText("Celsius");
                }else {
                    String input = temp_f.getText().toString();
                    temp = Integer.parseInt(input);
                    float celsius = (temp - 32) * ((float) 5 / (float) 9);
                    temp_c.setText(celsius + " degrees Celsius");
                }
            }
        });

    }
}
