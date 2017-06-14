package googleplayservices.samples.android.treehouse.com.colourful2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class ArticlesActivity extends AppCompatActivity {
    private TextView articleTextView;
    private TextView dateTextView;
    private Button articleButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_articles);

        dateTextView = (TextView) findViewById(R.id.dateTextView);
        articleTextView = (TextView) findViewById(R.id.articleTextView);
        articleButton = (Button) findViewById(R.id.articleButton);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String[] facts = {
                        "Sharon Gopfa studied basics in graphic design and has a vast idea on how to design and layout content. She has learnt to think creatively to produce new ideas and concepts; proofread to produce accurate and high-quality work. Having acquired more skill in web designing she has knowledge in creating the website, drawing up detailed website specifications, designing graphics, coding and editing content.",
                        "Mitchelle Mkhwananzi is an aspiring law student who completed A law students’ toolkit with Coursera. She has acquired skills on designing the website's layout, writing and editing web content as well as editing images.",
                        "Tapiwanashe Taurai brings experience and vast knowledge of java for android development as well database designing. Having gone through Muzinda Hub digital learning the skills gained, he posseses skills designing of an android application, the interface as well linking with a remote database using MySQL and a website.",
                        "Nomore Majuru has acquired skills during the course of the digital skills training at Muzinda Hub and now possesses knowledge of the basic syntax and programming structures, java for android development, database design."};

                String fact = "";
                Random randomGenerator = new Random();
                int randomNumber = randomGenerator.nextInt(facts.length);
                fact = facts[randomNumber];
                articleTextView.setText(fact);
            }
        };
        articleButton.setOnClickListener(listener);
    }
}
