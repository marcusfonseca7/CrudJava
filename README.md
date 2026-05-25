# CRUD em Java com Programação Orientada a Objetos

Projeto desenvolvido em **Java** com foco na prática de **Programação Orientada a Objetos (POO)** através da implementação de um sistema CRUD (*Create, Read, Update, Delete*).

Durante o desenvolvimento foram aplicados os **4 pilares da POO**: Encapsulamento, Herança, Abstração e Polimorfismo, utilizando classes abstratas, herança entre classes e sobrescrita de métodos.

---

## Objetivo do Projeto

Desenvolver conhecimentos em Java e reforçar a aplicação prática da Programação Orientada a Objetos por meio da construção de um sistema CRUD.

---

## Funcionalidades

✔ Cadastro de registros  
✔ Listagem de informações  
✔ Atualização de dados  
✔ Remoção de registros  
✔ Estrutura baseada em POO  
✔ Uso de herança e classes abstratas

---

## Conceitos de POO Aplicados

### Encapsulamento
Os atributos das classes foram definidos como privados, sendo acessados através de métodos `getters` e `setters`, garantindo maior controle dos dados.

### Abstração
A classe:

```java
Pessoa
```

foi criada como **abstrata**, servindo como modelo principal para outras classes do sistema.

### Herança

As classes:

```java
Programador
Cibersecurity
```

herdam atributos e comportamentos da classe:

```java
Pessoa
```

evitando repetição de código e promovendo reutilização.

### Polimorfismo

As classes filhas sobrescrevem o método:

```java
@Override
public String toString()
```

alterando a forma como as informações são exibidas, mesmo herdando comportamentos da classe mãe.

---

## Estrutura do Projeto

```bash
src/
│
├── Pessoa.java            # Classe abstrata principal
├── Programador.java       # Herda de Pessoa
├── Cibersecurity.java     # Herda de Pessoa
├── Menu.java              # Execução do sistema
├── CadastroPessoa.java    # Lógicas do Sistema
└── ...
```

---

## Tecnologias Utilizadas

- Java
- Programação Orientada a Objetos
- CRUD
- Scanner
- IntelliJ

---



## Melhorias Futuras

- [ ] Adicionar validações de entrada
- [ ] Refatorar código
- [ ] Melhorar tratamento de erros
- [ ] Implementar persistência de dados
- [ ] Adicionar banco de dados
- [ ] Criar interface gráfica
- [ ] Melhorar organização das classes

---

## Aprendizados

Durante o desenvolvimento deste projeto foi possível praticar:

- Estruturação de classes
- Herança
- Classes abstratas
- Sobrescrita de métodos
- Encapsulamento
- Organização de código em Java
- Lógica de CRUD
- Manipulação de entrada de dados

---

## Autor

Desenvolvido por **Marcus Vinicius**  
