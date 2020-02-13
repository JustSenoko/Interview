package com.blueroofstudio.interview.lesson1;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.blueroofstudio.interview.R;
import com.google.android.material.textfield.TextInputEditText;

import java.util.Locale;
import java.util.Objects;

public class ConvertActivity extends AppCompatActivity {

    private TextInputEditText sourceText;    // Элемент с входным значением, которое надо сконвертировать
    private TextInputEditText destText;      // Элемент с результирующим значением

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_convert);
        sourceText = findViewById(R.id.kmPerHourValue);
        destText = findViewById(R.id.mPerSecValue);
    }

    // обработка нажатия
    public void onToMetersPerSecClick(View view) {
        // получить входное значение
        float sourceValue = Float.parseFloat(Objects.requireNonNull(sourceText.getText()).toString());
        // инстанцировать конвертер
        Converter converter = new Converter(sourceValue);
        // преобразовать, обратите внимание на параметр ConvertToMetersPerSec
        float destValue = converter.Convert(new ConvertToMetersPerSec()).GetResult();
        // записать результат в элемент
        destText.setText(String.format(Locale.getDefault(),"%.02f", destValue));
    }
}
