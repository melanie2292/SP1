package com.example.kiwimall;


import java.util.ArrayList;

import com.example.mallapp.R;
import com.example.mallapp.Store_Info;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.AdapterView.OnItemClickListener;

public class MainActivity extends Activity {
	 private ListView listView1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ArrayList<String> nStore = new ArrayList<String>();
		nStore.add("Tienda de Zapatos");
		nStore.add("Tienda de Juguetes");
		nStore.add("Tienda de Ropa");
		ArrayAdapter<String> storeAdapter = new ArrayAdapter <String>(this,android.R.layout.simple_list_item_1,nStore);
		listView1 = (ListView)findViewById(R.id.listView1);    
        listView1.setAdapter(storeAdapter);
        
        
        // listening to single list item on click
     	// --------------------------------------
     	listView1.setOnItemClickListener(new OnItemClickListener() {
   			 
   		public void onItemClick(AdapterView<?> parent, View view, int position, long id) {	 
     		String currentStore = "";				 
     				  
     		// selected item
     		// -------------
     		TextView tv = (TextView) view.findViewById(R.id.txtTitle);
     		currentStore = (String) tv.getText();
     	 
     		// Launching new Activity on selecting single List Item
     		// ----------------------------------------------------	              
     		Intent i = new Intent(getApplicationContext(), Store_Info.class);				  
     	              
     		// sending data to new activity
     		// ----------------------------
     		i.putExtra("currentStore", currentStore);
     		startActivity(i);	 
     		}
     	});            	       
        
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
