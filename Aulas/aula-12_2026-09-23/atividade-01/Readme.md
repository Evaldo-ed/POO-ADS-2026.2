# Diagrama de classes UML

## Código Java

```java
package ads.poo;

public class Retangulo{
    private int altura;
    private int largura;

    public Retangulo (int al, int la) {
        altura = al;
        largura = la;
    }

    public int getArea() {
        return (altura * largura);
    }
}
```

## Diagrama UML

```mermaid
classDiagram
    class Retangulo{
        - int altura
        - int largura
        + Retangulo(al: int, la: int)
        + getArea() int
    }

    class Carro{
        - String marca
        - Motor propulsor
        + Carro()
        + acelerar(v: int) void
    }

    class Motor{
        - int hp
        - int giroAtual
        - int cilindros
        + Motor()
        + acelerar(v: int) void
    }
    
    direction LR
    Carro o-- Motor
```