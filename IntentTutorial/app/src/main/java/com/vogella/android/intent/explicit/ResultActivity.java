package com.vogella.android.intent.explicit;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class ResultActivity extends Activity {

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_result);

        Bundle extras = getIntent().getExtras();
        String toBeShownText = extras.getString("mainText");

        TextView textView = (TextView) findViewById(R.id.displayintentextra);
        textView.setText(toBeShownText);
    }

    @Override
    public void finish() {

        Intent intent = new Intent();

        EditText et = (EditText) findViewById(R.id.returnValue);
        String returnText = et.getText().toString();

        intent.putExtra("returnString", returnText);

        setResult(RESULT_OK, intent);

        super.finish();
    }
} 