package com.blueroofstudio.interview.lesson1;

// Реализация интерфейса ConvertTo.
// Перевод в м/с из км/ч.
class ConvertToMetersPerSec implements ConvertTo {
    @Override
    public float Do(float sourceValue){
        return sourceValue * 1000/3600;
    }
}
