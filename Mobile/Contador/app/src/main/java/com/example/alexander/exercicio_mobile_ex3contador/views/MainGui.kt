package com.example.alexander.exercicio_mobile_ex3contador.views

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.example.alexander.exercicio_mobile_ex3contador.MainGuiViewModels
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.livedata.observeAsState


@Composable
fun MainGui(viewModel: MainGuiViewModels){

    Column{
        Text(text="=====")
        Text(text="=====")
        Text(text="=====")
        Text(text="=====")
        WidgetTextField(viewModel)
        WidgetButton(viewModel)

    }

}