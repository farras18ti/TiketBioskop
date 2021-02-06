package com.example.projectandrouas

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DataHelper(context: Context?) :
    SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION) {
    override fun onCreate(db: SQLiteDatabase) {
        // TODO Auto-generated method stub
        var table1 =
            "create table agenda(no integer primary key autoincrement, nama_agenda text null, tgl text null, tempat text null, ket text null, nama_bem text null);"
        //String table2 = "create table bem(no integer primary key autoincrement, nama_bem text null, gambar longlob null, keterangan text null );";
        //Log.d("Data", "onCreate: " + table1);
        db.execSQL(table1)
        //db.execSQL(table2);
        table1 =
            "INSERT INTO agenda (nama_agenda, tgl, tempat, ket, nama_bem) VALUES ('Rapat Umum kemensekab', '05-07-2019', 'Audit','Pakaian Bem','kemenlu');"
        db.execSQL(table1)
    }

    override fun onUpgrade(arg0: SQLiteDatabase, arg1: Int, arg2: Int) {
        // TODO Auto-generated method stub
    }

    companion object {
        private const val DATABASE_NAME = "bem.db"
        private const val DATABASE_VERSION = 1
    }
}