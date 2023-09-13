package com.sigmotoa.mipokemong9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imgPokemon1 = findViewById(R.id.img_pokemon_1);
        ImageView imgPokemon2 = findViewById(R.id.img_pokemon_2);
        ImageView imgPokemon3 = findViewById(R.id.img_pokemon_3);
        ImageView imgPokemon4 = findViewById(R.id.img_pokemon_4);
        ImageView imgPokemon5 = findViewById(R.id.img_pokemon_5);

        Glide.with(this)
                .load("https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/home/6.png")
                .into(imgPokemon1);
        Glide.with(this)
                .load("https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/home/9.png")
                .fitCenter()
                .into(imgPokemon2);
        Glide.with(this)
                .load("https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/versions/generation-v/black-white/animated/6.gif")
                .fitCenter()
                .into(imgPokemon3);
        Glide.with(this)
                .load("https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/versions/generation-v/black-white/animated/64.gif")
                .fitCenter()
                .into(imgPokemon4);
        Glide.with(this)
                .load("https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/versions/generation-v/black-white/animated/25.gif")
                .fitCenter()
                .into(imgPokemon5);


    }
}