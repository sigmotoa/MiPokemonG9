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

        //Adicionando las imagenes al scrollvertical

        ImageView imgPk1 = findViewById(R.id.img_pokemon_mini_1);
        ImageView imgPk2 = findViewById(R.id.img_pokemon_mini_2);
        ImageView imgPk3 = findViewById(R.id.img_pokemon_mini_3);
        ImageView imgPk4 = findViewById(R.id.img_pokemon_mini_4);
        ImageView imgPk5 = findViewById(R.id.img_pokemon_mini_5);
        ImageView imgPk6 = findViewById(R.id.img_pokemon_mini_6);
        ImageView imgPk7 = findViewById(R.id.img_pokemon_mini_7);
        ImageView imgPk8 = findViewById(R.id.img_pokemon_mini_8);
        ImageView imgPk9 = findViewById(R.id.img_pokemon_mini_9);
        ImageView imgPk10 = findViewById(R.id.img_pokemon_mini_10);

        Glide.with(this)
                .load("https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/versions/generation-v/black-white/animated/1.gif")
                .fitCenter()
                .into(imgPk1);
  Glide.with(this)
                .load("https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/versions/generation-v/black-white/animated/2.gif")
                .fitCenter()
                .into(imgPk2);
  Glide.with(this)
                .load("https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/versions/generation-v/black-white/animated/3.gif")
                .fitCenter()
                .into(imgPk3);
  Glide.with(this)
                .load("https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/versions/generation-v/black-white/animated/4.gif")
                .fitCenter()
                .into(imgPk4);
  Glide.with(this)
                .load("https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/versions/generation-v/black-white/animated/5.gif")
                .fitCenter()
                .into(imgPk5);
  Glide.with(this)
                .load("https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/versions/generation-v/black-white/animated/6.gif")
                .fitCenter()
                .into(imgPk6);
  Glide.with(this)
                .load("https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/versions/generation-v/black-white/animated/7.gif")
                .fitCenter()
                .into(imgPk7);
  Glide.with(this)
                .load("https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/versions/generation-v/black-white/animated/8.gif")
                .fitCenter()
                .into(imgPk8);
  Glide.with(this)
                .load("https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/versions/generation-v/black-white/animated/9.gif")
                .fitCenter()
                .into(imgPk9);
  Glide.with(this)
                .load("https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/versions/generation-v/black-white/animated/10.gif")
                .fitCenter()
                .into(imgPk10);





    }
}