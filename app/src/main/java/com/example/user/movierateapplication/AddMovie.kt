package com.example.user.movierateapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import kotlinx.android.synthetic.main.activity_add_movie.*
import android.content.Intent
import android.view.Menu
import android.view.MenuItem

class AddMovie : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_movie)



        cbAudience.setOnCheckedChangeListener { checkbox, isChecked ->
            if (isChecked) {
                cbReasons.visibility = View.VISIBLE
            } else {
                cbReasons.visibility = View.INVISIBLE
            }
        }

//        val button = findViewById<Button>(R.id.button2)
//        button.setOnClickListener {
//            val ptMovieName = findViewById<TextView>(R.id.ptMovieName)
//            val movieName: String? = ptMovieName.text.toString()
//            val ptDesc = findViewById<TextView>(R.id.ptDesc)
//            val desc: String? = ptDesc.text.toString()
//            val ptRelease = findViewById<TextView>(R.id.ptReleaseDate)
//            val releaseDate: String? = ptRelease.text.toString()
//            val radioLangGroup = findViewById<RadioGroup>(R.id.rgLang)
//            val idSelected = radioLangGroup.checkedRadioButtonId
//            val radioLangText = findViewById<RadioButton>(idSelected).text
//
//            if (movieName.isNullOrBlank()) {
//                ptMovieName.setError("Field empty")
//            }
//            if (desc.isNullOrBlank()) {
//                ptDesc.setError("Field empty")
//            }
//            if (releaseDate.isNullOrBlank()) {
//                ptRelease.setError("Field empty")
//            }
//            val duration = Toast.LENGTH_SHORT
//
//            val suitable4Aud = cbAudience.isChecked.toString()
//            var toastText =
//                "Title = $movieName \n Overview = $desc \n Release date = $releaseDate \n Language = $radioLangText \n Not suitable for all ages = $suitable4Aud"
//            if (cbAudience.isChecked) {
//                toastText += "\n Reasons:"
//                if (cbViolence.isChecked) {
//                    toastText += "\n Violence"
//                }
//                if (cbLanguage.isChecked) {
//                    toastText += "\n Language"
//                }
//            }
//            val toast = Toast.makeText(applicationContext, toastText, duration)
//            toast.show()
//            val intent = Intent(this, AddMovie::class.java)
//            intent.putExtra("movieName", movieName)
//            startActivity(intent)
//        }
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.addmovie,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        if(item?.itemId == R.id.clearAddMovie) {
            ptMovieName.text.clear()
            ptDesc.text.clear()
            radioButtonEng.isChecked = true
            ptReleaseDate.text.clear()
            cbAudience.isChecked = false
        }else if(item?.itemId == R.id.addMovie){
            var movieDetails = applicationContext as Movie
            val ptMovieName = findViewById<TextView>(R.id.ptMovieName)
            val movieName: String? = ptMovieName.text.toString()
            movieDetails.setMovieName(movieName.toString())
//            val intent = Intent(this, ViewMovie::class.java)
//            startActivity(intent)
//            val xd = movieDetails.getName()
            val toast = Toast.makeText(applicationContext, "asd", Toast.LENGTH_SHORT)
            toast.show()
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onBackPressed() {
        val intent = Intent(this, LandingPage::class.java)
        startActivity(intent)
        super.onBackPressed()
    }
}


