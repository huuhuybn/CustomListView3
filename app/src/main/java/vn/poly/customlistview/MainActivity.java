package vn.poly.customlistview;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    private EditText edtNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtNumber = findViewById(R.id.edtNumber);
    }

    public void openNew(View view) {
        Intent intent = new Intent(MainActivity.this, SubActivity.class);

        String number = edtNumber.getText().toString();



        Bundle bundle = new Bundle();

        bundle.putString("number", number);

        intent.putExtra("data", bundle);


        startActivity(intent);

    }

    public void openLink(View view) {


        Intent intent  = new Intent(Intent.ACTION_VIEW, Uri.parse("https://vnexpress.net"));
        startActivity(intent);


    }

    public void openCall(View view) {

        Intent intent  = new Intent(Intent.ACTION_CALL, Uri.parse("tel:0919030190"));
        startActivity(intent);

    }
}
