Participo do 7daysOfCode do Alura.

## DayOne.
- Criar uma conta no IMDB para ter a chave de acesso ao serviço (apiKey), mas cuidado, essa chave não deve ser commitada no Github ou em outro repositório!
- Criar o código Java que executará uma requisição HTTP do tipo GET. Você pode usar o pacote java.net.http e as classes HttpRequest, HttpClient e HttpResponse, além da classe URI
- Executar a requisição e pegar a resposta (o JSON)
- Imprimir o corpo da resposta no console

Implementação adicional.
- Implementei o FeignClient do Spring Cloud para fazer requisições http para plataforma.
- Implementei um novo Controller para retornar o JSON recebido na API

## DayTwo

- A sua tarefa de hoje será parsear essa resposta. Em outras palavras, você vai extrair as informações desse JSON. Repare que o JSON possui um array de filmes, e cada filme possui vários atributos como id, título, etc.
- Sua tarefa será extrair o título do filme e a URL da imagem a partir da resposta JSON.
Existem várias maneiras de fazer isso e, neste momento, não se preocupe ainda em escrever um código elegante. Tente usar os métodos da classe java.lang.String como substring(), split() e replace(). Você também pode usar Regex (através das classes Matcher e Pattern do pacote java.util.regex) para encontrar uma string que siga um determinado padrão.
Com o resultado do parseamento, você deverá criar diferentes listas, cada uma com um atributo do filme. Uma lista com os títulos, outra com a URL da imagem e assim por diante.

Implementação adicional.
- Foi mapeado o recebimento em um novo objeto, e com a classe Stream retorno o que é solicitado via parametro, adicionando
valor default caso não seja passado nenhuma informacao no Controller. 