package com.example.lab2_nesabertanico;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText usernameEditText, day;
    Button subm, reset;
    CheckBox red, orange, yellow, green, blue, indigo, violet, black, white, pink;
    RadioGroup radioMonth;
    RadioButton radioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usernameEditText = findViewById(R.id.usernameEditText);
        day              = findViewById(R.id.day);
        subm             = findViewById(R.id.subm);
        reset            = findViewById(R.id.reset);
        red              = findViewById(R.id.red);
        orange           = findViewById(R.id.orange);
        yellow           = findViewById(R.id.yellow);
        green            = findViewById(R.id.green);
        blue             = findViewById(R.id.blue);
        indigo           = findViewById(R.id.indigo);
        violet           = findViewById(R.id.violet);
        black            = findViewById(R.id.black);
        white            = findViewById(R.id.white);
        pink             = findViewById(R.id.pink);
        radioMonth       = (RadioGroup) findViewById(R.id.rgmonth);


        subm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //do something amazing
                try{
                    /*        * *        NAME        * *        */
                    String nameSet ="";
                    String name = usernameEditText.getText().toString();
                    char n = name.charAt(0);
                    if(n == 'A'){
                        nameSet = "Breezy";
                    }else {
                        nameSet = "Wild";
                    }

                    /*        * *        DAY        * *        */
                    String daySet = "";
                    String dayy = day.getText().toString();
                    if(dayy == "1"){
                        daySet = "Gypsy";
                    }else{
                        daySet = "Dancer";
                    }

                    /*        * *        MONTH        * *        */
                    String monthSet = "";
                    int monthID = radioMonth.getCheckedRadioButtonId();
                    radioButton = (RadioButton) findViewById(monthID);
                    CharSequence aa = radioButton.getText();

                    toastMsg("charsq: " + aa);

                    if (aa == "January"){
                        monthSet = "Cupcakes";

                    } /*else if (monthID == 1){
                        monthSet = "StarFruits";
                    }else if (monthID == 2){
                        monthSet = "StarDrops";
                    }else if (monthID == 3){
                        monthSet = "Sprinkle Fruits";
                    }else if (monthID == 4){
                        monthSet = "Sparkle Dusts";
                    }else if (monthID == 5){
                        monthSet = "Glitter Apple";
                    }else if (monthID == 6){
                        monthSet = "Sunshine Marshmallows";
                    }else if (monthID == 7){
                        monthSet = "Unicorn Cupcake";
                    }else if (monthID == 8){
                        monthSet = "Pixie Berries";
                    }else if (monthID == 9){
                        monthSet = "FireFlakes";
                    }else if (monthID == 10){
                        monthSet = "Periwinkle";
                    }else if (monthID == 11){
                        monthSet = "Bubblegum Suprise";
                    }else
                        monthSet = "Corpse";*/



                    /*        * *        COLOR        * *        */
                    String colorSet = "";
                    int index = 0;
                    if(red.isChecked()){
                        index++;
                        colorSet = "Mountains";
                    }
                    if(orange.isChecked()){
                        if(index == 0)
                        colorSet = "Rivers";
                        else
                            colorSet = colorSet + " or the Rivers";
                        index++;
                    }
                    if(yellow.isChecked()){
                        if(index == 0)
                        colorSet = "Sun";
                        else
                            colorSet = colorSet + " or the Sun";
                        index++;
                    }
                    if(green.isChecked()){
                        if(index == 0)
                        colorSet = "Valley";
                        else
                            colorSet = colorSet + " or the Valley";
                        index++;
                    }
                    if(blue.isChecked()){
                        if(index == 0)
                        colorSet = "Winds";
                        else
                            colorSet = colorSet + " or the Winds";
                        index++;
                    }
                    if(indigo.isChecked()){
                        if(index == 0)
                        colorSet = "Moon";
                        else
                            colorSet = colorSet + " or the Moon";
                        index++;
                    }
                    if(violet.isChecked()){
                        if(index == 0)
                        colorSet = "Waters";
                        else
                            colorSet = colorSet + " or the Waters";
                        index++;
                    }
                    if(white.isChecked()){
                        if(index == 0)
                        colorSet = "Tides";
                        else
                            colorSet = colorSet + " or the Tides";
                        index++;
                    }
                    if(black.isChecked()){
                        if(index == 0)
                        colorSet = "Oasis";
                        else
                            colorSet = colorSet + " or the Oasis";
                        index++;
                    }
                    if(red.isChecked()){
                        if(index == 0)
                        colorSet = "Trees";
                        else
                            colorSet = colorSet + " or the Trees";
                        index++;
                    }

                    /*        * *        HAPPINESS        * *        */


                    String flowerName = nameSet + " " + daySet +" of the " +colorSet
                            + " who eats " + monthSet + " aa:"+ aa;
                    toastMsg("monthSet: " + monthID + monthSet);
                    resultDialog(MainActivity.this, flowerName);
                }catch (Exception e)  {
                    toastMsg("Error: " + e);
                    e.printStackTrace();
                }
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toastMsg("Reset Success");
                usernameEditText.setText("");
                day.setText("");
            }
        });

    }


    private void resultDialog(Activity activity, String str){
        new AlertDialog.Builder(activity)

                .setTitle("Your fairyname:")
                .setMessage(str)
                .show();
    }

    /**
     *this method makes it easier to use toast to output a message in the screen
     * @param msg
     */
    private void toastMsg(String msg){
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
}
