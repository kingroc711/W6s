package club.anhe.w6s.w6s;

import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
    private RelativeLayout mMainLayout;
    private LinearLayout mLinearLayout;


    private void onInit(){
        mMainLayout.setBackground(getResources().getDrawable(R.mipmap.index2));
        mLinearLayout.setVisibility(View.VISIBLE);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mMainLayout = (RelativeLayout) findViewById(R.id.bg_layout);
        mLinearLayout = (LinearLayout) findViewById(R.id.mani_layout);

        Handler h = new Handler(){
            @Override
            public void handleMessage(Message msg) {
                switch (msg.what) {
                    case 1:
                        MainActivity.this.onInit();
                        break;
                }
            }
        };

        h.sendEmptyMessageDelayed(1, 1000*2);
    }
}
