# Calculadora de IMC (JavaFX com SceneBuilder)

Projeto de uma calculadora de Índice de Massa Corporal (IMC) desenvolvida em Java, focada em aplicar boas práticas de orientação a objetos e separação de responsabilidades.

## Demonstração

| Menu Principal | Resultado (Pop-up) |
|:---:|:---:|
| <img width="400" src="https://github.com/user-attachments/assets/780fa379-d62e-4934-8a31-845fe58e6fb0" /> | <img width="400" src="https://github.com/user-attachments/assets/9e56da46-69eb-4af8-9bb9-79baf94a7853" /> |

## Sobre o Projeto

Este aplicativo permite que o usuário calcule seu IMC inserindo peso e altura. O objetivo principal do desenvolvimento foi a aplicação do padrão de arquitetura **MVC (Model-View-Controller)** para criar um código limpo, coeso e de fácil manutenção.

### Funcionalidades
- **Cálculo Preciso:** Algoritmo padrão de IMC.
- **Classificação Automática:** Indica se o usuário está em magreza, saudável, sobrepeso ou obesidade (graus I, II e III).
- **Validação de Entrada:**
  - Aceita tanto **ponto (.)** quanto **vírgula (,)** como separadores decimais.
  - Impede entradas de texto ou caracteres especiais.
  - Impede cálculos com valores negativos ou zerados.
- **Alerta de Erros:** Feedback visual através de alertas nativos do sistema.

## Tecnologias Utilizadas

- **Linguagem:** Java (JDK 24)
- **Framework GUI:** JavaFX
- **Layout:** SceneBuilder
- **Arquitetura:** MVC (Model-View-Controller)

## Estrutura do Projeto

O código foi organizado visando alta coesão:
- `model/Person.java`: Contém a lógica de negócio (cálculo e regras de classificação).
- `controller/CalculatorController.java`: Gerencia a interação entre a tela e o modelo, além de tratar exceções.
- `screens/main-screen.fxml`: Arquivos FXML da interface gráfica.
