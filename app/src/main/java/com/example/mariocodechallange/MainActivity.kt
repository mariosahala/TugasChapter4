package com.example.mariocodechallange

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity(), Callback {
    lateinit var btnBatu: ImageView
    lateinit var btnKertas: ImageView
    lateinit var btnGunting: ImageView
    lateinit var btnRefresh: ImageView
    lateinit var dataStatus: ImageView
    lateinit var musuhBatu: ImageView
    lateinit var musuhKertas: ImageView
    lateinit var musuhGunting: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnBatu = findViewById(R.id.batu)
        btnKertas = findViewById(R.id.kertas)
        btnGunting = findViewById(R.id.gunting)
        btnRefresh = findViewById(R.id.refresh)
        dataStatus = findViewById(R.id.versus)
        musuhBatu = findViewById(R.id.batuLawan)
        musuhKertas = findViewById(R.id.kertasLawan)
        musuhGunting = findViewById(R.id.guntingLawan)

        val rumus = LogikaSuit(this)
        val btn = mutableListOf(btnBatu, btnGunting, btnKertas)

        btn.forEach {
            btnBatu.setOnClickListener {
                val data = mutableListOf("Batu", "Gunting", "Kertas")
                val index = (0..2).random()
                Toast.makeText(this, data[index], Toast.LENGTH_SHORT).show()
                btnBatu.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.batu))
                btnBatu.background = (ContextCompat.getDrawable(this, R.drawable.select))

                btnKertas.setBackgroundResource(R.drawable.kertas)
                btnGunting.setBackgroundResource(R.drawable.gunting)

                when (index) {
                    0 -> {
                        musuhBatu.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.batu))
                        musuhBatu.background = (ContextCompat.getDrawable(this, R.drawable.select))
                        musuhKertas.setBackgroundResource(R.drawable.kertas)
                        musuhGunting.setBackgroundResource(R.drawable.gunting)
                        rumus.rumusSuit(0, 0)
                    }
                    1 -> {
                        musuhGunting.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.gunting))
                        musuhGunting.background = (ContextCompat.getDrawable(this, R.drawable.select))
                        musuhBatu.setBackgroundResource(R.drawable.batu)
                        musuhKertas.setBackgroundResource(R.drawable.kertas)
                        rumus.rumusSuit(0, 1)
                    }
                    2 -> {
                        musuhKertas.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.kertas))
                        musuhKertas.background =
                            (ContextCompat.getDrawable(this, R.drawable.select))
                        musuhBatu.setBackgroundResource(R.drawable.batu)
                        musuhGunting.setBackgroundResource(R.drawable.gunting)
                        rumus.rumusSuit(0, 2)
                    }
                }
            }
            btnGunting.setOnClickListener {
                val data = mutableListOf("Batu", "Gunting", "Kertas")
                val index = (0..2).random()
                Toast.makeText(this, data[index], Toast.LENGTH_SHORT).show()
                btnGunting.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.gunting))
                btnGunting.background = (ContextCompat.getDrawable(this, R.drawable.select))

                btnKertas.setBackgroundResource(R.drawable.kertas)
                btnBatu.setBackgroundResource(R.drawable.batu)

                when (index) {
                    0 -> {
                        musuhBatu.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.batu))
                        musuhBatu.background = (ContextCompat.getDrawable(this, R.drawable.select))
                        musuhKertas.setBackgroundResource(R.drawable.kertas)
                        musuhGunting.setBackgroundResource(R.drawable.gunting)
                        rumus.rumusSuit(1, 0)
                    }
                    1 -> {
                        musuhGunting.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.gunting))
                        musuhGunting.background = (ContextCompat.getDrawable(this, R.drawable.select))
                        musuhBatu.setBackgroundResource(R.drawable.batu)
                        musuhKertas.setBackgroundResource(R.drawable.kertas)
                        rumus.rumusSuit(1, 1)
                    }
                    2 -> {
                        musuhKertas.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.kertas))
                        musuhKertas.background = (ContextCompat.getDrawable(this, R.drawable.select))
                        musuhBatu.setBackgroundResource(R.drawable.batu)
                        musuhGunting.setBackgroundResource(R.drawable.gunting)
                        rumus.rumusSuit(1, 2)
                    }
                }
            }
            btnKertas.setOnClickListener {
                val data = mutableListOf("Batu", "Gunting", "Kertas")
                val index = (0..2).random()
                Toast.makeText(this, data[index], Toast.LENGTH_SHORT).show()
                btnKertas.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.kertas))
                btnKertas.background = (ContextCompat.getDrawable(this, R.drawable.select))

                btnGunting.setBackgroundResource(R.drawable.gunting)
                btnBatu.setBackgroundResource(R.drawable.batu)

                when (index) {
                    0 -> {
                        musuhBatu.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.batu))
                        musuhBatu.background = (ContextCompat.getDrawable(this, R.drawable.select))
                        musuhKertas.setBackgroundResource(R.drawable.kertas)
                        musuhGunting.setBackgroundResource(R.drawable.gunting)
                        rumus.rumusSuit(2, 0)
                    }
                    1 -> {
                        musuhGunting.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.gunting))
                        musuhGunting.background = (ContextCompat.getDrawable(this, R.drawable.select))
                        musuhBatu.setBackgroundResource(R.drawable.batu)
                        musuhKertas.setBackgroundResource(R.drawable.kertas)
                        rumus.rumusSuit(2, 1)
                    }
                    2 -> {
                        musuhKertas.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.kertas))
                        musuhKertas.background = (ContextCompat.getDrawable(this, R.drawable.select))
                        musuhBatu.setBackgroundResource(R.drawable.batu)
                        musuhGunting.setBackgroundResource(R.drawable.gunting)
                        rumus.rumusSuit(2, 2)

                    }
                }
            }
        }

        btnRefresh.setOnClickListener {
            dataStatus.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.vs))
            btnBatu.setBackgroundResource(R.drawable.batu)
            btnGunting.setBackgroundResource(R.drawable.gunting)
            btnKertas.setBackgroundResource(R.drawable.kertas)
            musuhBatu.setBackgroundResource(R.drawable.batu)
            musuhGunting.setBackgroundResource(R.drawable.gunting)
            musuhKertas.setBackgroundResource(R.drawable.kertas)
        }
    }

    override fun kirimStatus(status: String) {
        when {
            status.contains("W") -> {
                dataStatus.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.p1menang))
            }
            status.contains("L") -> {
                dataStatus.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.p2menang))
            }
            status.contains("D") -> {
                dataStatus.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.draw))
            }
        }
    }
}



