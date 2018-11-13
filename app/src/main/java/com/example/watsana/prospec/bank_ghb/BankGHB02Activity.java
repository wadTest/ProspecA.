package com.example.watsana.prospec.bank_ghb;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;

import com.example.watsana.prospec.R;

public class BankGHB02Activity extends AppCompatActivity {

    //    LinearLayout หลัก
    private View LinearLayout1;
    //    LinearLayout ย่อยในกลุ่ม
    private View LinearYes, LinearNo;
    private EditText EditText5, EditText6, EditText7, EditText8, EditText9;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bank_ghb02);

        LinearLayout1 = findViewById(R.id.LinearLayout1);

        RadioGroup redioGroup1 = (RadioGroup) findViewById(R.id.redioGroup1);
        redioGroup1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.redioButton1:
                        mostrarParticular(true);
                        break;
                    case R.id.redioButton2:
                        mostrarParticular(false);
                        break;
//                    case R.id.redioButton3:
//                        mostrarParticular(false);
//                        break;
//                    case R.id.redioButton4:
//                        mostrarParticular(false);
//                        break;
//                    case R.id.redioButton5:
//                        mostrarParticular(false);
//                        break;
//                    case R.id.redioButton6:
//                        mostrarParticular(false);
//                        break;
//                    case R.id.redioButton7:
//                        mostrarParticular(false);
//                        break;
//                    case R.id.redioButton8:
//                        mostrarParticular(false);
//                        break;
//                    case R.id.redioButton9:
//                        mostrarParticular(false);
//                        break;
                }
            }
        });
    }

    private void mostrarParticular(boolean b) {
        LinearLayout1.setVisibility(b ? View.VISIBLE : View.GONE);

//    กลุ่มย่อยของ Redio Button ที่1
        LinearNo = findViewById(R.id.LinearNo);
        LinearYes = findViewById(R.id.LinearYes);

        RadioGroup redioGroup2 = (RadioGroup) findViewById(R.id.redioGroup2);
        redioGroup2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.redioButton10:
                        mostrarParticular1(false);
                        break;
                    case R.id.redioButton11:
                        mostrarParticular1(true);
                        break;
                }
            }
        });
    }

    private void mostrarParticular1(boolean b) {
        LinearNo.setVisibility(b ? View.VISIBLE : View.GONE);
        LinearYes.setVisibility(b ? View.GONE : View.VISIBLE);




//      Prapet Spinner กิจกรรม
            KitSpinner();


//      Dam Spinner ผู้ดำเนินการ
            DamSpinner();

//      Tidto Spinner ผู้รับการติดต่อ
            TidtoSpinner();
        }


    //  กิจกรรม
    private void KitSpinner() {
        Spinner spinner = findViewById(R.id.spinner1);
        String[] strings = new String[]{"เลือก กิจกรรม","รับเรื่อง", "นัดหมาย 1", "นัดหมาย", "นำชี้"};
        ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<String>(BankGHB02Activity.this,
                android.R.layout.simple_list_item_1, strings);
        spinner.setAdapter(stringArrayAdapter);
    }

//  ผู้ดำเนินการ
    private void DamSpinner() {
        Spinner spinner = findViewById(R.id.spinner2);
        String[] strings = new String[]{"เลือก ผู้ดำเนินการ","สินเชื่อ", "ประเมิน", "ธุรการ"};
        ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<String>(BankGHB02Activity.this,
                android.R.layout.simple_list_item_1, strings);
        spinner.setAdapter(stringArrayAdapter);
    }

//  ผู้รับการติดต่อ
        private void TidtoSpinner() {
            Spinner spinner = findViewById(R.id.spinner3);
            String[] strings = new String[]{"เลือก ผู้รับการติดต่อ","ลูกค้า","ไม่ใช่ลูกค้า"};
        ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<String>(BankGHB02Activity.this,
                android.R.layout.simple_list_item_1, strings);
        spinner.setAdapter(stringArrayAdapter);
    }

}

