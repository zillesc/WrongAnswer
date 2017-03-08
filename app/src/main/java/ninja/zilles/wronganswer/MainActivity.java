package ninja.zilles.wronganswer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int classNumber = 126;
    private String welcomeMessage = "Welcome to CS ";
    private TextView titleTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Put starting value of label string
        titleTextView = (TextView) findViewById(R.id.titleTextView);
        renderLabelTextView();

        // Set a callback on the button that increments the class number and updates the UI
        final Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                incrementClassNumber();
                renderLabelTextView();
            }
        });
    }

    private void renderLabelTextView() {
        titleTextView.setText(welcomeMessage + classNumber);
    }

    public void incrementClassNumber() {
        classNumber ++;
    }
}
