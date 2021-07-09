<img src="https://storage.googleapis.com/golden-wind/experts-club/capa-github.svg" />

# Consumindo serviços de forma elegante em sua API RESTful com Spring Cloud OpenFeign.

Nessa aula desenvolveremos uma API RESTful que irá consumir serviços HTTP de forma elegante, utilizando o Spring Cloud
OpenFeign. Explicaremos também a diferença de se utilizar RestTemplate e Feign para realizar essa comunicação com outros
serviços e como o Spring incorporou o Feign para dentro do seu universo.

Ao final da aula, teremos uma API que ao fornecer somente seu nome, email e cep, ela irá nos retornar informações como
seu logradouro, bairro, cidade e uf e também as informações(casos, suspeitas, mortes) a respeito da COVID-19 para o seu
estado.

## O que é?

O Feign é um projeto inspirado em Retrofit, JAXRS 2.0 e Websockets. É utilizado para fazer comunicações HTTP's com outros
serviços de forma fácil.

O Spring incorporou o Feign em sua stack, simplificando ainda mais a integração com a nossa aplicação. Com isso, podemos
reaproveitar todo as anotações que utilizamos para criar nossos RestControllers, como @GetMapping, @PathVariable,
entre outros...

## Tecnologias

- [Spring Boot](https://spring.io/projects/spring-boot)
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa)
- [Spring Cloud OpenFeign](https://spring.io/projects/spring-cloud-openfeign)
- [Lombok](https://projectlombok.org/)
- [H2 Database](https://www.h2database.com/html/quickstart.html)

## Funcionalidades

- Busca de endereços a partir do CEP
- Busca de informações da COVID-19 a partir do estado/UF

**Para testar todos os recursos da aplicação, utilize a collection do Postman abaixo:**
- [Postman Collection](https://www.getpostman.com/collections/0d3373477809b21f4ff9)

## Links utilizados em aula

- [Spring Initializr](https://start.spring.io/)
- [API Covid](https://covid19-brazil-api.vercel.app/api/report/v1/brazil/uf/RJ)
- [API Address](https://api.postmon.com.br/v1/cep/89160188)
