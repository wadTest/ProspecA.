package com.example.watsana.prospec.bank_ghb;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioGroup;

import com.example.watsana.prospec.R;

public class BankGHB10Activity extends AppCompatActivity {

    private View contenedorParticular;
    private View contenedorCorporativo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bank_ghb10);

        contenedorParticular = findViewById(R.id.ll_contenedor_particular);
        contenedorCorporativo = findViewById(R.id.ll_contenedor_corporativo);

        RadioGroup opcionesCliente = (RadioGroup)findViewById(R.id.rg_tipo_cliente);
        opcionesCliente.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.rb_particular:
                        mostrarParticular(true);
                        break;
                    case R.id.rb_corporativo:
                        mostrarParticular(false);
                        break;
                }
            }
        });
    }

    private void mostrarParticular(boolean b) {
        contenedorParticular.setVisibility(b ? View.VISIBLE : View.GONE);
        contenedorCorporativo.setVisibility(b ? View.GONE : View.VISIBLE);
    }

}