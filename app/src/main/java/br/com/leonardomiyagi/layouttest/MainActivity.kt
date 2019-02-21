package br.com.leonardomiyagi.layouttest

import android.app.ActivityOptions
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textButton1.setOnClickListener {
            val intent = Intent(this, FirstActivity::class.java)

            val containerPair: android.util.Pair<View, String> = android.util.Pair(textButton1, "firstContainer")
            val textPair: android.util.Pair<View, String> = android.util.Pair(textButton1, "titleText1")

            val options = ActivityOptions.makeSceneTransitionAnimation(this, containerPair, textPair)

            startActivity(intent, options.toBundle())
        }

        textButton2.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)

            val containerPair: android.util.Pair<View, String> = android.util.Pair(textButton2, "secondContainer")
            val textPair: android.util.Pair<View, String> = android.util.Pair(textButton2, "titleText2")

            val options = ActivityOptions.makeSceneTransitionAnimation(this, containerPair, textPair)

            startActivity(intent, options.toBundle())
        }

        textButton3.setOnClickListener {
            val intent = Intent(this, ThirdActivity::class.java)

            val containerPair: android.util.Pair<View, String> = android.util.Pair(textButton3, "thirdContainer")
            val textPair: android.util.Pair<View, String> = android.util.Pair(textButton3, "titleText3")

            val options = ActivityOptions.makeSceneTransitionAnimation(this, containerPair, textPair)

            startActivity(intent, options.toBundle())
        }
    }
}
