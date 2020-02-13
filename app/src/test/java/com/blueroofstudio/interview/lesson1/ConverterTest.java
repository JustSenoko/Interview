package com.blueroofstudio.interview.lesson1;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class ConverterTest {
    // Тестируем Converter.Convert
    @Test
    public void Converter_Convert_UnitTest() {

        // Создаем мок-объект по интерфейсу ConvertTo
        ConvertTo convertTo = mock(ConvertTo.class);
        float sourceValue = 22; // Это исходное значение
        Converter converter = new Converter(sourceValue);

        // Подставляем мок-объект в качестве реализации в метод конвертера
        converter.Convert(convertTo);

        // Нам интересно то, что метод Do интерфейса ConvertTo был вызван.
        verify(convertTo).Do(22);
    }

    // Тестируем Converter.GetResult
    @Test
    public void Converter_GetResult_UnitTest() {
        float sourceValue = 22;
        Converter converter = new Converter(sourceValue);
        float actual = converter.GetResult();   // Получить результат, неважно что вычислили

        // assertThat использует матчеры, is это матчер
        assertThat(actual, is(0f)); // тип float по умолчанию имеет значенрие 0
    }

    // Интеграционный тест, проверяем взаимодействие объекта Converter и ConvertToMetersPerSec
    @Test
    public void Converter_IntegrationTest() {
        float sourceValue = 36;
        Converter converter = new Converter(sourceValue);
        // Вместо мок-объекта используем реальный объект
        float actual = converter.Convert(new ConvertToMetersPerSec()).GetResult();
        assertThat(actual, is(10f));
    }

    @Test
    public void ConvertToMetersPerSec_Do_UnitTest() {
        ConvertTo convertTo = new ConvertToMetersPerSec();
        float actual = convertTo.Do(36);
        assertThat(actual, is(10f));
    }
}