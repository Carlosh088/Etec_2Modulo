package com.example.alexander.exercicio_mobile_ex3contador.views

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import com.example.alexander.exercicio_mobile_ex3contador.MainGuiViewModels


@Composable
fun WidgetButton(viewModel: MainGuiViewModels){

    val contador: Int by viewModel.contador.observeAsState(0);

    Button(onClick = {
        viewModel.incrementaContador()
    }) {
        Text(text = "Quantidade de clicks " + contador)
    }
}