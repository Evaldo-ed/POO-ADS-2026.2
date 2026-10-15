# Diagramas UML

```mermaid
classDiagram
    direction BT
    
    class Produto {
        
    }
    
    class Pager {
        
    }
    
    class Telefone {
        
    }
    
    class SemFio {
        
    }

    Telefone --|> Produto
    SemFio --|> Telefone
    Pager --|> Produto
```