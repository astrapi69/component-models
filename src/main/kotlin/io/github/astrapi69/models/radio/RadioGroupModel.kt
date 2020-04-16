package io.github.astrapi69.models.radio

data class RadioGroupModel<T>(val selected: T, val radios: Set<T>) {
}
