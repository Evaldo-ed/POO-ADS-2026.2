# Diagramas UML

```mermaid
classDiagram
    direction BT
    
    class Personagem {
        - vida : int
        - ataque : int
        - velocidade : double
        + atacar() String
        + mover() String
    }
    
    class Aldeao {
        
    }
    
    class Arqueiro {
        
    }
    
    class Cavaleiro {
        
    }
    
    Aldeao --|> Personagem
    Arqueiro --|> Personagem
    Cavaleiro --|> Personagem
```

```mermaid
classDiagram
    direction BT
    
    class Forma {
        - cor : String
        - coordenadaInicialX : double
        - coordenadaInicialY : double
        + desenhar() String
    }
    
    class FormaGeometrica2D {
        + calcularArea() double
        + calcularPerimetro () double
    }
    
    class Linha {
        - coordenadaFinalX : double
        - coordenadaFinalY : double
    }

    class Retangulo {
        - CoordenadaFinalX : double
        - CoordenadaFinalY : double
    }
    
    class Circulo {
        - raio : double
        + calcularDiametro() double
    }

    Linha --|> Forma
    FormaGeometrica2D --|> Forma
    Retangulo --|> FormaGeometrica2D
    Circulo --|> FormaGeometrica2D
```