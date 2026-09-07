# Notifications

Serviço de notificações do projeto Saloon Platform.

## Visão Geral

O Notifications é responsável pelo envio de notificações para usuários e salões, incluindo confirmações de agendamento, lembretes e atualizações de pagamento.

## Porta

**5007**

## Funcionalidades

- Envio de e-mails
- Notificações push
- Lembretes de agendamento
- Confirmações de pagamento
- Notificações de cancelamento
- Consumo de mensagens do RabbitMQ

## Endpoints

| Método | Caminho | Descrição |
|--------|---------|-----------|
| POST | `/api/notifications` | Envia notificação |
| GET | `/api/notifications/{id}` | Busca notificação por ID |
| GET | `/api/notifications/user/{userId}` | Lista notificações do usuário |

## Tecnologias

- Spring Boot 4.1.1
- Spring Data JPA
- Spring AMQP (RabbitMQ)
- Flyway (migrações)
- MySQL
- OpenFeign
- Eureka Client
- Lombok
- Java 21

## Como Rodar

```bash
mvn clean package
java -jar target/notifications-0.0.1-SNAPSHOT.jar
```

## Filas RabbitMQ

- `booking.exchange` - Notificações de agendamento
- `payment.exchange` - Notificações de pagamento

## Integrações

- **Booking Service:** Notifica sobre agendamentos
- **Payment Service:** Notifica sobre pagamentos
- **User Service:** Obtém dados de contato
