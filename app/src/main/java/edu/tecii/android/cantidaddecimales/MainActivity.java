package edu.tecii.android.cantidaddecimales;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button  Convertir;
    private EditText NumeDecimal;
    private TextView hora,mins,segs,desegs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        NumeDecimal=(EditText)findViewById(R.id.edt1);
        Convertir=(Button)findViewById(R.id.btn1);
        hora=(TextView)findViewById(R.id.txt2);
        mins=(TextView)findViewById(R.id.txt3);
        segs=(TextView)findViewById(R.id.txt4);
        desegs=(TextView)findViewById(R.id.txt5);


    }
        public void ConverDecimal(View view) {
            String numereal = NumeDecimal.getText().toString();
            int hor, min, seg, dseg;
            double nro1 = Double.parseDouble(numereal);
            hor = (int) (nro1);
            nro1 = (nro1 - hor) * 60;
            min = (int) (nro1);
            nro1 = (nro1 - min) * 60;
            seg = (int) (nro1);
            nro1 = (nro1 - seg) * 60;
            dseg = (int) (nro1);

            String resu = "";
            String resu1 = "";
            String resu2 = "";
            String resu3 = "";

            resu = "El total de Horas es: " + hor + "\n";
            resu1 = "El total de Minuto es: " + min + "\n";
            resu2 = "El total de Segundos es: " + seg + "\n";
            resu3 = "El total de Decimos de sengundos es: " + dseg + "\n";

            hora.setText(resu);
            mins.setText(resu1);
            segs.setText(resu2);
            desegs.setText(resu3);

        }


}
