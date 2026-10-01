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
    direction LR
    
    class Retangulo{
        - int altura
        - int largura
        + Retangulo(al: int, la: int)
        + getArea() int
    }

    class Carro{
        - String marca
        - Motor propulsor
        + Carro(marca: String, propulsor: Motor)
        + acelerar(v: int) void
    }

    class Motor{
        - int hp
        - int giroAtual
        - int cilindros
        + Motor(hp: int, cilindros: int)
        + acelerar(v: int) void
    }
    
    Carro o-- Motor

    class Aluno{
        - String nome
        - String email
        - Endereco endereco
        + Aluno(nome: String, email: String, endereco: Endereco)
    }
    
    class Endereco{
        - String rua
        - String numero
        - String bairro
        - String cidade
        - String uf
        - String pais
        - String cep
        + Endereco(rua: String, numero: String, bairro: String, cidade: String, uf: String, pais: String, cep: String)
    }
    
    Aluno "1"*--"1" Endereco
    
    class Aviao{
        - boolean ligado
        - int tripulantes
        - int passageiros
        - int numeroMotores
        - double combustivel
        - String tipoMotores
        - ArrayList~MotorAviao~ motores
        + Aviao(tripulantes: int, passageiros: int, combustivel: double, numeroMotores: int, tipoMotores: String)
        + ligarDesligarAviao() boolean
        + ligarDesligarMotor(numero: int) boolean
    }
    
    class MotorAviao{
        - String tipo
        - boolean ligado
        + MotorAviao(tipo: String)
        + ligarDesligar() void
    }
    
    Aviao "1"*--"1..8" MotorAviao
```