package com.irhamfauzan.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textA, textB;
    int scoreA=0; //kalo pake onSaveInstanceSate, hilangin nilai dari score disini
    int scoreB=0; //kalo pake onSaveInstanceSate, hilangin nilai dari score disini

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*if (savedInstanceState==null){
            scoreA=0;
            scoreB=0;
        }else{
            scoreA=savedInstanceState.getInt("scoreA");
            scoreB=savedInstanceState.getInt("scoreB");
        }*/
        textA=(TextView)findViewById(R.id.pointA);
        textB=(TextView)findViewById(R.id.pointB);
        //textA.setText(String.valueOf(scoreA));
        //textB.setText(String.valueOf(scoreB));
    }
/*    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putLong("scoreA",scoreA);
        outState.putLong("scoreB",scoreB);
    }*/

    private void addpoint(String team, int point){
        if(team.equals("A")){
            scoreA=scoreA+point;
            textA.setText(String.valueOf(scoreA));
        }else{
            scoreB=scoreB+point;
            textB.setText(String.valueOf(scoreB));
        }

    }
    public void pluspoint(View view){
        switch (view.getId()) {
            case R.id.point3A: addpoint("A",3); break;
            case R.id.point3B: addpoint("B",3); break;
            case R.id.point2A: addpoint("A",2); break;
            case R.id.point2B: addpoint("B",2); break;
            case R.id.point1A: addpoint("A",1); break;
            case R.id.point1B: addpoint("B",1); break;
        }
    }
    public void resetpoint(View view){
        scoreA=0;
        textA.setText(String.valueOf(scoreA));
        scoreB=0;
        textB.setText(String.valueOf(scoreB));
    }
}
