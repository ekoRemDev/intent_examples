package net.iotinn.intentexamples;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
    }


    @Override
    public void onBackPressed() {

        Intent data = new Intent();
        data.putExtra("returnKey1", "Swinging on a star. ");
        // Activity finished ok, return the data
        setResult(RESULT_OK, data);

        super.onBackPressed();
    }
}
