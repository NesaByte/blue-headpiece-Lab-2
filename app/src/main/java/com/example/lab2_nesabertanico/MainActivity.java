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
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText usernameEditText, day;
    Button subm, reset;
    CheckBox red, orange, yellow, green, blue, indigo, violet, black, white, pink;
    RadioGroup radioMonth;
    RadioButton radioButton;
    SeekBar sb_happy;
    String happyNum = "";

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
        sb_happy         = findViewById(R.id.sb_happy);

        //String sbh = "";
        sb_happy.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                String sbh = String.valueOf(progress);
                //toastMsg(":"+sbh);
                happyNum = sbh;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        subm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //do something amazing
                try{
                    /*        * *        NAME        * *        */
                    String nameSet ="";
                    String name = usernameEditText.getText().toString();
                    char n = name.charAt(0);
                    if (n == 'A'|| n == 'N'|| n == 'a'|| n == 'n'){
                        nameSet = "Fearless";
                    }else if (n == 'B'|| n == 'O'|| n == 'b'|| n == 'o'){
                        nameSet = "Loving";
                    }else if (n == 'C'|| n == 'P'|| n == 'c'|| n == 'p'){
                        nameSet = "Spirited";
                    }else if (n == 'D'|| n == 'Q'|| n == 'd'|| n == 'q'){
                        nameSet = "Strong";
                    }else if (n == 'E'|| n == 'R'|| n == 'e'|| n == 'r'){
                        nameSet = "Beautiful";
                    }else if (n == 'F'|| n == 'S'|| n == 'f'|| n == 's'){
                        nameSet = "Healing";
                    }else if (n == 'G'|| n == 'T'|| n == 'g'|| n == 't'){
                        nameSet = "Calm";
                    }else if (n == 'H'|| n == 'U'|| n == 'h'|| n == 'u'){
                        nameSet = "Shining";
                    }else if (n == 'I'|| n == 'V'|| n == 'i'|| n == 'v'){
                        nameSet = "Wandering";
                    }else if (n == 'J'|| n == 'W'|| n == 'j'|| n == 'w'){
                        nameSet = "Wise";
                    }else if (n == 'K'|| n == 'X'|| n == 'k'|| n == 'x'){
                        nameSet = "Lush";
                    }else if (n == 'L'|| n == 'Y'|| n == 'l'|| n == 'y'){
                        nameSet = "Sweet";
                    }else if (n == 'M'|| n == 'Z'|| n == 'm'|| n == 'z'){
                        nameSet = "Graceful";
                    }else{
                        nameSet = "Vengeful";
                    }

                    /*        * *        DAY        * *        */
                    String daySet = "";
                    String dayy = day.getText().toString();
                    if(dayy == "1"||dayy == "11"||dayy == "21"){
                        daySet = "TreeHugger";
                    }else if(dayy == "2"||dayy == "12"||dayy == "22"){
                        daySet = "Lover";
                    }else if(dayy == "3"||dayy == "13"||dayy == "23"){
                        daySet = "Guardian";
                    }else if(dayy == "4"||dayy == "14"||dayy == "24"){
                        daySet = "Believer";
                    }else if(dayy == "5"||dayy == "15"||dayy == "25"){
                        daySet = "Yogi";
                    }else if(dayy == "6"||dayy == "16"||dayy == "26"){
                        daySet = "Soul";
                    }else if(dayy == "7"||dayy == "17"||dayy == "27"){
                        daySet = "Hippie";
                    }else if(dayy == "8"||dayy == "18"||dayy == "28"){
                        daySet = "Flower";
                    }else if(dayy == "9"||dayy == "19"||dayy == "29"){
                        daySet = "Creator";
                    }else if(dayy == "10"||dayy == "20"||dayy == "30"){
                        daySet = "Essence";
                    }else{
                        daySet = "Warrior";
                    }

                    /*        * *        MONTH        * *        */
                    String monthSet = "";
                    int monthID = radioMonth.getCheckedRadioButtonId();
                    radioButton = (RadioButton) findViewById(monthID);
                    CharSequence aa = radioButton.getText();


                    if (aa.toString().equals("January")){
                        monthSet = "Cupcakes";

                    } else if (aa.toString().equals("February")){
                        monthSet = "StarFruits";
                    }else if (aa.toString().equals("March")){
                        monthSet = "StarDrops";
                    }else if (aa.toString().equals("April")){
                        monthSet = "Sprinkle Fruits";
                    }else if (aa.toString().equals("May")){
                        monthSet = "Sparkle Dusts";
                    }else if (aa.toString().equals("June")){
                        monthSet = "Glitter Apple";
                    }else if (aa.toString().equals("July")){
                        monthSet = "Sunshine Marshmallows";
                    }else if (aa.toString().equals("August")){
                        monthSet = "Unicorn Cupcake";
                    }else if (aa.toString().equals("September")){
                        monthSet = "Pixie Berries";
                    }else if (aa.toString().equals("October")){
                        monthSet = "FireFlakes";
                    }else if (aa.toString().equals("November")){
                        monthSet = "Periwinkle";
                    }else if (aa.toString().equals("December")){
                        monthSet = "Bubblegum Suprise";
                    }else
                        monthSet = "Corpse";



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
                    if(pink.isChecked()){
                        if(index == 0)
                        colorSet = "Trees";
                        else
                            colorSet = colorSet + " or the Trees";
                        index++;
                    }

                    /*        * *        HAPPINESS        * *        */
                    String hap = "";
                    if (happyNum.equals("1")){ hap = "Aos Si";}
                    else if(happyNum.equals("2")){hap = "Encantado";}
                    else if(happyNum.equals("3")){hap = "Elf";}
                    else if(happyNum.equals("4")){hap = "Tylwyth Teg";}
                    else if(happyNum.equals("5")){hap = "Nymph";}
                    else{hap = "Erlking";}

                    /*****        * *        DIALOG        * *        *****/
                    String flowerName = "You're a/an " +hap +". Your name is "+ nameSet + " " + daySet +" of the " +colorSet
                            + " and your favourite food is/are " + monthSet + ".";

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
                radioMonth.clearCheck();
                red.setChecked(false);
                orange.setChecked(false);
                yellow.setChecked(false);
                green.setChecked(false);
                blue.setChecked(false);
                indigo.setChecked(false);
                violet.setChecked(false);
                black.setChecked(false);
                white.setChecked(false);
                pink.setChecked(false);
                sb_happy.setProgress(0);

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
