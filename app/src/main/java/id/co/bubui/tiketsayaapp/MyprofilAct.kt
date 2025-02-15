package id.co.bubui.tiketsayaapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.LinearLayout

class MyprofilAct : AppCompatActivity() {

    private lateinit var btn_edit_profile:Button

    private lateinit var item_my_ticket: LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_myprofil)

        btn_edit_profile = findViewById(R.id.btn_editprofile);
        btn_edit_profile.setOnClickListener {
            val gotoeditprofile=Intent(this,EditProfileAct::class.java)
            startActivity(gotoeditprofile);
        }
        item_my_ticket = findViewById(R.id.ticket)
        item_my_ticket.setOnClickListener{
            intent = Intent(this, MyTicketDetailAct::class.java)
            startActivity(intent)
        }
    }
}
