package com.example.watsana.prospec.bank_ghb;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.watsana.prospec.R;
import com.example.watsana.prospec.Test_RedioButton;

public class LoginActivity extends AppCompatActivity {

    private CardView cardUser, cardUser1, cardUser2, cardPower, cardPower1, cardPower2,cardSungK,cardSungK1,cardSungK2;
    private Button button1;
    private EditText EditTexFai,EditTexSaka,EditTexSoon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        cardUser = (CardView) findViewById(R.id.cardUser);
        cardUser1 = (CardView) findViewById(R.id.cardUser1);
        cardUser2 = (CardView) findViewById(R.id.cardUser2);
        cardPower = (CardView) findViewById(R.id.cardPower);
        cardPower1 = (CardView) findViewById(R.id.cardPower1);
        cardPower2 = (CardView) findViewById(R.id.cardPower2);

    }

    public void checkboxLogin(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        switch (view.getId()) {
            case R.id.checkbox1:
                if (!checked)
                    cardUser.setVisibility(View.GONE);
                else
                    cardUser.setVisibility(View.VISIBLE);
                break;
            case R.id.checkbox2:
                if (!checked)
                    cardUser1.setVisibility(View.GONE);
                else
                    cardUser1.setVisibility(View.VISIBLE);
                break;
            case R.id.checkbox3:
                if (!checked)
                    cardUser2.setVisibility(View.GONE);
                else
                    cardUser2.setVisibility(View.VISIBLE);
                break;

            case R.id.checkbox4:
                if (!checked)
                    cardPower.setVisibility(View.GONE);
                else
                    cardPower.setVisibility(View.VISIBLE);
                break;
            case R.id.checkbox5:
                if (!checked)
                    cardPower1.setVisibility(View.GONE);
                else
                    cardPower1.setVisibility(View.VISIBLE);
                break;
            case R.id.checkbox6:
                if (!checked)
                    cardPower2.setVisibility(View.GONE);
                else
                    cardPower2.setVisibility(View.VISIBLE);
                break;
        }

        EditTexFai = (EditText) findViewById(R.id.EditTexFai);
        EditTexSaka = (EditText) findViewById(R.id.EditTexSaka);
        EditTexSoon = (EditText) findViewById(R.id.EditTexSoon);
    }

    public void redioLogin (View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch(view.getId()) {
            case R.id.RadioButton1:
                if (checked)
                    EditTexFai.setVisibility(View.GONE);
                else
                    EditTexFai.setVisibility(View.VISIBLE);
                break;

            case R.id.RadioButton2:
                if (checked)
                    EditTexSaka.setVisibility(View.GONE);
                else
                    EditTexSaka.setVisibility(View.VISIBLE);
                break;

            case R.id.RadioButton3:
                if (checked)
                    EditTexSoon.setVisibility(View.GONE);
                else
                    EditTexSoon.setVisibility(View.VISIBLE);
                break;


        }

//      Bind Widget
        button1 = (Button) findViewById(R.id.button1);

//      Get Event From Click Menu Bank
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this, MenuBanksActivity.class));
            }
        });


    } // Main Method
} //Main Class