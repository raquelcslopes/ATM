# ATM

Este projeto é uma simulação de um sistema de caixa eletrônico (ATM) em Java.

## Funcionalidades
- Gerenciamento de cartões
- Saque e depósito de valores
- Verificação de saldo
- Controle de permissões e exceções personalizadas

## Estrutura do Projeto
- `ATM.java`: Lógica principal do ATM
- `Card.java`: Representação de um cartão bancário
- `ATMException.java`: Exceção base para o sistema
- `NotEnoughFundsException.java`: Exceção para fundos insuficientes
- `NotEnoughPermissionsException.java`: Exceção para permissões insuficientes
- `Main.java`: Classe principal para execução do programa

## Como Executar
1. Compile todos os arquivos Java:
   ```sh
   javac src/*.java
   ```
2. Execute a classe principal:
   ```sh
   java -cp src Main
   ```

## Requisitos
- Java 8 ou superior

