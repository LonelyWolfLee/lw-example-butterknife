package pro.lonelywolf.example.butterknife.recycler;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import pro.lonelywolf.example.butterknife.R;

public class RecyclerViaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);
    }
}
