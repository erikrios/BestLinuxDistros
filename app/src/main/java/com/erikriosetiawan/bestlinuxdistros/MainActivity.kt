package com.erikriosetiawan.bestlinuxdistros

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.ActionBar
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.Menu
import android.view.MenuItem
import com.erikriosetiawan.bestlinuxdistros.adapter.LinuxDistrosAdapter
import com.erikriosetiawan.bestlinuxdistros.model.LinuxDistro
import com.erikriosetiawan.bestlinuxdistros.model.LinuxDistroData

class MainActivity : AppCompatActivity() {

    private lateinit var rvList: RecyclerView
    private var linuxDistros: ArrayList<LinuxDistro> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setActionBar("Best Linux Distros")
        rvList = findViewById(R.id.rv_list)
        rvList.setHasFixedSize(true)
        linuxDistros.addAll(LinuxDistroData.listData)
        setRecyclerList()
    }

    private fun setRecyclerList() {
        rvList.layoutManager = LinearLayoutManager(this)
        val linuxDistrosAdapter = LinuxDistrosAdapter(linuxDistros)
        rvList.adapter = linuxDistrosAdapter
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when (item!!.itemId) {
            R.id.about_me -> {
                val aboutIntent = Intent(this@MainActivity, AboutMeActivity::class.java)
                startActivity(aboutIntent)
            }
        }
        return super.onOptionsItemSelected(item)
    }

    private fun setActionBar(title: String) {
        if (supportActionBar != null) {
            (supportActionBar as ActionBar).title = title
        }
    }
}
