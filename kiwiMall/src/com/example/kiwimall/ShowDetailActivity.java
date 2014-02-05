package com.example.kiwimall;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
//import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.text.util.Linkify;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class ShowDetailActivity extends Activity implements OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_show_detail);
		
		// Prepara los botones
        // -------------------
        Button btnLlamar = (Button) findViewById(R.id.btnLlamar);        
        btnLlamar.setOnClickListener(this);
        
        Button btnVerImagen = (Button) findViewById(R.id.btnVerImagen);        
        btnVerImagen.setOnClickListener(this);
        
		
		// Popula los campos de pantalla
		// -----------------------------
		String currentStore = this.getIntent().getExtras().getString("currentStore");
		TextView vtNombre = (TextView)findViewById(R.id.vtNombre);
		vtNombre.setText(currentStore);
		
		TextView vtDireccion = (TextView)findViewById(R.id.vtDireccion);
		vtDireccion.setText("14 Calle y 3a Avenida Zona 10");
		
		TextView vtTelefono = (TextView)findViewById(R.id.vtTelefono);
		vtTelefono.setText("55122859");
		Linkify.addLinks(vtTelefono, Linkify.PHONE_NUMBERS);
		
		TextView vtHorario = (TextView)findViewById(R.id.vtHorario);
		vtHorario.setText("Lunes a Domingo: de 9:00 a 21:00");
		
		TextView vtSitioWeb = (TextView)findViewById(R.id.vtSitioWeb);
		vtSitioWeb.setText("http://www.mallapp.com/");
		Linkify.addLinks(vtSitioWeb, Linkify.WEB_URLS);
		
		TextView vtEmail = (TextView)findViewById(R.id.vtEmail);
		vtEmail.setText("info@mallapp.com");
		Linkify.addLinks(vtEmail, Linkify.EMAIL_ADDRESSES);		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.store__info, menu);
		return true;
	}
	
	// Procesa los click de los diferentes botones de pantalla
    // -------------------------------------------------------
    public void onClick(View v) {
    	
		// Llamar
		// ------
		if(v.getId() == R.id.btnLlamar) {
		    Intent callIntent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:"+"55122859"));
            startActivity(callIntent);
		}	
		
		// Ver Imagen
		// ----------
		if(v.getId() == R.id.btnVerImagen) {
			Intent i = new Intent(getApplicationContext(), ShowImage.class);
			startActivity(i);
		}		
				
	}
	
	

}
