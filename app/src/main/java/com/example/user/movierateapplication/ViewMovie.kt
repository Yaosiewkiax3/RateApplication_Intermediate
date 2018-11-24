package com.example.user.movierateapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.MenuItem
import android.view.View
import kotlinx.android.synthetic.main.activity_view_movie.*

class ViewMovie : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_movie)

        val movieDetails = Movie("VenomSSS","When Eddie Brock acquires the powers of a symbiote, he will have to release his alter-ego \"Venom\" to save his life","English","03-10-2018",true, null,null)

        tvTitle.text = movieDetails.name
        tvDesc.text = movieDetails.desc
        tvLanguage.text = movieDetails.lang
        tvDate.text = movieDetails.date
        tvSuitable.text = movieDetails.suitable.toString()

        registerForContextMenu(tvAddReview)
        }

    class Movie(name:String,desc:String,lang:String,date:String,suitable:Boolean, violence:Boolean?,language:Boolean?){
        val name:String
        val desc:String
        val lang:String
        val date:String
        val suitable:Boolean
        val violence: Boolean?
        val language: Boolean?
        init {
            this.name = name
            this.desc = desc
            this.lang = lang
            this.date = date
            this.suitable = suitable
            this.violence = violence
            this.language = language
        }
    }
    override fun onCreateContextMenu(menu: ContextMenu?, v: View?, menuInfo: ContextMenu.ContextMenuInfo?) {
        super.onCreateContextMenu(menu, v, menuInfo)
        if(v?.id == R.id.tvAddReview){
            menu?.add(1,1001,1,"Add Review")
        }
    }

    override fun onContextItemSelected(item: MenuItem?): Boolean {
        if(item?.itemId == 1001){
            val intent = Intent(this, RateMovie::class.java)
            startActivity(intent)
        }
        return super.onContextItemSelected(item)
    }
    }


