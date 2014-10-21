package com.mobipaws.sqlite.helper;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DatabaseHelper extends SQLiteOpenHelper {
	
	//LOGCAT pet
	private static final String LOG = "DatabaseHelper";
	
	//Database Version
	private static final int DATABASE_VERSION = 1;
	
	//Database Name
	private static final String DATABASE_NAME = "mobiPawsDb";
	
	//Database Tables
	public static final String TABLE_tasks = "tasks";
	public static final String TABLE_pet = "pet";
	public static final String TABLE_petTasks = "petTasks";
	
	//Common Column Names
	public static final String COLUMN_ID = "id";
	
	//Pet Table Columns
	public static final String COLUMN_petName ="petName";
	public static final String COLUMN_petType ="petType";
	public static final String COLUMN_petGender ="petGender";
	public static final String COLUMN_ownerFirstName ="ownerFirstName";
	public static final String COLUMN_ownerLastName ="ownerLastName";
	public static final String COLUMN_petAddress ="petAddress";
	public static final String COLUMN_ownerPhone ="ownerPhone";
	public static final String COLUMN_serviceType ="serviceType";
	public static final String COLUMN_serviceStartDate ="serviceStartDate";
	public static final String COLUMN_serviceEndDate ="serviceEndDate";
	public static final String COLUMN_comments ="comments";
	
	//Tasks Table Columns
	public static final String COLUMN_petSitterFirstName ="petSitterFirstName";
	public static final String COLUMN_petSitterLastName ="petSitterLastName";
	public static final String COLUMN_petSitterVisitDate ="petSitterVisitDate";
	public static final String COLUMN_petSitterVisitTime ="petSitterVisitTime";
	public static final String COLUMN_petSitterNotes = "petSitterNotes";
	
	//PetTasks Table Columns
	public static final String COLUMN_tasks_id = "tasks_id";
	public static final String COLUMN_pet_id = "pet_id";
	
	//Table Create Statements
	
	//CREATE PET TABLE
	private static final String CREATE_TABLE_pet = "CREATE TABLE"
			+TABLE_pet+"("+COLUMN_ID+"INTEGER PRIMARY KEY AUTOINCREMENT,"+COLUMN_petName+"TEXT,"
			+COLUMN_petType+"TEXT,"+COLUMN_petGender+"TEXT,"+COLUMN_ownerFirstName+"TEXT,"
			+COLUMN_ownerLastName+"TEXT,"+COLUMN_petAddress+"TEXT,"+COLUMN_ownerPhone+"TEXT,"
			+COLUMN_serviceType+"TEXT,"+COLUMN_serviceStartDate+"DATE,"+COLUMN_serviceEndDate
			+"DATETIME,"+COLUMN_comments+"TEXT"+")";
	
	//CREATE TASKS TABLE
	private static final String CREATE_TABLE_tasks = "CREATE TABLE"
			+TABLE_tasks+"("+COLUMN_ID+"INTEGER PRIMARY KEY AUTOINCREMENT,"+COLUMN_petSitterFirstName+"TEXT,"
			+COLUMN_petSitterLastName+"TEXT,"+COLUMN_petSitterVisitDate+"DATE,"
			+COLUMN_petSitterVisitTime+"DATETIME,"+COLUMN_petSitterNotes+"TEXT"+")";
	
	//CREATE PET_TASKS TABLE
	private static final String CREATE_TABLE_petTasks = "CREATE TABLE"
			+TABLE_petTasks+"("+COLUMN_ID+"INTEGER PRIMARY KEY AUTOINCREMENT,"
			+COLUMN_tasks_id+"INTEGER,"+COLUMN_pet_id+"INTEGER"+")";

	public DatabaseHelper(Context context) {
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		
		//CREATE TABLES
		db.execSQL(CREATE_TABLE_tasks);
		db.execSQL(CREATE_TABLE_pet);
		db.execSQL(CREATE_TABLE_petTasks);
		Log.i(LOG, "The tables have been created!");

	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		
		//ON UPGRADE DROP OLDER TABLES
		db.execSQL("DROP TABLE IF EXISTS"+TABLE_tasks);
		db.execSQL("DROP TABLE IF EXISTS"+TABLE_pet);
		db.execSQL("DROP TABLE IF EXISTS"+TABLE_petTasks);
		
		//CREATE NEW TABLES AFTER DROP
		onCreate(db);
	}
	


}
	

