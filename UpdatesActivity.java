package googleplayservices.samples.android.treehouse.com.colourful2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class UpdatesActivity extends AppCompatActivity {
    private TextView updateTextView;
    private TextView updateTitleTextView;
    private Button updateButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_updates);

        updateTitleTextView = (TextView) findViewById(R.id.updateTittleTextView);
        updateTextView = (TextView) findViewById(R.id.updateTextView);
        updateButton = (Button) findViewById(R.id.updateButton);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String[] facts = {
                        "Colorful SCHOOLS ONLINE seeks to promote the schools brand hence allowing the schools to effectively advertise online all the adequate information required when one wished to be part of those schools. our platform puts all the latest and most reliable information to be easily available at the user's fingertips. Here you will find a range of information about each school including school annual reports, student results and details of local-intake areas for student enrolments. Please visit other areas of our website to discover the latest news and achievements of our students, staff and schools; new initiatives and innovations; booklets and factsheets for families to support their children’s learning; and much more.",
                        "We are living in the information age but most people rely on word of mouth to get information about the schools they wish to enroll, this becomes very costly as parents/guardians travel for long distances in search for schools that suit their needs. It is time consuming and exhausting. Our platform puts all the latest and most reliable information to be easily available at the user’s fingertips.",
                        "To develop a centralized platform for all schools in Zimbabwe by designing, developing and implementing a well-coordinated user friendly website and an android application which will allow both private and government schools in Zimbabwe to effectively advertise online, all the adequate information that is required when one wishes to be part of those schools by enhancing their schools’ brand.",
                        "We have acquired skills in Web Designing such as writing and editing content, designing webpage layout, determining technical requirements, updating websites, creating back up files, solving code problems and in Android; designing and developing advanced applications for the android platform, unit-testing code for robustness, including edge cases, usability, and general reliability, bug fixing and improving application performance and java language for android development. With out skills we are able to create websites as well as android applications, link, modify, update and much more."};

                String fact = "";
                Random randomGenerator = new Random();
                int randomNumber = randomGenerator.nextInt(facts.length);
                fact = facts[randomNumber];
                updateTextView.setText(fact);
            }
        };
        updateButton.setOnClickListener(listener);
    }
}
