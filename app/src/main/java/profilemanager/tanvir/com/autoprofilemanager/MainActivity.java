package profilemanager.tanvir.com.autoprofilemanager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Intent myService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume(){
        super.onResume();
        myService = new Intent(this, ProfileManager.class);  // ProfileManager
    }

    public void onStartClicked(View v){
        startService(myService);
        Toast.makeText(this, "Service Started", Toast.LENGTH_SHORT).show();
    }

    public void onStopClicked(View v){
        stopService(myService);
        Toast.makeText(this, "Service Stopped", Toast.LENGTH_SHORT).show();
    }
}
