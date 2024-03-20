package edu.temple.fragmentrefactor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nameEditText = findViewById<EditText>(R.id.nameEditText)
        val changeButton = findViewById<Button>(R.id.changeButton)
        val displayFrag = Displayfrag()

        if (savedInstanceState == null){
        supportFragmentManager.beginTransaction()
            .add(R.id.fragmentContainer, displayFrag)
            .commit()

        changeButton.setOnClickListener {
            val name = nameEditText.text.toString()
            displayFrag.updateText(name)
        }
    }
}

}

