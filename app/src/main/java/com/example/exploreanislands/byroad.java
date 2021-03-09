package com.example.exploreanislands;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class byroad extends AppCompatActivity {


    Toolbar toolbar;

    TextView tex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_byroad);


        toolbar=findViewById(R.id.toolbarB);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        tex=findViewById(R.id.abouthave);
        tex.setText("Roads  and  Bridges  are  the  lifeline  of  the  people  for  transportation  of goods  and  passengers  and  provide  linkage  in  the  accessible  terrains.    The Union  Territory  of  Andaman  and  Nicobar  Islands  is  located  in  the  Bay  of Bengal  far  away  from  mainland  and  no  land  connection  feasible  with  the mainland.    The  roads  in  the  Union  Territory  are  divided  into  three  categories viz.  Trunk  Roads  (inter  islands  roads),  Urban  Roads  (primarily  roads  with  in Port  Blair  township)  and  rural  roads  (roads  linking  villages  to  a  trunk  road  or inter village roads).Andaman Public Works Department of Administration(APWD) constructs & maintains both urban and rural roads in these islands.  ");
        tex.setTextColor(Color.BLACK);


        tex= findViewById(R.id.avai);
        tex.setText(" The  Andaman  Trunk  Road  has  been  designated  as  NH-223  vide  GOI MOSRTH Notification dated 25.02.2004 except charge km 61 to 104 and 142 to 155 km for a length of 227 km.");
        tex.setTextColor(Color.BLACK);


        tex= findViewById(R.id.state);
        tex.setText("SH 01: Road in Little Andaman Island (22 Km) runs along the Eastern Coast, starting  from Jetty it pases through Hut Bay, R. K. Pur and Terminating at V.K. Pur\n"+"SH  02:  Road  in  Great  Nicobar  Islands  (38  Km)  starting  from  0.00  Point (Trijunction) at Campbell Bay Bazaar passing through Joginder Nagar, Vijay nagar, Laxmi  Nagar,  Gandhi  Nagar  &  terminating  at  Shastri  Nagar along  the  East Guard.\n"+ "SH 03:  Road  of  Car  Nicobar  (46  Km  corenlar  raod)  starting  from  0.00  point near Post Office at H.Q. (VIO) Gandhi Statue, Tamaloo, Jayanti junction, Teatop, Arong   and   Kakana.Again   vide   No.   203/2007/F.No.8-19/2007-PWD (PF) dt. 1.10.07 following roads also declared as State Highways."+
                "SH 04: Havelock Jetty to Radha Nagar Beach (11 Km).\n"+" SH 05: Govind Nagar Junction to Kalapather (9 Km).\n"+" SH 06: Neil Island Jetty to Sitapur (4.06 Km).\n"+" SH 07: Shippighat to Manjeri (11.50 Km).\n"+" SH 08: Guptapara to Wandoor (10.20 Km).\n"+" SH 09: Chunnabhatta to Ferrargunj (via) Kadakachang (12 Km).\n"+" SH 10: Bambooflat jetty to Shoal Bay – 19 (24 Km).\n"+" SH 11: Tushnabad Junction to Tirur (11 Km).\n"+" SH 12: Saithankhari Junction to Ograbraj Junction ( 10 Km)");
        tex.setTextColor(Color.BLACK);
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            Intent i = new Intent(byroad.this,TransActivity.class);
            startActivity(i);
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}