package com.huwei.calculate;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView mTextView;
    private int mResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int var1 = 1;
        int var2 = 2;
        mResult = jiafa(var1, var2);

        mTextView = findViewById(R.id.tv_result);
        Button button = findViewById(R.id.btn_click);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mTextView.setText("var1 + var2 = " + mResult);
            }
        });
    }

    private int jiafa(int i, int j) {
        return (i + j);
    }
}
