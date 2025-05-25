# cm-software-pswe03-cenfotec


# Gilded Rose - Versión Refactorizada

## Descripción

Este proyecto es una versión refactorizada del kata Gilded Rose en Java. Aplica principios de diseño de software como SOLID, DRY, KISS y el patrón de comportamiento Strategy para mejorar la claridad, mantenibilidad y extensibilidad del código.

## Objetivos

- Aplicar principios SOLID.
- Separar responsabilidades según el tipo de ítem.
- Evitar duplicación de código.
- Mejorar legibilidad y estructura.
- Facilitar pruebas y mantenimiento.

## Diseño

### Patrón Strategy

Cada tipo de ítem tiene una clase que implementa una estrategia de actualización:

- `AgedBrieStrategy`
- `BackstagePassStrategy`
- `SulfurasStrategy`
- `NormalItemStrategy`

La interfaz `QualityStrategy` define el método `update(Item item)`.

### Fábrica de estrategias

La clase `StrategyFactory` selecciona la estrategia adecuada según el nombre del ítem.

### Clase GildedRose

La clase `GildedRose` usa las estrategias para actualizar los ítems de forma desacoplada.

## Estructura del proyecto

```
src/
├── com/gildedrose/
│   ├── Item.java
│   ├── GildedRose.java
│   ├── Main.java
│   ├── QualityStrategy.java
│   ├── AgedBrieStrategy.java
│   ├── BackstagePassStrategy.java
│   ├── NormalItemStrategy.java
│   ├── SulfurasStrategy.java
│   └── StrategyFactory.java
```

## Cómo ejecutar

1. Compilar los archivos Java:

```bash
javac com/gildedrose/*.java
```

2. Ejecutar la clase principal:

```bash
java com.gildedrose.Main
```

## Notas

- `Sulfuras` no cambia su calidad ni días de venta.
- `Aged Brie` aumenta su calidad con el tiempo.
- `Backstage passes` aumenta su calidad dependiendo de los días restantes, pero baja a 0 después del concierto.
- Ítems normales disminuyen su calidad cada día, más rápido si la fecha de venta ha pasado.
