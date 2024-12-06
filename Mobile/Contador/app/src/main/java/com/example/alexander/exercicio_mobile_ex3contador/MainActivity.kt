package com.example.alexander.exercicio_mobile_ex3contador

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.alexander.exercicio_mobile_ex3contador.ui.theme.Exercicio_mobile_Ex3ContadorTheme
import com.example.alexander.exercicio_mobile_ex3contador.views.MainGui


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val MainGuiViewModels = MainGuiViewModels();

        setContent {
            Exercicio_mobile_Ex3ContadorTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MainGui(MainGuiViewModels);

                }
            }
        }
    }
}