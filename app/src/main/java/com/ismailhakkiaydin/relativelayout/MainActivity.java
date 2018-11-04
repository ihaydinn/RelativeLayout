package com.ismailhakkiaydin.relativelayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    private RelativeLayout rl;
    private RelativeLayout.LayoutParams prms1, prms2;
    private Button btn1, btn2;
    private int id1=1, id2=2;

    private void init(){

        rl = new RelativeLayout(this);

        btn1 = new Button(this);
        btn1.setText("Button 1 ");
        btn1.setId(id1);
        prms1 = new RelativeLayout.LayoutParams(200, 80);
        prms1.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
        prms1.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);
        btn1.setLayoutParams(prms1);

        btn2 = new Button(this);
        btn2.setText("Button 2 ");
        btn2.setId(id2);
        prms2 = new RelativeLayout.LayoutParams(170, 90);
        prms2.addRule(RelativeLayout.LEFT_OF, btn1.getId());
        prms2.addRule(RelativeLayout.ABOVE, btn1.getId());
        btn2.setLayoutParams(prms2);


        rl.addView(btn1);
        rl.addView(btn2);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        init();
        setContentView(rl);

    }

}
