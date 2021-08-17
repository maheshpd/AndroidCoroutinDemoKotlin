package com.createsapp.androidcoroutindemokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupFragment()
    }

    private fun setupFragment() {
        val fragment = RecyclerListFragment.newInstance()
        val fragmentManager: FragmentManager = supportFragmentManager
        val fragmetnTransaction: FragmentTransaction = fragmentManager.beginTransaction()
        fragmetnTransaction.replace(android.R.id.content,fragment)
        fragmetnTransaction.commit()
    }
}