package ar.net.panchonet.cvplay;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;


public class mainHubCvPlay extends Activity {

    static private final String  TAG  = "mainHubCvPlay";
    //moviecity://[nombre_MSO].moviecity.com?content_id=XX&token=YY&referer=parent://XXXXX
    static private final String URI = "moviecity://cablevision.moviecity.com?content_id="

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_hub_cv_play);

        //Button deepLinkButton = (Button) findViewById(R.id.lunch_deeplink);
        Button deepLinkButton = (Button) findViewById(R.id.lunch_deeplink);

        deepLinkButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_hub_cv_play, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
