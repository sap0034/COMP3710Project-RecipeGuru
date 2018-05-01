package edu.auburn.eng.csse.comp3710.a2b2b.recipeguruapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import edu.auburn.eng.csse.comp3710.a2b2b.recipeguruapp.R;

public class MainActivity extends Activity {

    DataDB data = new DataDB();
    TextView txtName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtName = (TextView)findViewById(R.id.txtName);

        txtName.setText(data.getNameDB(MainActivity.this));
    }

}
