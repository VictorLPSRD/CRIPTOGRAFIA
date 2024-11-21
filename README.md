# Projeto de Criptografia e Descriptografia em Java

Este projeto implementa um programa de linha de comando para criptografar e descriptografar textos utilizando o algoritmo AES (Advanced Encryption Standard). A interação é feita por meio de um menu simples e intuitivo.

## 📋 Funcionalidades

- **Criptografar texto:** Transforma um texto em uma string codificada usando AES e Base64.
- **Descriptografar texto:** Decodifica uma string criptografada de volta ao texto original.
- **Menu interativo:** Permite ao usuário escolher as operações e sair do programa quando desejar.

## 🛠️ Estrutura do Projeto

1. **Classe `Main`**
   - Responsável pela interface com o usuário.
   - Exibe o menu, recebe as entradas e chama os métodos de criptografia/descriptografia.

2. **Classe `CryptoUtil`**
   - Contém o método `encrypt` para criptografar textos.
   - Utiliza o algoritmo AES com uma chave estática de 16 caracteres.

3. **Classe `DescriptoUtil`**
   - Contém o método `decrypt` para descriptografar textos.
   - Decodifica strings criptografadas usando AES e Base64.

## 🧩 Pré-requisitos

- **Java JDK 8 ou superior.**
- Biblioteca padrão do Java para criptografia e codificação Base64.

## 🚀 Como Executar

1. Clone este repositório:
   ```bash
   git clone https://github.com/seu-usuario/projeto-criptografia.git
