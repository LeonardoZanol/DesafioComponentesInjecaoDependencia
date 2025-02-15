# Desafio: Componentes e Injeção de Dependência  

Este repositório contém a solução do desafio proposto no **Capítulo: Componentes e Injeção de Dependência** do curso **Java Spring Professional** da [**DevSuperior**](https://devsuperior.com.br/).

## Descrição do Desafio  

O objetivo deste desafio é implementar um sistema para calcular o valor total de um pedido, considerando um desconto aplicado e o custo do frete. O cálculo segue as seguintes regras:  

### **Regras de Negócio**  
- O **valor total do pedido** é obtido aplicando o desconto sobre o valor básico e somando o frete.  
- O **valor do frete** varia conforme a tabela abaixo:  

| Valor Básico do Pedido | Frete |
|------------------------|--------|
| Menor que R$ 100,00   | R$ 20,00 |
| Entre R$ 100,00 e R$ 199,99 | R$ 12,00 |
| R$ 200,00 ou mais     | Grátis |

## **Exemplo de Saída**  

Entrada (código do pedido, valor básico e percentual de desconto):  

- **Exemplo 1:** Pedido código 1034, valor básico R$ 150,00, desconto 20%  
- **Exemplo 2:** Pedido código 2282, valor básico R$ 800,00, desconto 10%  
- **Exemplo 3:** Pedido código 1309, valor básico R$ 95,90, desconto 0% 

Saída esperada no console:

![image](https://github.com/user-attachments/assets/1bdc7d7c-79c6-4f15-99a4-df7338cbb018)

## **Tecnologias Utilizadas**  
- **Java 21**  
- **Spring Boot**  
- **Maven**  

## **Como Executar o Projeto** 
1. Clone o Repositório:
   ```sh
   git clone https://github.com/seu-usuario/desafio-injecao.git
   ```
2. Acesse a pasta do projeto:
   ```sh
   cd desafioinjecaodependencia
   ```
3. Execute a aplicação:
   ```sh
   mvn spring-boot:run
   ```
4. A saída será exibida no console conforme os exemplos acima.
