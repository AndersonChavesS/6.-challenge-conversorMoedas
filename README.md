# 💱 Conversor de Moedas em Java

Um projeto de conversor de moedas via console, que realiza conversões dinâmicas entre diferentes moedas usando a
API [ExchangeRate-API](https://www.exchangerate-api.com/). Desenvolvido em Java, com consumo de API, manipulação de JSON
via Gson, histórico de conversões e registros de data e hora.

---

## 📌 Funcionalidades

✅ Conversão dinâmica de moedas com dados atualizados da API  
✅ Menu interativo no console com múltiplas opções de conversão  
✅ Histórico de conversões realizadas na sessão  
✅ Registro de logs com data e hora de cada conversão usando `java.time`  
✅ Suporte para diversas moedas (USD, EUR, BRL, ARS, JPY, CAD, etc.)

---

## 📦 Estrutura de Pacotes

```
src/
 └── main
      └── java
           └── currencyconverter  
                 └── app/
                     └── CurrencyConverterApp.java
                 └── model/
                     └── ExchangeResponse.java
                 └── service/
                     └── CurrencyConverterService.java
                     └── ConversionHistory.java
                 └── util/
                     └── LoggerUtil.java
```

---

## 🔧 Tecnologias e Dependências

- **Java 17+**
- **Gson** (para manipulação de JSON)
- **HttpURLConnection** (requisições HTTP nativas)
- **java.time.LocalDateTime** (para logs com timestamp)

---

## 📥 Instalação e Execução

1️⃣ Clone o repositório:

```bash
git clone https://github.com/seuusuario/conversor-moedas-java.git
```

2️⃣ Navegue até o projeto:

```bash
cd conversor-moedas-java
```

3️⃣ Adicione sua **API Key** da [ExchangeRate-API](https://www.exchangerate-api.com/) no código:

```java
private static final String API_KEY = "SUA_API_KEY";
```

4️⃣ Compile e execute o projeto:

```bash
javac -cp ".;libs/gson-2.10.1.jar" src/**/*.java
java -cp ".;libs/gson-2.10.1.jar;src" app.CurrencyConverterApp
```

> 📌 *Certifique-se de ter o Gson adicionado no diretório `libs/`.*

---

## 💾 Histórico de Conversões

Durante a execução, as conversões realizadas são armazenadas em memória e exibidas via console na opção "Visualizar
histórico de conversões".

Exemplo:

```
[2025-05-05 14:33] 100.0 USD → 502.32 BRL
[2025-05-05 14:36] 250.0 EUR → 1345.78 ARS
```

---

## 📑 Conventional Commits

Este projeto segue o padrão **Conventional Commits**.  
Exemplos:

- `feat: adicionar funcionalidade de histórico de conversões`
- `fix: corrigir erro no cálculo de taxa de câmbio`
- `refactor: reorganizar estrutura de pacotes`
- `docs: atualizar instruções de execução no README`

---

## 📖 Licença

Este projeto está licenciado sob a licença MIT.

---

## ✨ Autor

Anderson Chaves  
[LinkedIn](https://www.linkedin.com/in/developer-anderson-chaves/) | [GitHub](https://github.com/AndersonChavesS)

---

