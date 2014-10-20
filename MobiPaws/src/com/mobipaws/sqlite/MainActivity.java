package com.mobipaws.sqlite;

import com.mobipaws.sqlite.helper.MobiPawsDataSource;
import com.mobipaws.sqlite.model.Pet;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends ActionBarActivity {
	
	MobiPawsDataSource datasource;
	private static final String LOG = "DatabaseHelper";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		datasource = new MobiPawsDataSource(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
	@Override
	protected void onResume() {
		super.onResume();
		datasource.open();
	}
	@Override
	protected void onPause() {
		super.onPause();
		datasource.close();
	}
	private void createData(){
		Pet pet = new Pet();
		pet.setPetName("Rover");
		pet.setPetType("Dog");
		pet.setPetGender("Male");
		pet.setOwnerFirstName("Matthew");
		pet.setOwnerLastName("Campbell");
		pet.setPetAddress("Friends Field");
		pet.setOwnerPhone("444-4444");
		pet.setServiceType("Pet Sitting");
		pet.setServiceStart("22-10-14");
		pet.setServiceEnd("30-10-14");
		pet.setComments("Feed him only Pedigree dog food");
		pet = datasource.createPet(pet);
		Log.i(LOG, "Pet has be added with the ID "+ pet.getId());      
		
		
	}
}
