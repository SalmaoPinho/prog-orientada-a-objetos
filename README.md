# Programação Orientada a Objetos - Exercícios em Java

Este repositório contém uma coleção de exercícios práticos de **Programação Orientada a Objetos (POO)** desenvolvidos em Java. Os exercícios cobrem conceitos fundamentais da POO, incluindo classes, objetos, herança, encapsulamento e atributos estáticos.

## 📚 Estrutura do Projeto

O projeto está organizado em diferentes exercícios, cada um focando em conceitos específicos de POO:

### **ex0** - Classes Básicas e Atributos Estáticos
- **`Aluno.java`**: Implementação de classe com múltiplos construtores (básico, completo, com matrícula automática e construtor de cópia)
- **`Robo.java`**: Demonstração de atributos estáticos compartilhados entre instâncias
- **`Main.java`**: Programa principal que demonstra o uso das classes e manipulação de atributos estáticos

**Conceitos abordados:**
- Construtores sobrecarregados
- Atributos estáticos (`static`)
- Métodos getters e setters
- Compartilhamento de dados entre instâncias

### **ex1** - Herança e Polimorfismo
- **`Animal.java`**: Classe base com atributos e métodos comuns
- **`Cachorro.java`**, **`Gato.java`**, **`Galo.java`**, **`Gaviao.java`**: Classes derivadas que herdam de `Animal`

**Conceitos abordados:**
- Herança (`extends`)
- Sobrescrita de métodos
- Polimorfismo
- Atributos protegidos (`protected`)

### **ex2** - Modelagem de Objetos
- **`Supermodelo.java`**: Exercício de modelagem de classe

**Conceitos abordados:**
- Criação de classes personalizadas
- Encapsulamento de dados

### **ex3** - Encapsulamento e Estados
- **`Lampada.java`**: Classe que modela uma lâmpada com diferentes estados
- **`TestaLampada.java`**: Programa de teste

**Conceitos abordados:**
- Encapsulamento (`private`)
- Validação de dados
- Máquina de estados
- Métodos de acesso controlado

### **ex4** - Composição e Relacionamentos
- **`Funcionario.java`**: Classe com alocação automática de departamento
- **`Empresa.java`**: Gerenciamento de funcionários
- **`Carro.java`**: Modelagem de veículo
- **`TesteCarro.java`**: Programa de teste

**Conceitos abordados:**
- Composição de objetos
- Relacionamentos entre classes
- Padrão JavaBean (getters/setters)
- Método `toString()` sobrescrito

## 🚀 Como Executar

### Pré-requisitos
- **Java Development Kit (JDK)** 8 ou superior
- Um compilador Java (javac) ou IDE como Eclipse, IntelliJ IDEA ou VS Code

### Compilação e Execução

#### Usando linha de comando:

```bash
# Navegue até o diretório do exercício desejado
cd ex0

# Compile os arquivos Java
javac *.java

# Execute o programa principal
java Main
```

#### Usando uma IDE:
1. Importe o projeto na sua IDE
2. Navegue até o arquivo `Main.java` ou arquivo de teste do exercício
3. Execute o arquivo diretamente pela IDE

## 💡 Conceitos de POO Demonstrados

- ✅ **Encapsulamento**: Proteção de dados através de modificadores de acesso
- ✅ **Herança**: Reutilização de código através de hierarquia de classes
- ✅ **Polimorfismo**: Comportamentos diferentes para métodos com mesma assinatura
- ✅ **Abstração**: Modelagem de entidades do mundo real
- ✅ **Atributos e Métodos Estáticos**: Compartilhamento de dados entre instâncias
- ✅ **Construtores**: Inicialização de objetos de diferentes formas
- ✅ **Sobrescrita de Métodos**: Especialização de comportamentos

## 📖 Aprendizado

Este repositório é ideal para:
- Estudantes iniciantes em Programação Orientada a Objetos
- Prática de conceitos fundamentais de Java
- Revisão de princípios de POO
- Preparação para projetos mais complexos

## 🤝 Contribuições

Contribuições são bem-vindas! Sinta-se à vontade para:
- Reportar bugs
- Sugerir novos exercícios
- Melhorar a documentação
- Adicionar comentários explicativos ao código

## 📄 Licença

Este projeto está licenciado sob a licença MIT - veja o arquivo [LICENSE](LICENSE) para mais detalhes.

## ✍️ Autor

**Samuel Pinho** - [SalmaoPinho](https://github.com/SalmaoPinho)

---

⭐ Se este repositório foi útil para seus estudos, considere dar uma estrela!
