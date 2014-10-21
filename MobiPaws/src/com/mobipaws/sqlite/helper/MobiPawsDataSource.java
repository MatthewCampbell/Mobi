package com.mobipaws.sqlite.helper;
import com.mobipaws.sqlite.helper.DatabaseHelper;
import com.mobipaws.sqlite.model.Pet;
import com.mobipaws.sqlite.model.Task;

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
	public Task createTask(Task task){
		ContentValues values = new ContentValues();
		values.put(DatabaseHelper.COLUMN_petSitterFirstName, task.getPetSitterFirstName());
		values.put(DatabaseHelper.COLUMN_petSitterLastName, task.getPetSitterLastName());
		values.put(DatabaseHelper.COLUMN_petSitterVisitDate, null);
		values.put(DatabaseHelper.COLUMN_petSitterVisitTime, null);
		values.put(DatabaseHelper.COLUMN_petSitterNotes, task.getPetSitterNotes());
		long insertId = database.insert(DatabaseHelper.TABLE_tasks, null, values);
		task.setId(insertId);
		return task;
		
	}
	public PetTask createPetTask(PetTask petTask){
		ContentValues values = new ContentValues();
		values.put(DatabaseHelper.COLUMN_pet_id, pet.setTd(insertId));
		values.put(DatabaseHelper.COLUMN_tasks_id, task.setId(insertId));
	}

}
