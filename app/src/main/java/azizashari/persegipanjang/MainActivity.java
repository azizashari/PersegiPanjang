package azizashari.persegipanjang;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public  void bHitung (View v){
        EditText etPanjang = (EditText) findViewById(R.id.etPanjang);
        EditText etLebar = (EditText) findViewById(R.id.etLebar);
        TextView tvHasil = (TextView) findViewById(R.id.tvHasil);

        //deklarasi double
        double dbPanjang, dbLebar;

        if(etPanjang.getText().toString().equals("")) {
            dbPanjang = 0;
        }else{
            dbPanjang = Double.valueOf(etPanjang.getText().toString());
        }

        if(etLebar.getText().toString().equals("")){
            dbLebar = 0;
        }
        else {
            dbLebar = Double.valueOf(etLebar.getText().toString());
        }
        double dbLuas = dbPanjang * dbLebar;

        String.valueOf(dbLuas);
        tvHasil.setText("Luas = " + dbLuas);

    }
}
