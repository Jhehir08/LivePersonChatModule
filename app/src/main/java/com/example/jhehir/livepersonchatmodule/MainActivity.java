package com.example.jhehir.livepersonchatmodule;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.liveperson.api.LivePersonCallback;
import com.liveperson.infra.InitLivePersonProperties;
import com.liveperson.infra.callbacks.InitLivePersonCallBack;
import com.liveperson.messaging.TaskType;
import com.liveperson.messaging.model.AgentData;
import com.liveperson.messaging.sdk.api.LivePerson;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String brandID = "10829253"; //YourLivepersonAccountIdString
        String appID = "com.example.jhehir.livepersonchatmodule"; //your app package name
        LivePerson.initialize(MainActivity.this, new InitLivePersonProperties(brandID, appID, new InitLivePersonCallBack() {
            @Override
            public void onInitSucceed() {

            }

            @Override
            public void onInitFailed(Exception e) {
                Toast.makeText(MainActivity.this, "Init Failed", Toast.LENGTH_SHORT).show();
            }
        }));
    }
}
