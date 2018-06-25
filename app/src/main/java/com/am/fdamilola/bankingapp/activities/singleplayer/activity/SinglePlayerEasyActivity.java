package com.am.fdamilola.bankingapp.activities.singleplayer.activity;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.am.fdamilola.bankingapp.R;
import com.am.fdamilola.bankingapp.activities.singleplayer.activity.presenter.SinglePlayerEasyActivityPresenterImpl;
import com.am.fdamilola.bankingapp.activities.singleplayer.activity.vm.SinglePlayerEasyActivityVM;
import com.am.fdamilola.bankingapp.base.classes.TinyGameAppBaseActivity;

import butterknife.BindView;
import butterknife.OnClick;

public class SinglePlayerEasyActivity extends TinyGameAppBaseActivity {

    private int  buttonCount = 0;

    private int buttoncolor1 = 0;
    private int buttoncolor2 = 0;
    private int buttoncolor3 = 0;

    private static int SPLASH_TIME_OUT = 5002;
    private  final Handler handler = new Handler();

    @BindView(R.id.color_view_one) public View colorViewOne;
    @BindView(R.id.color_view_two) public View colorViewTwo;
    @BindView(R.id.color_view_three)public View colorViewThree;
    @BindView(R.id.button0_0) public Button buttonRow0col0;
    @BindView(R.id.button0_1) public Button buttonRow0col1;
    @BindView(R.id.button0_2) public Button buttonRow0col2;
    @BindView(R.id.button0_3) public Button buttonRow0col3;
    @BindView(R.id.button0_4) public Button buttonRow0col4;
    @BindView(R.id.button1_0) public Button buttonRow1col0;
    @BindView(R.id.button1_1) public Button buttonRow1col1;
    @BindView(R.id.button1_2) public Button buttonRow1col2;
    @BindView(R.id.button1_3) public Button buttonRow1col3;
    @BindView(R.id.button1_4) public Button buttonRow1col4;
    @BindView(R.id.button2_0) public Button buttonRow2col0;
    @BindView(R.id.button2_1) public Button buttonRow2col1;
    @BindView(R.id.button2_2) public Button buttonRow2col2;
    @BindView(R.id.button2_3) public Button buttonRow2col3;
    @BindView(R.id.button2_4) public Button buttonRow2col4;


    private SinglePlayerEasyActivityPresenterImpl  presenter = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_player_easy);
        presenter = SinglePlayerEasyActivityPresenterImpl.createSingleInstance(new SinglePlayerEasyActivityVM(this, null));
        presenter.playRoulette();
        //presenter.setWhiteColor();

        if (buttonCount == 3 || buttonCount>=3){
            presenter.playRoulette();
                       if(buttoncolor1 == ((ColorDrawable) colorViewOne.getBackground()).getColor()||
                          buttoncolor2 == ((ColorDrawable) colorViewOne.getBackground()).getColor()||
                          buttoncolor3 == ((ColorDrawable) colorViewOne.getBackground()).getColor()){

                           if(buttoncolor1 == ((ColorDrawable) colorViewTwo.getBackground()).getColor()||
                                   buttoncolor2 == ((ColorDrawable) colorViewTwo.getBackground()).getColor()||
                                   buttoncolor3 == ((ColorDrawable) colorViewTwo.getBackground()).getColor()){

                               if(buttoncolor1 == ((ColorDrawable) colorViewThree.getBackground()).getColor()||
                                       buttoncolor2 == ((ColorDrawable) colorViewThree.getBackground()).getColor()||
                                       buttoncolor3 == ((ColorDrawable) colorViewThree.getBackground()).getColor()){
                                   //Trigger dami Success dialog
                                   Toast.makeText(this,"you got the right answer",Toast.LENGTH_SHORT);
                               }else{
                                   //Trigger dami failure dialog
                                   Toast.makeText(this,"you failed to get the right answer",Toast.LENGTH_SHORT);
                               }

                           }else{
                               //Trigger dami failure dialog
                               Toast.makeText(this,"you failed to get the right answer",Toast.LENGTH_SHORT);
                           }
              }else{
                           //Trigger dami failure dialog
                           Toast.makeText(this,"you failed to get the right answer",Toast.LENGTH_SHORT);
                       }
        }
    }

    @OnClick({R.id.button0_0,R.id.button0_1,R.id.button0_2,R.id.button0_3,R.id.button0_4,
              R.id.button1_0,R.id.button1_1,R.id.button1_2,R.id.button1_3,R.id.button1_4,
              R.id.button2_0,R.id.button2_1,R.id.button2_2,R.id.button2_3,R.id.button2_4})
    public void checkButton(Button button) {
        if (buttoncolor1 != 0){
            if (buttoncolor2!=0){
                if (buttoncolor3!=0){
                    Toast.makeText(this,"you have already selected three buttons",Toast.LENGTH_SHORT);
                }else if (buttoncolor3 == 0){
                    buttoncolor3= ((ColorDrawable)button.getBackground()).getColor();
                    buttonCount +=1;
                    Toast.makeText(this,"oh boy you don click button 3",Toast.LENGTH_LONG);
                }
            }else if (buttoncolor2 == 0){
                buttoncolor2= ((ColorDrawable)button.getBackground()).getColor();
                buttonCount +=1;
                Toast.makeText(this,"oh boy you don click button 2",Toast.LENGTH_LONG);
            }
        }else if (buttoncolor1 ==0){
            buttoncolor1= ((ColorDrawable)button.getBackground()).getColor();
            buttonCount +=1;
            Toast.makeText(this,"oh boy you don click button 1",Toast.LENGTH_LONG);
        }
    }




}
