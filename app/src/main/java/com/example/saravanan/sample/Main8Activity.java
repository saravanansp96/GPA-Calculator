package com.example.saravanan.sample;

    import android.content.Context;
    import android.net.Uri;
    import android.support.v7.app.AppCompatActivity;
    import android.os.Bundle;
    import android.view.View;
    import android.widget.ArrayAdapter;
    import android.widget.Button;
    import android.widget.Spinner;
    import android.app.AlertDialog;
    import android.content.DialogInterface;
    import android.widget.Toast;

    import java.text.DecimalFormat;
    import com.google.android.gms.appindexing.Action;
    import com.google.android.gms.appindexing.AppIndex;
    import com.google.android.gms.common.api.GoogleApiClient;



    public class Main8Activity extends AppCompatActivity {

        public int p1, p2, p3, p4, p5, p6, p7, p8, p9;
        public float c;
        public String s1, s2, s3, s4, s5, s6, s7, s8, s9,cgpa;
        public Spinner dropdown1, dropdown2, dropdown3, dropdown4, dropdown5, dropdown6, dropdown7, dropdown8, dropdown9;
        String[] items1 = new String[]{"", "S", "A", "B", "C", "D", "E", "U"};
        /**
         * ATTENTION: This was auto-generated to implement the App Indexing API.
         * See https://g.co/AppIndexing/AndroidStudio for more information.
         */
        private GoogleApiClient client;

        public int assign(String p, int g) {
            int x = 0;
            if (p.equals("S"))
                x = 10 * g;
            if (p.equals("A"))
                x = 9 * g;
            if (p.equals("B"))
                x = 8 * g;
            if (p.equals("C"))
                x = 7 * g;
            if (p.equals("D"))
                x = 6 * g;
            if (p.equals("E"))
                x = 5 * g;
            if (p.equals("U"))
                x = 0 * g;
            return (x);
        }

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main8);
            c=0;
            dropdown1 = (Spinner) findViewById(R.id.spinner01);
            ArrayAdapter<String> adapter = new ArrayAdapter<String>(Main8Activity.this, android.R.layout.simple_spinner_dropdown_item, items1);
            dropdown1.setAdapter(adapter);


            dropdown2 = (Spinner) findViewById(R.id.spinner21);
            ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(Main8Activity.this, android.R.layout.simple_spinner_dropdown_item, items1);
            dropdown2.setAdapter(adapter1);


            dropdown3 = (Spinner) findViewById(R.id.spinner31);
            ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(Main8Activity.this, android.R.layout.simple_spinner_dropdown_item, items1);
            dropdown3.setAdapter(adapter2);


            dropdown4 = (Spinner) findViewById(R.id.spinner41);
            ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(Main8Activity.this, android.R.layout.simple_spinner_dropdown_item, items1);
            dropdown4.setAdapter(adapter3);


            dropdown5 = (Spinner) findViewById(R.id.spinner51);
            ArrayAdapter<String> adapter4 = new ArrayAdapter<String>(Main8Activity.this, android.R.layout.simple_spinner_dropdown_item, items1);
            dropdown5.setAdapter(adapter4);


            dropdown6 = (Spinner) findViewById(R.id.spinner61);
            ArrayAdapter<String> adapter5 = new ArrayAdapter<String>(Main8Activity.this, android.R.layout.simple_spinner_dropdown_item, items1);
            dropdown6.setAdapter(adapter5);


            dropdown7 = (Spinner) findViewById(R.id.spinner71);
            ArrayAdapter<String> adapter6 = new ArrayAdapter<String>(Main8Activity.this, android.R.layout.simple_spinner_dropdown_item, items1);
            dropdown7.setAdapter(adapter6);


            dropdown8 = (Spinner) findViewById(R.id.spinner81);
            ArrayAdapter<String> adapter7 = new ArrayAdapter<String>(Main8Activity.this, android.R.layout.simple_spinner_dropdown_item, items1);
            dropdown8.setAdapter(adapter7);


            final Context context = this;


            Button submit = (Button) findViewById(R.id.button1);
            submit.setOnClickListener(new View.OnClickListener() {


                @Override
                public void onClick(View arg0) {
                    s1 = dropdown1.getSelectedItem().toString();
                    s2 = dropdown2.getSelectedItem().toString();
                    s3 = dropdown3.getSelectedItem().toString();
                    s4 = dropdown4.getSelectedItem().toString();
                    s5 = dropdown4.getSelectedItem().toString();
                    s5 = dropdown5.getSelectedItem().toString();
                    s6 = dropdown6.getSelectedItem().toString();
                    s7 = dropdown7.getSelectedItem().toString();
                    s8 = dropdown8.getSelectedItem().toString();
                    if (s1.equals("") || s2.equals("") || s3.equals("") || s4.equals("") || s5.equals("") || s6.equals("") || s7.equals("") || s8.equals("") || s9.equals("")) {
                        Toast.makeText(getApplicationContext(), "fill all the details!", Toast.LENGTH_LONG).show();
                    } else {
                        p1 = assign(s1, 3);
                        p2 = assign(s2, 3);
                        p3 = assign(s3, 3);
                        p4 = assign(s4, 3);
                        p5 = assign(s5, 3);
                        p6 = assign(s6, 3);
                        p7 = assign(s7, 2);
                        p8 = assign(s8, 2);
                        c = ((float) (p1 + p2 + p3 + p4 + p5 + p6 + p7 + p8) / (float) 22);
                        DecimalFormat nf = new DecimalFormat("#.00");
                        cgpa = "your GPA is " + nf.format(c);
                        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);

                        // set title
                        alertDialogBuilder.setTitle(" ");

                        // set dialog message
                        alertDialogBuilder
                                .setMessage(cgpa)
                                .setCancelable(false)
                                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        // if this button is clicked, close
                                        // current activity
                                        Main8Activity.this.finish();
                                    }
                                });

                        // create alert dialog
                        AlertDialog alertDialog = alertDialogBuilder.create();

                        // show it
                        alertDialog.show();
                    }
                }
            });

            // ATTENTION: This was auto-generated to implement the App Indexing API.
            // See https://g.co/AppIndexing/AndroidStudio for more information.
            client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
        }

        @Override
        public void onStart() {
            super.onStart();

            // ATTENTION: This was auto-generated to implement the App Indexing API.
            // See https://g.co/AppIndexing/AndroidStudio for more information.
            client.connect();
            Action viewAction = Action.newAction(
                    Action.TYPE_VIEW, // TODO: choose an action type.
                    "Main2 Page", // TODO: Define a title for the content shown.
                    // TODO: If you have web page content that matches this app activity's content,
                    // make sure this auto-generated web page URL is correct.
                    // Otherwise, set the URL to null.
                    Uri.parse("http://host/path"),
                    // TODO: Make sure this auto-generated app URL is correct.
                    Uri.parse("android-app://com.example.saravanan.sample/http/host/path")
            );
            AppIndex.AppIndexApi.start(client, viewAction);
        }

        @Override
        public void onStop() {
            super.onStop();

            // ATTENTION: This was auto-generated to implement the App Indexing API.
            // See https://g.co/AppIndexing/AndroidStudio for more information.
            Action viewAction = Action.newAction(
                    Action.TYPE_VIEW, // TODO: choose an action type.
                    "Main2 Page", // TODO: Define a title for the content shown.
                    // TODO: If you have web page content that matches this app activity's content,
                    // make sure this auto-generated web page URL is correct.
                    // Otherwise, set the URL to null.
                    Uri.parse("http://host/path"),
                    // TODO: Make sure this auto-generated app URL is correct.
                    Uri.parse("android-app://com.example.saravanan.sample/http/host/path")
            );
            AppIndex.AppIndexApi.end(client, viewAction);
            client.disconnect();
        }
    }



