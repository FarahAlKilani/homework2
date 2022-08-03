package com.example.hw2

import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.*
import com.example.dialogFragment.CustomDialogFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val top:TextView=findViewById(R.id.textView)
        val result:TextView =findViewById(R.id.textView2)
        result.setOnClickListener{
            var dialog = CustomDialogFragment()

            dialog.show(supportFragmentManager, tag = "customDialog")

        }

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.example_menu,menu)
        return true;
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        switch(item.getItemId()){
            case R.id.item1:
            Toast.makeText(this , "Item 1 selected", Toast.LENGTH_SHORT).show()
            return true;
            case R.id.item2:
            Toast.makeText(this , "Item 2  selected", Toast.LENGTH_SHORT).show()
            return true;
            case R.id.item3:
            Toast.makeText(this , "Item 3 selected", Toast.LENGTH_SHORT).show()
            return true;
            default:
            return super.onOptionsItemSelected(item)
        }
    }
}