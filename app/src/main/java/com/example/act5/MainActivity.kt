package com.example.act5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.button
import kotlinx.android.synthetic.main.activity_main.poem
import android.content.Intent

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener(this)

        val poemLines: Array<String> = resources.getStringArray(R.array.poem)

        for(line in poemLines)
        {
            poem.text = poem.text.toString() + "\n" + line
        }

        Toast.makeText(this, "onCreate()",Toast.LENGTH_LONG).show()
    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(this, "onStart()",Toast.LENGTH_LONG).show()
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this, "onResume()",Toast.LENGTH_LONG).show()
    }

    override fun onRestart() {
        super.onRestart()
        Toast.makeText(this, "onRestart()",Toast.LENGTH_LONG).show()

    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(this, "onStop()",Toast.LENGTH_LONG).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this, "onDestroy()",Toast.LENGTH_LONG).show()
    }

    override fun onClick(v: View?) {
        Toast.makeText(this, "onClick()",Toast.LENGTH_LONG).show()
        if (v == button) {
            val intent = Intent(this, ActivityTwo::class.java)
            startActivity(intent)
        }
    }

}

