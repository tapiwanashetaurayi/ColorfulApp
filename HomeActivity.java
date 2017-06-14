package googleplayservices.samples.android.treehouse.com.colourful2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {
    private Button startButton;
    private TextView nameTextView;
    private String mName;
    private Button updatesButton;
    private Button articlesButton;
public static final String TAG = HomeActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        startButton = (Button)findViewById(R.id.startSearch);
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startSchoolSearch();
            }
        });

        final Intent intent = getIntent();
        mName = intent.getStringExtra(getString(R.string.key_name));
        if (mName == null || mName.isEmpty()){
            mName = "Friend";
        }

        Log.d(TAG, mName);
        nameTextView = (TextView) findViewById(R.id.nameTextView);
        updatesButton = (Button) findViewById(R.id.updatesButton);
        articlesButton = (Button) findViewById(R.id.articlesButton);

        nameTextView.setText("Way to go");
        nameTextView.setText(mName);

       updatesButton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               startUpdate();
           }
       });
        articlesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startArticle();
            }
        });
    }

    private void startArticle() {
        Intent intent = new Intent(this, ArticlesActivity.class);
        startActivity(intent);
    }

    private void startUpdate() {
        Intent intent = new Intent(this, UpdatesActivity.class);
        startActivity(intent);
    }

    private void startSchoolSearch() {
        Intent intent = new Intent(this, SchoolsActivity.class);
        startActivity(intent);

    }
}
