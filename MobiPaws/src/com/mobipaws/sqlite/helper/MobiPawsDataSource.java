package com.mobipaws.sqlite.helper;
import com.mobipaws.sqlite.helper.DatabaseHelper;
import com.mobipaws.sqlite.model.Pet;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class MobiPawsDataSource {
	
	private static final String LOG = "DatabaseHelper";
	SQLiteOpenHelper dbhelper;
	SQLiteDatabase database;
	
	public MobiPawsDataSource(Context context){
		dbhelper = new DatabaseHelper(context);
		
	}
	
	public void open(){
		Log.i(LOG, "Database opened!");
		database = dbhelper.getWritableDatabase();
	}
	public void close(){
		Log.i(LOG, "Database closed!");
		dbhelper.close();
	}
	
	public Pet createPet(Pet pet){
		ContentValues values = new ContentValues();
		values.put(DatabaseHelper.COLUMN_petName, pet.getPetName());
		values.put(DatabaseHelper.COLUMN_petType, pet.getPetType());
		values.put(DatabaseHelper.COLUMN_petGender, pet.getPetGender());
		values.put(DatabaseHelper.COLUMN_ownerFirstName, pet.getOwnerFirstName());
		values.put(DatabaseHelper.COLUMN_ownerLastName, pet.getOwnerLastName());
		values.put(DatabaseHelper.COLUMN_petAddress, pet.getPetAddress());
		values.put(DatabaseHelper.COLUMN_ownerPhone, pet.getOwnerPhone());
		values.put(DatabaseHelper.COLUMN_serviceType, pet.getServiceType());
		values.put(DatabaseHelper.COLUMN_serviceStartDate, pet.getServiceStart());
		values.put(DatabaseHelper.COLUMN_serviceEndDate, pet.getServiceEnd());
		long insertId = database.insert(DatabaseHelper.TABLE_pet, null, values);
		pet.setId(insertId);
		return pet;
	}

}
